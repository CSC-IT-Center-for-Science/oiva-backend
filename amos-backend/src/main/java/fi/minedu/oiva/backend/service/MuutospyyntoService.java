package fi.minedu.oiva.backend.service;

import fi.minedu.oiva.backend.entity.oiva.Kohde;
import fi.minedu.oiva.backend.entity.oiva.Liite;
import fi.minedu.oiva.backend.entity.oiva.Maaraystyyppi;
import fi.minedu.oiva.backend.entity.oiva.Muutos;
import fi.minedu.oiva.backend.entity.oiva.Muutospyynto;
import fi.minedu.oiva.backend.entity.oiva.Paatoskierros;
import fi.minedu.oiva.backend.jooq.tables.pojos.MuutosLiite;
import fi.minedu.oiva.backend.jooq.tables.pojos.MuutospyyntoLiite;
import fi.minedu.oiva.backend.jooq.tables.records.MuutosLiiteRecord;
import fi.minedu.oiva.backend.jooq.tables.records.MuutosRecord;
import fi.minedu.oiva.backend.jooq.tables.records.MuutospyyntoLiiteRecord;
import fi.minedu.oiva.backend.jooq.tables.records.MuutospyyntoRecord;
import fi.minedu.oiva.backend.util.ValidationUtils;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import static fi.minedu.oiva.backend.jooq.Tables.KOHDE;
import static fi.minedu.oiva.backend.jooq.Tables.LIITE;
import static fi.minedu.oiva.backend.jooq.Tables.LUPA;
import static fi.minedu.oiva.backend.jooq.Tables.MAARAYSTYYPPI;
import static fi.minedu.oiva.backend.jooq.Tables.MUUTOS;
import static fi.minedu.oiva.backend.jooq.Tables.MUUTOSPYYNTO;
import static fi.minedu.oiva.backend.jooq.Tables.MUUTOSPYYNTO_LIITE;
import static fi.minedu.oiva.backend.jooq.Tables.MUUTOS_LIITE;
import static fi.minedu.oiva.backend.jooq.Tables.PAATOSKIERROS;
import static fi.minedu.oiva.backend.util.ValidationUtils.validation;

@Service
public class MuutospyyntoService {

    // Default value for paatokierros
    private static final Long paatoskierrosDefaultId = 19L;
    private Logger logger = LoggerFactory.getLogger(getClass());

    private final DSLContext dsl;

    private final AuthService authService;
    // TODO: lisää autentikointitarkistukset

    private final OrganisaatioService organisaatioService;
    private final LiiteService liiteService;

    @Autowired
    public MuutospyyntoService(DSLContext dsl, AuthService authService, OrganisaatioService organisaatioService,
                               LiiteService liiteService) {
        this.dsl = dsl;
        this.authService = authService;
        this.organisaatioService = organisaatioService;
        this.liiteService = liiteService;
    }

    public enum Muutospyyntotila {
        LUONNOS,            // KJ:n tekemä hakemus
        AVOIN,              // KJ lähettänyt hakemuksen eteenpäin
        VALMISTELUSSA,      // Esittelijä ottanut valmisteluun
        TAYDENNETTAVA,      // Esittelijä palauttanut täydennettäväksi
        PAATETTY,           // Valmis allekirjoitettu lupa
        PASSIVOITU;         // Lupa poistettu
    }

    public enum MuutosPaatostila {
        AVOIN,              // Esittelijä ei ole tehnyt vielä päätöstä
        HYVAKSYTTY,         // Esittelijä on hyväksynyt muutoksen
        HYLATTY,            // Esittelijä on hylännyt muutoksen
        TAYDENNETTAVA,      // Esittelijä palauttaa muutoksen täydennettäväksi
        HYV_MUUTETTUNA,     // Esittelijä on hyväksynyt muutoksen muutettuna
        PASSIVOITU;         // Muutos on muusta syystä poistettu
    }

