package fi.minedu.oiva.backend.service;

import fi.minedu.oiva.backend.entity.opintopolku.KoodistoKoodi;
import fi.minedu.oiva.backend.entity.opintopolku.Maakunta;
import fi.minedu.oiva.backend.entity.opintopolku.Organisaatio;

import fi.minedu.oiva.backend.security.annotations.OivaAccess_Public;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class KoodistoService {

    @Autowired
    private OpintopolkuService opintopolkuService;

    @OivaAccess_Public
    public KoodistoKoodi getKoodi(final String koodisto, final String koodi) {
        return opintopolkuService.getKoodi(koodisto, koodi);
    }

    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getMaakuntaKunnat", key = "''")
    public List<Maakunta> getMaakuntaKunnat() {
        return opintopolkuService.getMaakuntaKunnat();
    }

    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getKoulutustoimijat", key = "''")
    public List<Organisaatio> getKoulutustoimijat() {
        return opintopolkuService.getKoulutustoimijat();
    }

    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getMaakuntaJarjestajat", key = "''")
    public List<Maakunta> getMaakuntaJarjestajat() {
        return opintopolkuService.getMaakuntaJarjestajat();
    }

    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getKunnat", key = "''")
    public List<KoodistoKoodi> getKunnat() {
        return opintopolkuService.getKunnatKoodit();
    }

    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getKunta")
    public KoodistoKoodi getKunta(final String koodi) {
        return opintopolkuService.getKuntaKoodi(koodi).orElseGet(null);
    }

    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getKielet", key = "''")
    public List<KoodistoKoodi> getKielet() {
        return opintopolkuService.getKieliKoodit();
    }

    @OivaAccess_Public
    @Cacheable(value = {"KoodistoService:getKieli"})
    public KoodistoKoodi getKieli(final String koodi) {
        final KoodistoKoodi kieliKoodisto = opintopolkuService.getKieliKoodi(koodi);

        // AM-308 fix usable until koodisto is fixed
        if(StringUtils.equalsIgnoreCase(kieliKoodisto.koodiArvo(), "SE")) {
            kieliKoodisto.getMetadataList().forEach(m -> m.setNimi("saame"));
        }
        return kieliKoodisto;
    }

    /**
     * Käytetään vain seuraavia opetuskieliä
     *  - suomi (koodiArvo: 1)
     *  - ruotsi (koodiArvo: 2)
     *  - saame (koodiArvi: 5)
     */
    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getOpetuskielet", key = "''")
    public List<KoodistoKoodi> getOpetuskielet() {
        return opintopolkuService.getOppilaitoksenOpetuskieliKoodit().stream()
            .filter(koodistoItem -> Arrays.asList("1", "2", "5").contains(koodistoItem.koodiArvo())).collect(Collectors.toList());
    }

    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getAluehallintovirastoKuntaMap", key = "''")
    public Map<String, KoodistoKoodi> getKuntaAluehallintovirastoMap() {
        final Map<String, KoodistoKoodi> map = new HashMap<>();
        opintopolkuService.getAlueHallintovirastoKoodit().stream().forEach(
            avi -> opintopolkuService.getKuntaKooditForAlueHallintovirasto(avi.koodiArvo()).stream().forEach(
            kunta -> map.put(kunta.koodiArvo(), avi)));
        return map;
    }

    @OivaAccess_Public
    @Cacheable(value = "KoodistoService:getKuntaMaakuntaMap", key = "''")
    public Map<String, KoodistoKoodi> getKuntaMaakuntaMap() {
        final Map<String, KoodistoKoodi> map = new HashMap<>();
        opintopolkuService.getMaakuntaKoodit().stream().forEach(
            maakunta -> opintopolkuService.getKuntaKooditForMaakunta(maakunta.koodiArvo()).stream().forEach(
            kunta -> map.put(kunta.koodiArvo(), maakunta)));
        return map;
    }
}
