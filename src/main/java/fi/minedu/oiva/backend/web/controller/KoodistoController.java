package fi.minedu.oiva.backend.web.controller;

import fi.minedu.oiva.backend.entity.opintopolku.KoodistoKoodi;
import fi.minedu.oiva.backend.entity.opintopolku.Maakunta;
import fi.minedu.oiva.backend.entity.opintopolku.Organisaatio;
import fi.minedu.oiva.backend.security.annotations.OivaAccess_Public;
import fi.minedu.oiva.backend.service.KoodistoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import static fi.minedu.oiva.backend.util.AsyncUtil.async;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(
    value = "${api.url.prefix}" + KoodistoController.path,
    produces = { MediaType.APPLICATION_JSON_VALUE })
public class KoodistoController {

    public static final String path = "/koodistot";

    @Autowired
    private KoodistoService service;

    @OivaAccess_Public
    @RequestMapping(value = "/koodi/{koodisto}/{koodi}", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun koodin koodiston ja kooriarvon perusteella", value = "")
    public CompletableFuture<KoodistoKoodi> getKoodi(final @PathVariable String koodisto, final @PathVariable String koodi) {
        return async(() -> service.getKoodi(koodisto, koodi));
    }

    @OivaAccess_Public
    @RequestMapping(value = "/maakuntakunta", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun maakunnat kunnilla", value = "")
    public CompletableFuture<Collection<Maakunta>> getMaakuntaKunnat() {
        return async(service::getMaakuntaKunnat);
    }

    @OivaAccess_Public
    @RequestMapping(value = "/koulutustoimijat", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun koulutustoimijat", value = "")
    public CompletableFuture<Collection<Organisaatio>> getKoulutustoimijat() {
        return async(service::getKoulutustoimijat);
    }

    @OivaAccess_Public
    @RequestMapping(value = "/maakuntajarjestajat", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun maakunnat koulutuksenjärjestäjillä", value = "")
    public CompletableFuture<Collection<Maakunta>> getMaakuntaJarjestajat() {
        return async(service::getMaakuntaJarjestajat);
    }

    @OivaAccess_Public
    @RequestMapping(value = "/kunnat", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun kunnat", value = "")
    public CompletableFuture<Collection<KoodistoKoodi>> getKunnat() {
        return async(service::getKunnat);
    }

    @OivaAccess_Public
    @RequestMapping(value = "/kunnat/{koodi}", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun kunnan koodiarvon perusteela", value = "")
    public CompletableFuture<KoodistoKoodi> getKuntaByKoodi(final @PathVariable String koodiArvo) {
        return async(() -> service.getKunta(koodiArvo));
    }

    @OivaAccess_Public
    @RequestMapping(value = "/kielet", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun kielet", value = "")
    public CompletableFuture<Collection<KoodistoKoodi>> getKielet() {
        return async(service::getKielet);
    }

    @OivaAccess_Public
    @RequestMapping(value = "/kielet/{koodi}", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun kielen koodiarvon perusteela", value = "")
    public CompletableFuture<KoodistoKoodi> getKieliByKoodi(final @PathVariable String koodiArvo) {
        return async(() -> service.getKieli(koodiArvo));
    }

    @OivaAccess_Public
    @RequestMapping(value = "/opetuskielet", method = GET)
    @ApiOperation(notes = "Palauttaa opintopolun opetuskielet koodit", value = "")
    public CompletableFuture<Collection<KoodistoKoodi>> getOpetuskielet() {
        return async(service::getOpetuskielet);
    }
}