    // Muutospyyntölistaus (hakemukset) esittelijälle
    public Collection<Muutospyynto> getMuutospyynnot(Muutospyyntotila tila) {

        return dsl.select(MUUTOSPYYNTO.HAKUPVM, MUUTOSPYYNTO.VOIMASSALOPPUPVM, MUUTOSPYYNTO.VOIMASSAALKUPVM,
                MUUTOSPYYNTO.PAATOSKIERROS_ID, MUUTOSPYYNTO.TILA, MUUTOSPYYNTO.UUID,
                MUUTOSPYYNTO.JARJESTAJA_YTUNNUS, MUUTOSPYYNTO.LUOJA, MUUTOSPYYNTO.LUONTIPVM,
                MUUTOSPYYNTO.PAIVITTAJA, MUUTOSPYYNTO.PAIVITYSPVM, LUPA.DIAARINUMERO, MUUTOSPYYNTO.ID,
                LUPA.JARJESTAJA_OID, LUPA.UUID.as("lupa_uuid"))
                .from(MUUTOSPYYNTO, LUPA)
                .where((MUUTOSPYYNTO.TILA.eq(tila.toString())))
                .and(MUUTOSPYYNTO.LUPA_ID.eq(LUPA.ID))
                .orderBy(MUUTOSPYYNTO.HAKUPVM).fetchInto(Muutospyynto.class)
                .stream()
                .map(muutospyynto -> with(muutospyynto, "esittelija"))
                .filter(Optional::isPresent).map(Optional::get)
                .collect(Collectors.toList());
    }

    // Muutospyyntölistaus (hakemukset) koulutuksen järjestäjälle
    public Collection<Muutospyynto> getByYtunnus(String ytunnus) {

        return dsl.select(MUUTOSPYYNTO.HAKUPVM, MUUTOSPYYNTO.VOIMASSALOPPUPVM, MUUTOSPYYNTO.VOIMASSAALKUPVM,
                MUUTOSPYYNTO.PAATOSKIERROS_ID, MUUTOSPYYNTO.TILA, MUUTOSPYYNTO.UUID,
                MUUTOSPYYNTO.JARJESTAJA_YTUNNUS, MUUTOSPYYNTO.LUOJA, MUUTOSPYYNTO.LUONTIPVM,
                MUUTOSPYYNTO.PAIVITTAJA, MUUTOSPYYNTO.PAIVITYSPVM, LUPA.DIAARINUMERO, MUUTOSPYYNTO.ID,
                LUPA.UUID.as("lupa_uuid"))
                .from(MUUTOSPYYNTO, LUPA)
                .where(MUUTOSPYYNTO.JARJESTAJA_YTUNNUS.eq(ytunnus))
                .and(MUUTOSPYYNTO.LUPA_ID.eq(LUPA.ID))
                .orderBy(MUUTOSPYYNTO.HAKUPVM).fetchInto(Muutospyynto.class)
                .stream()
                .map(muutospyynto -> with(muutospyynto, "listaus"))
                .filter(Optional::isPresent).map(Optional::get)
                .collect(Collectors.toList());
    }

    // Vaihtaa muutospyynnön tilan
    public Optional<UUID> changeTila(final String uuid, Muutospyyntotila tila) {
        try {
            final Optional<MuutospyyntoRecord> muutospyyntoOpt =
                    Optional.ofNullable(dsl.fetchOne(MUUTOSPYYNTO, MUUTOSPYYNTO.UUID.equal(UUID.fromString(uuid))));
            if (muutospyyntoOpt.isPresent()) {
                MuutospyyntoRecord mp = muutospyyntoOpt.get();
                mp.setTila(tila.name());
                dsl.executeUpdate(mp);
                return Optional.ofNullable(muutospyyntoOpt.get().getUuid());
            }
            return Optional.empty();
        } catch (Exception e) {
            logger.error("Failed to change muutospyyntotila!", e);
            return Optional.empty();
        }
    }

    // VALIDOINNIT
    public boolean validate(Muutospyynto muutospyynto) {
        return ValidationUtils.validate(
                validation(muutospyynto.getTila(), "Muutospyynto tila is missing")
        ) && Optional.ofNullable(muutospyynto.getLiitteet())
                .map(liitteet -> liitteet.stream().allMatch(this::validate)).orElse(true) &&
                Optional.ofNullable(muutospyynto.getMuutokset())
                        .map(muutokset -> muutokset.stream().allMatch(this::validate)).orElse(true);
    }

    private boolean validate(Muutos muutos) {
        return ValidationUtils.validate(
                validation(muutos.getKoodiarvo(), "Muutos: koodiarvo is missing"),
                validation(muutos.getKoodisto(), "Muutos: koodisto is missing")
        ) && Optional.ofNullable(muutos.getLiitteet()).map(liitteet -> liitteet.stream().allMatch(this::validate))
                .orElse(true);
    }

