package fi.minedu.oiva.backend.core.service;

import fi.minedu.oiva.backend.model.entity.oiva.Lupa;
import fi.minedu.oiva.backend.model.entity.oiva.Maarays;
import fi.minedu.oiva.backend.model.entity.opintopolku.Organisaatio;
import fi.minedu.oiva.backend.core.util.With;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

@Service
public class OivaCacheService extends CacheService {

    private final Logger logger = LoggerFactory.getLogger(OivaCacheService.class);

    @Autowired
    private LupaService lupaService;

    @Autowired
    private KoodistoService koodistoService;

    /**
     * Flush and pre-populate cache
     * Invoker is responsible checking security context
     *
     * @return duration in millseconds
     */
    @Override
    public long refreshCache(final boolean retainSessions) {
        flushCache(retainSessions);

        final long startTime = System.currentTimeMillis();

        logger.info("Cache refresh requested");
        koodistoService.getMaakuntaKunnat();
        koodistoService.getKoulutustoimijat();
        koodistoService.getMaakuntaJarjestajat();
        koodistoService.getKunnat();
        koodistoService.getKielet();
        koodistoService.getOpetuskielet();
        koodistoService.getKuntaAluehallintovirastoMap();
        koodistoService.getKuntaMaakuntaMap();
        lupaService.getAll(With.all).stream().forEach(lupa ->
            lupaService.getByUuid(lupa.getUUIDValue(), With.all));
        refreshKoulutus(false);

        final long duration = System.currentTimeMillis() - startTime;
        logger.info("Cache refresh finished in {}ms", duration);
        return duration;
    }

    /**
     * Clear and pre-populate specific lupa related cache
     *
     * @param uuid Lupa's uuid
     * @return Duration
     */
    public long refreshLupa(final String uuid) {
        final long startTime = System.currentTimeMillis();

        final Set<String> cacheKeys = new HashSet<>();
        final Function<String, Optional<Lupa>> getLupa = byUuid -> lupaService.getByUuid(byUuid, With.all);

        final BiFunction<Class<?>, String, String> cacheNameBuilder = (cacheBase, cacheSuffix) ->
            cacheBase.getSimpleName() + (StringUtils.isNotBlank(cacheSuffix) ? ":" + cacheSuffix : "");

        final BiConsumer<String, String> addKey = (cacheNameSuffix, key) -> cacheKeys.add(cacheNameSuffix + ":\"" + key + "\"");

        final BiConsumer<String, String> addOpintopolkuKey = (cacheNameSuffix, cacheKey) ->
            addKey.accept(cacheNameBuilder.apply(OpintopolkuService.class, cacheNameSuffix), cacheKey);

        final BiConsumer<String, String> addOrganisaatioKey = (cacheNameSuffix, cacheKey) ->
            addKey.accept(cacheNameBuilder.apply(OrganisaatioService.class, cacheNameSuffix), cacheKey);

        final Consumer<Optional<Organisaatio>> organisaatioKeys = organisaatioOpt -> organisaatioOpt.ifPresent(organisaatio -> {
            addOpintopolkuKey.accept("", organisaatio.oid());
            organisaatio.getKuntaKoodiOpt().ifPresent(kuntaKoodi -> {
                addOpintopolkuKey.accept("", kuntaKoodi.koodiUri());
                addOpintopolkuKey.accept("", "/relaatio/sisaltyy-alakoodit/" + kuntaKoodi.koodiUri());
            });
            organisaatio.getMaakuntaKoodiOpt().ifPresent(maakuntaKoodi -> addOpintopolkuKey.accept("", maakuntaKoodi.koodiUri()));
            addOrganisaatioKey.accept("getWithLocation", organisaatio.oid());
        });
        final Consumer<Maarays> maaraysKeys = maarays -> {
            addOpintopolkuKey.accept("", maarays.koodiUri());
            addOpintopolkuKey.accept("", "/relaatio/sisaltyy-alakoodit/" + maarays.koodiUri());
            Optional.ofNullable(maarays.getKoodistoversio()).ifPresent(versio -> addOpintopolkuKey.accept("", maarays.koodiUri() + ":" + versio));
        };
        final Consumer<Collection<Maarays>> maarayksetKeys = maaraykset -> {
            if(null != maaraykset) maaraykset.stream().forEach(maarays -> {
                maaraysKeys.accept(maarays);
                Optional.ofNullable(maarays.getAliMaaraykset()).ifPresent(alimaaraykset -> alimaaraykset.stream().forEach(maaraysKeys::accept));
            });
        };

        // collect cache keys
        getLupa.apply(uuid).ifPresent(lupa -> {
            organisaatioKeys.accept(lupa.getJarjestajaOpt());
            maarayksetKeys.accept(lupa.getMaaraykset());
        });

        // delete cache keys
        flushCacheKeys(cacheKeys);

        // refresh lupa
        getLupa.apply(uuid);

        final long duration = System.currentTimeMillis() - startTime;
        logger.info("Lupa {} cache refreshed in {}ms", uuid, duration);
        return duration;
    }

    /**
     * Clear and pre-populate koulutus koodisto related cache
     *
     * @return Duration
     */
    public long refreshKoulutus(boolean deleteExisting) {
        final long startTime = System.currentTimeMillis();
        if(deleteExisting) {
            final List<String> cacheKeys = new ArrayList<>();
            final BiConsumer<String, String> cacheKey = (cacheName, key) -> cacheKeys.add(cacheName + ":\"" + key + "\"");

            cacheKey.accept("KoodistoService:getKoulutusalat", "");
            cacheKey.accept("KoodistoService:getKoulutusToKoulutusalaRelation", "");
            koodistoService.getKoulutusalat().stream().forEach(koulutusala -> {
                cacheKey.accept("KoodistoService:getKoulutusala", koulutusala.koodiArvo());
                cacheKey.accept("KoodistoService:getKoulutusalaKoulutukset", koulutusala.koodiArvo());
            });

            cacheKey.accept("KoodistoService:getKoulutustyypit", "");
            cacheKey.accept("KoodistoService:getKoulutusToKoulutustyyppiRelation", "");
            koodistoService.getKoulutustyypit().stream().forEach(koulutustyyppi -> {
                cacheKey.accept("KoodistoService:getKoulutustyyppi", koulutustyyppi.koodiArvo());
                cacheKey.accept("KoodistoService:getKoulutustyyppiKoulutukset", koulutustyyppi.koodiArvo());
            });

            cacheKey.accept("KoodistoService:getAmmatillinenTutkinnot", "");

            // delete cache keys
            flushCacheKeys(cacheKeys);
        }

        // refresh
        koodistoService.getKoulutusToKoulutusalaRelation();
        koodistoService.getKoulutusalat().stream().forEach(koulutusala -> {
            koodistoService.getKoulutusala(koulutusala.koodiArvo());
            koodistoService.getKoulutusalaKoulutukset(koulutusala.koodiArvo());
        });

        koodistoService.getKoulutusToKoulutustyyppiRelation();
        koodistoService.getKoulutustyypit().stream().forEach(koulutustyyppi -> {
            koodistoService.getKoulutustyyppi(koulutustyyppi.koodiArvo());
            koodistoService.getKoulutustyyppiKoulutukset(koulutustyyppi.koodiArvo());
        });

        koodistoService.getAmmatillinenTutkinnot();

        final long duration = System.currentTimeMillis() - startTime;
        logger.info("Koulutus cache refreshed in {}ms", duration);
        return duration;
    }
}