    private boolean validate(Liite liite) {
        return ValidationUtils.validate(
                validation(liite.getTyyppi(), "Liite: tyyppi is missing"),
                validation(liite.getKieli(), "Liite: kieli is missing")
        );
    }

    // hakee yksittäinen muutospyynnön perusteluineen uuid:llä
    public Optional<Muutospyynto> getByUuid(String uuid) {
        return dsl.select(MUUTOSPYYNTO.fields()).from(MUUTOSPYYNTO)
                .where(MUUTOSPYYNTO.UUID.equal(UUID.fromString(uuid))).fetchOptionalInto(Muutospyynto.class)
                .map(muutospyynto -> with(muutospyynto, "yksi"))
                .filter(Optional::isPresent).map(Optional::get);
    }

    // Hakee muutospyyntöön liittyvät muutokset
    public Collection<Muutos> getByMuutospyyntoUuid(String muutospyynto_uuid) {
        Optional<Muutospyynto> muutospyyntoOpt = dsl.select(MUUTOSPYYNTO.ID).from(MUUTOSPYYNTO)
                .where(MUUTOSPYYNTO.UUID.equal(UUID.fromString(muutospyynto_uuid)))
                .fetchOptionalInto(Muutospyynto.class);
        if (!muutospyyntoOpt.isPresent()) {
            return Collections.emptyList();
        }
        return getByMuutospyyntoId(muutospyyntoOpt.get().getId());
    }

    // Hakee yksittäisen muutoksen
    public Optional<Muutos> getMuutosByUuId(String uuid) {
        return dsl.select(MUUTOS.fields()).from(MUUTOS)
                .where(MUUTOS.UUID.eq(UUID.fromString(uuid))).fetchOptionalInto(Muutos.class);
    }

    @Transactional
    public Optional<UUID> save(final Muutospyynto muutospyynto, final Map<String, MultipartFile> fileMap) {
        logger.debug("Save muutospyynto: {}", muutospyynto.toString());
        try {
            Long paatoskierrosId = getPaatoskierrosId(muutospyynto);
            return createMuutospyynto(muutospyynto, paatoskierrosId, fileMap);
        } catch (Exception e) {
            throw new DataAccessException("Failed to save muutospyynto!", e);
        }
    }

    @Transactional
    public Optional<UUID> update(final Muutospyynto muutospyynto, final Map<String, MultipartFile> fileMap) {
        logger.debug("Update muutospyynto: {}", muutospyynto.toString());
        try {
            return updateMuutospyynto(muutospyynto, fileMap);
        } catch (Exception e) {
            throw new DataAccessException("Failed to update muutospyynto!", e);
        }
    }

    protected Optional<Muutospyynto> with(final Muutospyynto muutospyynto, String reqs) {
        if (reqs.equals("listaus")) {
            withPaatoskierros(muutospyynto);
        }
        if (reqs.equals("yksi")) {
            withLiitteet(muutospyynto);
            withMuutokset(muutospyynto);
            withPaatoskierros(muutospyynto);
            withLupaUuid(muutospyynto);
        }
        if (reqs.equals("esittelija")) {
            withLiitteet(muutospyynto);
            withMuutokset(muutospyynto);
            withPaatoskierros(muutospyynto);
            withOrganization(muutospyynto);
        }
        return Optional.ofNullable(muutospyynto);
    }

    private void withLiitteet(Muutospyynto muutospyynto) {
        Optional.ofNullable(muutospyynto)
                .ifPresent(m -> getMuutospyyntoLiitteet(m.getId()).ifPresent(m::setLiitteet));
    }

    private Optional<Collection<Liite>> getMuutospyyntoLiitteet(Long id) {
        return Optional.ofNullable(
                dsl.select(LIITE.fields()).from(MUUTOSPYYNTO_LIITE).leftJoin(LIITE)
                        .on(MUUTOSPYYNTO_LIITE.LIITE_ID.eq(LIITE.ID)).where(MUUTOSPYYNTO_LIITE.MUUTOSPYYNTO_ID.eq(id))
                        .fetchInto(Liite.class)

        );
    }

    private void withLupaUuid(final Muutospyynto muutospyynto) {
        Optional.ofNullable(muutospyynto)
                .ifPresent(m -> getLupaUuid(m.getLupaId()).ifPresent(m::setLupaUuid));
    }

    private void withPaatoskierros(final Muutospyynto muutospyynto) {
        Optional.ofNullable(muutospyynto)
                .ifPresent(m -> getPaatoskierrosByMuutospyynto(m.getPaatoskierrosId())
                        .ifPresent(m::setPaatoskierros));
    }

    private Optional<String> getLupaUuid(long id) {
        return dsl.select(LUPA.UUID).from(LUPA)
                .where(LUPA.ID.eq(id)).fetchOptionalInto(String.class);
    }

    private Optional<Long> getKohdeId(UUID uuid) {
        return dsl.select(KOHDE.ID).from(KOHDE)
                .where(KOHDE.UUID.equal(uuid)).fetchOptionalInto(Long.class);
    }

    private Optional<Long> getPaatoskierrosId(UUID uuid) {
        return dsl.select(PAATOSKIERROS.ID).from(PAATOSKIERROS)
                .where(PAATOSKIERROS.UUID.equal(uuid)).fetchOptionalInto(Long.class);
    }

    private Optional<Long> getLupaId(String uuid) {
        return dsl.select(LUPA.ID).from(LUPA)
                .where(LUPA.UUID.equal(UUID.fromString(uuid))).fetchOptionalInto(Long.class);
    }

    private Optional<Long> getMaaraystyyppiId(UUID uuid) {
        return dsl.select(MAARAYSTYYPPI.ID).from(MAARAYSTYYPPI)
                .where(MAARAYSTYYPPI.UUID.equal(uuid)).fetchOptionalInto(Long.class);
    }

    private Optional<Paatoskierros> getPaatoskierrosByMuutospyynto(long id) {
        return dsl.select(PAATOSKIERROS.fields()).from(PAATOSKIERROS)
                .where(PAATOSKIERROS.ID.eq(id)).fetchOptionalInto(Paatoskierros.class);
    }

    // hakee yksittäinen muutospyynnön perusteluineen
    private Optional<Muutospyynto> getById(long id) {
        return dsl.select(MUUTOSPYYNTO.fields()).from(MUUTOSPYYNTO)
                .where(MUUTOSPYYNTO.ID.eq(id)).fetchOptionalInto(Muutospyynto.class)
                .map(muutospyynto -> with(muutospyynto, "yksi"))
                .filter(Optional::isPresent).map(Optional::get);
    }

    private void withMuutokset(final Muutospyynto muutospyynto) {
        Optional.ofNullable(muutospyynto)
                .ifPresent(m -> m.setMuutokset(getByMuutospyyntoId(m.getId())));
    }

    private void withOrganization(final Muutospyynto muutospyynto) {
        Optional.ofNullable(muutospyynto)
                .ifPresent(m -> organisaatioService.getWithLocation(m.getJarjestajaYtunnus())
                        .ifPresent(m::setJarjestaja));
    }

    // Hakee muutospyyntöön liittyvät muutokset
    private Collection<Muutos> getByMuutospyyntoId(long muutospyynto_id) {
        return dsl.select(MUUTOS.fields()).from(MUUTOS)
                .where(MUUTOS.MUUTOSPYYNTO_ID.eq(muutospyynto_id))
                .fetchInto(Muutos.class)
                .stream()
                .map(this::withAll)
                .filter(Optional::isPresent).map(Optional::get)
                .collect(Collectors.toList());
    }

    private Optional<Muutos> withAll(final Muutos muutos) {
        withKohde(muutos);
        withMaaraystyyppi(muutos);
        withLiitteet(muutos);
        return Optional.ofNullable(muutos);
    }

    private void withLiitteet(Muutos muutos) {
        Optional.ofNullable(muutos)
                .ifPresent(m -> getMuutosLiitteet(m.getId())
                        .ifPresent(m::setLiitteet));
    }

    private Optional<Collection<Liite>> getMuutosLiitteet(Long id) {
        return Optional.ofNullable(
                dsl.select(LIITE.fields()).from(MUUTOS_LIITE).leftJoin(LIITE)
                        .on(MUUTOS_LIITE.LIITE_ID.eq(LIITE.ID)).where(MUUTOS_LIITE.MUUTOS_ID.eq(id))
                        .fetchInto(Liite.class)

        );
    }

    private void withKohde(final Muutos muutos) {
        Optional.ofNullable(muutos)
                .ifPresent(m -> getKohdeByMuutospyynto(m.getKohdeId()).ifPresent(m::setKohde));
    }

    private Optional<Kohde> getKohdeByMuutospyynto(long id) {
        return dsl.select(KOHDE.fields()).from(KOHDE)
                .where(KOHDE.ID.eq(id)).fetchOptionalInto(Kohde.class);
    }

    private void withMaaraystyyppi(final Muutos muutos) {
        Optional.ofNullable(muutos)
                .ifPresent(m -> getMaaraystyyppiByMuutospyynto(m.getMaaraystyyppiId())
                        .ifPresent(m::setMaaraystyyppi));
    }

    private Optional<Maaraystyyppi> getMaaraystyyppiByMuutospyynto(long id) {
        return dsl.select(MAARAYSTYYPPI.fields()).from(MAARAYSTYYPPI)
                .where(MAARAYSTYYPPI.ID.eq(id)).fetchOptionalInto(Maaraystyyppi.class);
    }

    private Long getPaatoskierrosId(Muutospyynto muutospyynto) {
        if (muutospyynto.getPaatoskierros() == null) {
            // use default
            return paatoskierrosDefaultId;
        }
        return getPaatoskierrosId(muutospyynto.getPaatoskierros().getUuid())
                .orElse(paatoskierrosDefaultId);
    }

    private Optional<UUID> updateMuutospyynto(Muutospyynto muutospyynto, Map<String, MultipartFile> fileMap) {
        final Optional<MuutospyyntoRecord> muutospyyntoRecordOpt =
                Optional.ofNullable(dsl.newRecord(MUUTOSPYYNTO, muutospyynto));
        return muutospyyntoRecordOpt.map(muutospyyntoRecord -> {
            Optional<Muutospyynto> updatethis = getByUuid(muutospyynto.getUuid().toString());
            if (!updatethis.isPresent()) {
                return null;
            }
            MuutospyyntoRecord muutospyyntoRecordUp = dsl.newRecord(MUUTOSPYYNTO, updatethis.get());
            muutospyyntoRecordUp.setPaivittaja(authService.getUsername());
            muutospyyntoRecordUp.setPaivityspvm(Timestamp.from(Instant.now()));
            dsl.executeUpdate(muutospyyntoRecordUp);
            deleteFromExisting(muutospyynto.getLiitteet());
            createMuutospyyntoLiitteet(muutospyynto, fileMap, muutospyyntoRecordUp.getId());
            saveMuutokset(muutospyynto, muutospyyntoRecordUp.getId(), fileMap);

            return muutospyynto.getUuid();
        });
    }

    private Optional<UUID> createMuutospyynto(Muutospyynto muutospyynto, Long paatoskierrosId,
                                              Map<String, MultipartFile> fileMap) {
        final Optional<MuutospyyntoRecord> muutospyyntoRecordOpt =
                Optional.ofNullable(dsl.newRecord(MUUTOSPYYNTO, muutospyynto));
        return muutospyyntoRecordOpt.map(muutospyyntoRecord -> {
            muutospyyntoRecord.setLuoja(authService.getUsername());
            muutospyyntoRecord.setLuontipvm(Timestamp.from(Instant.now()));
            muutospyyntoRecord.setLupaId(getLupaId(muutospyynto.getLupaUuid()).orElse(null));
            muutospyyntoRecord.setPaatoskierrosId(paatoskierrosId);
            logger.debug("Create muutospyynto: " + muutospyyntoRecord.toString());
            muutospyyntoRecord.store();
            createMuutospyyntoLiitteet(muutospyynto, fileMap, muutospyyntoRecord.getId());
            saveMuutokset(muutospyynto, muutospyyntoRecord.getId(), fileMap);

            Optional<Muutospyynto> ready = getById(muutospyyntoRecord.getId());
            return ready.map(Muutospyynto::getUuid).orElse(null);
        });
    }

    private void createMuutospyyntoLiitteet(Muutospyynto muutospyynto, Map<String, MultipartFile> fileMap, Long muutospyyntoId) {
        Optional.ofNullable(muutospyynto.getLiitteet())
                .ifPresent(liitteet -> liitteet.forEach(liite -> Optional.ofNullable(fileMap.get(liite.getTiedostoId()))
                        .ifPresent(file -> {
                            // Remove old if exists and replace it with new one
                            liiteService.delete(liite);
                            liiteService.save(file, liite)
                                    .ifPresent(l -> {
                                        final MuutospyyntoLiite link = new MuutospyyntoLiite();
                                        link.setLiiteId(l.getId());
                                        link.setMuutospyyntoId(muutospyyntoId);
                                        final MuutospyyntoLiiteRecord muutospyyntoLiiteRecord =
                                                dsl.newRecord(MUUTOSPYYNTO_LIITE, link);
                                        muutospyyntoLiiteRecord.store();
                                    });
                        })
                ));
    }

    private void saveMuutokset(Muutospyynto muutospyynto, Long id, Map<String, MultipartFile> fileMap) {
        for (Muutos muutos : muutospyynto.getMuutokset()) {
            if (muutos.getUuid() == null) {
                createMuutos(id, muutos, fileMap);
                continue;
            }
            updateMuutos(id, muutos, fileMap);
        }
    }

    private void updateMuutos(Long muutosPyyntoId, Muutos muutos, Map<String, MultipartFile> fileMap) {
        final Optional<MuutosRecord> muutosRecordOpt = Optional.ofNullable(dsl.newRecord(MUUTOS, muutos));
        if (muutosRecordOpt.isPresent()) {
            Optional<Muutos> updatethis = getMuutosByUuId(muutos.getUuid().toString());
            if (!updatethis.isPresent()) {
                return;
            }
            MuutosRecord muutosRecordUp = dsl.newRecord(MUUTOS, updatethis.get());
            muutosRecordUp.setLuoja(authService.getUsername());
            muutosRecordUp.setPaivityspvm(Timestamp.from(Instant.now()));
            muutosRecordUp.setMuutospyyntoId(muutosPyyntoId);
            muutosRecordUp.setKohdeId(getKohdeId(muutos.getKohde().getUuid()).orElse(null));
            dsl.executeUpdate(muutosRecordUp);
            deleteFromExisting(muutos.getLiitteet());
            createMuutosLiitteet(muutos, fileMap, muutosRecordUp.getId());
        }
    }

    private void createMuutos(Long muutosPyyntoId, Muutos muutos, Map<String, MultipartFile> fileMap) {
        final Optional<MuutosRecord> muutosRecordOpt = Optional.ofNullable(dsl.newRecord(MUUTOS, muutos));
        muutosRecordOpt.ifPresent(muutosRecord -> {
            muutosRecord.setLuoja(authService.getUsername());
            muutosRecord.setLuontipvm(Timestamp.from(Instant.now()));
            muutosRecord.setMuutospyyntoId(muutosPyyntoId);
            muutosRecord.setKohdeId(getKohdeId(muutos.getKohde().getUuid()).orElse(null));
            muutosRecord.setMaaraystyyppiId(getMaaraystyyppiId(muutos.getMaaraystyyppi().getUuid()).orElse(null));
            muutosRecord.store();
            createMuutosLiitteet(muutos, fileMap, muutosRecord.getId());
        });
    }

    private void createMuutosLiitteet(Muutos muutos, Map<String, MultipartFile> fileMap, Long muutosId) {
        Optional.ofNullable(muutos.getLiitteet())
                .ifPresent(liitteet -> liitteet.forEach(liite -> Optional.ofNullable(fileMap.get(liite.getTiedostoId()))
                        .ifPresent(file -> {
                            // Remove old if exists and replace it with new one.
                            liiteService.delete(liite);
                            liiteService.save(file, liite)
                                    .ifPresent(l -> {
                                        final MuutosLiite link = new MuutosLiite();
                                        link.setLiiteId(l.getId());
                                        link.setMuutosId(muutosId);
                                        final MuutosLiiteRecord muutosLiiteRecord = dsl.newRecord(MUUTOS_LIITE, link);
                                        muutosLiiteRecord.store();
                                    });
                        })
                ));
    }

    private void deleteFromExisting(Collection<Liite> liitteet) {
        Optional.ofNullable(liitteet).ifPresent(list -> list.stream()
                .filter(Liite::isRemoved)
                .forEach(liiteService::delete));
    }
}