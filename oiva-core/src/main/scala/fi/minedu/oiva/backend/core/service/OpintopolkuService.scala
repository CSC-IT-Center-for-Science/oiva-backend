package fi.minedu.oiva.backend.core.service

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Optional
import java.util.concurrent.CompletionStage
import javax.annotation.PostConstruct
import fi.minedu.oiva.backend.core.cache.CacheAware
import fi.minedu.oiva.backend.core.cas.CASClient
import fi.minedu.oiva.backend.model.entity.opintopolku._

import scala.collection.JavaConversions._
import com.fasterxml.jackson.core.`type`.TypeReference
import dispatch.Defaults._
import dispatch._
import fi.minedu.oiva.backend.model.entity.json.ObjectMapperSingleton
import org.glassfish.jersey.client.rx.RxClient
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.{Scope, ScopedProxyMode}
import org.springframework.stereotype.Service

import java.util
import scala.collection.JavaConverters._
import scala.compat.java8.FutureConverters

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.TARGET_CLASS)
class OpintopolkuService extends CacheAware {

    private val logger = LoggerFactory.getLogger(getClass)

    @Value("${opintopolku.baseUrl}${opintopolku.organisaatio.restUrl}")
    private val organisaatioServiceUrl: String = null
    private lazy val organisaatioChildQueryUrl: String = organisaatioServiceUrl + "/v4/hierarkia/hae?oid=%s&aktiiviset=true&suunnitellut=true&lakkautetut=false&skipParents=true"
    private lazy val organisaatioQueryServiceUrl: String = organisaatioServiceUrl + "/v4/%s?includeImage=false"
    private lazy val koulutustoimijatServiceUrl: String = organisaatioServiceUrl + "/v2/hae?organisaatioTyyppi=Koulutustoimija&aktiiviset=true&suunnitellut=true&lakkautetut=true"

    @Value("${cas.baseUrl}${opintopolku.kayttooikeus.restUrl}")
    private val kayttooikeusServiceUrl: String = null

    @Value("${opintopolku.baseUrl}${opintopolku.koodisto.restUrl}")
    private val koodistoServiceUrl: String = null
    @Value("${opintopolku.apiCaller.header}")
    private val callerHeader: String = null
    @Value("${opintopolku.apiCaller.id}")
    private val callerId: String = null

    // Koodisto relaatiot
    private lazy val relaatioAlakoodiPath: String = "/relaatio/sisaltyy-alakoodit/"
    private lazy val relaatioYlakoodiPath: String = "/relaatio/sisaltyy-ylakoodit/"

    // Koodisto koodit
    private lazy val alueHallintovirastoKoodiPath: String = "/aluehallintovirasto/koodi"
    private lazy val maakuntaKoodiPath: String = "/maakunta/koodi"
    private lazy val kuntaKoodiPath: String = "/kunta/koodi"
    private lazy val kieliKoodiPath: String = "/kieli/koodi"
    private lazy val oppilaitoksenOpetuskieliKoodiPath: String = "/oppilaitoksenopetuskieli/koodi"
    private lazy val koulutusalaKoodiPath: String = "/isced2011koulutusalataso1/koodi"
    private lazy val koulutustyyppiKoodiPath: String = "/koulutustyyppi/koodi"
    private lazy val tutkintotyyppiKoodiPath: String = "/tutkintotyyppi/koodi"
    private lazy val osaamisalaKoodiPath: String = "/osaamisala/koodi"

    def koodistoKooditPath(koodistoUri: String) = s"/$koodistoUri/koodi"
    def koodistoUrl(koodistoUri: String): String = koodistoServiceUrl + s"/$koodistoUri"
    def koodistoKoodiUrl(koodistoUri: String): String = koodistoServiceUrl + koodistoKooditPath(koodistoUri)
    def koodiUri(koodistoUri: String, koodiArvo: String = ""): String = s"${koodistoUri}_${koodiArvo.toLowerCase}"

    // Koodi urit
    def aluehallintovirastoKoodiUri(koodiArvo: String) = s"aluehallintovirasto_$koodiArvo"
    def maakuntaKoodiUri(koodiArvo: String) = s"maakunta_$koodiArvo"
    def kuntaKoodiUri(koodiArvo: String) = s"kunta_$koodiArvo"
    def koulutusAlaOph2002KoodiUri(koodiArvo: String) = s"koulutusalaoph2002_$koodiArvo"
    def koulutustyyppiKoodiUri(koodiArvo: String) = s"koulutustyyppi_$koodiArvo"
    def tutkintotyyppiKoodiUri(koodiArvo: String) = s"tutkintotyyppi_$koodiArvo"
    def koulutusKoodiUri(koodiArvo: String) = s"koulutus_$koodiArvo"
    def osaamisalaKoodiUri(koodiArvo: String) = s"osaamisala_$koodiArvo"
    def kieliKoodiUri(koodiArvo: String) = s"kieli_$koodiArvo"
    def koulutusalaKoodiUri(koodiArvo: String) = s"isced2011koulutusalataso1_$koodiArvo"

    def koodistoVersio(versio: Integer): String = if(null != versio) s"koodistoVersio=$versio" else ""

    @Value("${opintopolku.apiCredentials.username}")
    private val opintopolkuApiUsername: String = null

    @Value("${opintopolku.apiCredentials.password}")
    private val opintopolkuApiPassword: String = null

    @Autowired
    private val casClient: CASClient = null

    @Autowired
    private val rxClient: RxClient[RxCompletionStageInvoker] = null

    @PostConstruct
    def postConstruct() {
        setCache("OpintopolkuService")
    }

    implicit def future2CS[T](future: Future[T]): CompletionStage[T] = FutureConverters.toJava(future)

    def requestRx[T](url: String, clazz: Class[T]): CompletionStage[T] = {
        logger.debug("Fetching " + url)
        buildRequest(url).rx().get(clazz)
    }

    def request[T](url: String, clazz: Class[T]): T = buildRequest(url).get(clazz)

    private def buildRequest[T](url: String) =
        rxClient.target(url).request().header(callerHeader, callerId)

    def toEntity[T](str: String, clazz: Class[T]): T = ObjectMapperSingleton.mapper.readValue(str, clazz)

    def requestWithCasTicket(serviceUrl: String)(httpRequest: dispatch.Req): String =
        casClient.getTicket(serviceUrl, opintopolkuApiUsername, opintopolkuApiPassword)
            .flatMap { ticket => Http(httpRequest.addHeader(callerHeader, callerId)
              .addQueryParameter("ticket", ticket) OK as.String) }.apply()

    /**
      * Käyttöoikeus-palvelu
      *
      * @param username käyttäjätunnus
      * @return Käyttäjän käyttöoikeudet
      */
    def getKayttajaKayttooikeus(username: String): Optional[KayttajaKayttooikeus] = {
        val response = requestWithCasTicket(kayttooikeusServiceUrl) {
            url(kayttooikeusServiceUrl + "/kayttooikeus/kayttaja?username=" + username)
              .addHeader(callerHeader, callerId).GET
        }
        def toEntityList(response: String): java.util.List[KayttajaKayttooikeus] =
            ObjectMapperSingleton.mapper.readValue(response, new TypeReference[java.util.List[KayttajaKayttooikeus]](){})

        toEntityList(response).toList match {
            case oikeus :: _ => Optional.ofNullable(oikeus)
            case _ => Optional.empty()
        }
    }

    /**
      * Organisaatiot
      *
      * @param oid Organisaatio oid
      * @return
      */
    def getOrganisaatio(oid: String): CompletionStage[Organisaatio] = {
        val url = organisaatioQueryServiceUrl.format(oid)
        cacheRx(oid) { requestRx(url, classOf[Organisaatio]) }
    }

    def getOrganisaatioOppilaitokset(oid: String): java.util.List[Organisaatio] = {
        request(organisaatioChildQueryUrl.format(oid), classOf[OrganisaatioHits])
          .organisaatiot
          .flatMap(_.children)
          .filter(_.oppilaitostyyppi != null)
          .toList.asJava
    }

    def getBlockingOrganisaatio(oid: String): Organisaatio = getOrganisaatio(oid).toCompletableFuture.join()

    /**
     * Hakee ja palauttaa maakunnat ja maakuntaan kuuluvat kaikki kunnat
     */
    def getMaakuntaKunnat(kuntakoodistoversio: Integer): java.util.List[Maakunta] =
        for (maakunta <- request(koodistoServiceUrl + maakuntaKoodiPath, classOf[Array[Maakunta]]).toList) yield {
            val now = LocalDate.now.format(DateTimeFormatter.ISO_DATE)
            // Result contains codes from all versions containing multiple duplicates
            val kunnat = request(koodistoServiceUrl + relaatioYlakoodiPath + maakuntaKoodiUri(maakunta.koodiArvo), classOf[Array[Kunta]])
              .filter(_.versio == kuntakoodistoversio)
              .filter(k => k.getVoimassaLoppuPvm == null || now.compareTo(k.getVoimassaLoppuPvm) <= 0)
            maakunta.setKunta(kunnat)
            maakunta
        }

    /**
     * Hakee ja palauttaa kaikki koulutustoimijat
     */
    def getKoulutustoimijat: java.util.List[Organisaatio] =
        request(koulutustoimijatServiceUrl, classOf[OrganisaatioHits]).organisaatiot.toList

    /**
     * Muodostaa maakunta-jarjestajat tietueet
     */
    def getMaakuntaJarjestajat(kuntakoodistoversio: Integer): java.util.List[Maakunta] = {
        val koulutustoimijat = getKoulutustoimijat
        for(maakunta <- getMaakuntaKunnat(kuntakoodistoversio)) yield {
            maakunta.setKunta(for(kunta <- maakunta.getKunnat) yield {
                val jarjestajat = for(koulutustoimija <- koulutustoimijat if koulutustoimija.isKunta(kunta)) yield Jarjestaja(koulutustoimija)
                if(jarjestajat.nonEmpty) kunta.setJarjestaja(jarjestajat.toArray)
                kunta
            })
            maakunta
        }
    }

    def getKoodisto(koodistoUri: String, koodistoVersio: Integer = null): Koodisto = getKoodistoBlocking(koodistoUri, koodistoVersio)

    def getKoodit(koodistoUri: String, koodistoVersio: Integer, includeExpired: Boolean = false): util.List[KoodistoKoodi] =
        getKoodistoKooditList(koodistoKooditPath(koodistoUri), koodistoVersio, includeExpired)
    def getKoodi(koodistoUri: String, koodiArvo: String, koodistoVersio: Integer = null): KoodistoKoodi =
        getKoodistoKoodiBlocking(koodistoKoodiUrl(koodistoUri), koodiUri(koodistoUri, koodiArvo), koodistoVersio)

    def getAlueHallintovirastoKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(alueHallintovirastoKoodiPath)

    def getMaakuntaKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(maakuntaKoodiPath)
    def getKuntaKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(kuntaKoodiPath)
    def getKuntaKoodi(koodiArvo: String): Optional[KoodistoKoodi] = Optional.ofNullable(getKoodistoKoodiBlocking(koodistoServiceUrl + kuntaKoodiPath, kuntaKoodiUri(koodiArvo)))
    def getKuntaKooditForAlueHallintovirasto(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioAlakoodiPath + aluehallintovirastoKoodiUri(koodiArvo))
    def getKuntaKooditForMaakunta(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioYlakoodiPath + maakuntaKoodiUri(koodiArvo))

    def getKieliKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(kieliKoodiPath)
    def getKieliKoodi(koodiArvo: String): KoodistoKoodi = getKoodistoKoodiBlocking(koodistoServiceUrl + kieliKoodiPath, kieliKoodiUri(koodiArvo.toLowerCase))

    def getOppilaitoksenOpetuskieliKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(oppilaitoksenOpetuskieliKoodiPath)

    // maakunta ja kunta
    def getMaakuntaKoodiForKunta(koodiArvo: String): Optional[KoodistoKoodi] = {
        val maakuntaKoodit = getKuntaAlaKoodit(koodiArvo).filter(_.isKoodisto("maakunta"))
        if(maakuntaKoodit.nonEmpty) Optional.ofNullable(maakuntaKoodit.head) else Optional.empty()
    }

    def getKuntaAlaKoodit(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioAlakoodiPath + kuntaKoodiUri(koodiArvo))

    // koulutus
    def getKoulutustyyppiKoodiForKoulutus(koodiArvo: String): Optional[java.util.List[KoodistoKoodi]] =
        Optional.ofNullable(getKoulutusAlaKooditForKoulutustyyppi(koodiArvo).filter(_.isKoodisto("koulutustyyppi")).asJava)

    def getKoulutusalaKoodiForKoulutus(koodiArvo: String): Optional[KoodistoKoodi] = {
        val koulutusalaKoodit = getKoulutusAlaKoodit(koodiArvo).filter(_.isKoodisto("isced2011koulutusalataso1"))
        if(koulutusalaKoodit.nonEmpty) Optional.ofNullable(koulutusalaKoodit.head) else Optional.empty()
    }

    def getKoulutusAlaKooditForKoulutustyyppi(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioAlakoodiPath + koulutusKoodiUri(koodiArvo),null,includeExpired = true)

    def getKoulutusAlaKoodit(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioAlakoodiPath + koulutusKoodiUri(koodiArvo))

    // koulutusala
    def getKoulutusalaKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(koulutusalaKoodiPath)
    def getKoulutusalaKoodi(koodiArvo: String): KoodistoKoodi = getKoodistoKoodiBlocking(koodistoServiceUrl + koulutusalaKoodiPath, koulutusalaKoodiUri(koodiArvo))
    def getKoulutusKooditForKoulutusala(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioYlakoodiPath + koulutusalaKoodiUri(koodiArvo))

    // osaamisala
    def getOsaamisalaKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(osaamisalaKoodiPath,null)
    def getOsaamisalaKoodi(koodiArvo: String): KoodistoKoodi = getKoodistoKoodiBlocking(koodistoServiceUrl + osaamisalaKoodiPath, osaamisalaKoodiUri(koodiArvo))
    def getKoulutusKooditForOsaamisala(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioYlakoodiPath + osaamisalaKoodiUri(koodiArvo))

    // koulutustyyppi
    def getKoulutustyyppiKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(koulutustyyppiKoodiPath,null, includeExpired = true)
    def getKoulutustyyppiKoodi(koodiArvo: String): KoodistoKoodi = getKoodistoKoodiBlocking(koodistoServiceUrl + koulutustyyppiKoodiPath, koulutustyyppiKoodiUri(koodiArvo))
    def getKoulutusKooditForKoulutustyyppi(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioYlakoodiPath + koulutustyyppiKoodiUri(koodiArvo))

    // tutkintotyyppi
    def getTutkintotyyppiKoodit: util.List[KoodistoKoodi] = getKoodistoKooditList(tutkintotyyppiKoodiPath)
    def getTutkintotyyppiKoodi(koodiArvo: String): KoodistoKoodi = getKoodistoKoodiBlocking(koodistoServiceUrl + tutkintotyyppiKoodiPath, tutkintotyyppiKoodiUri(koodiArvo))
    def getKoulutusKooditForTutkintotyyppi(koodiArvo: String): util.List[KoodistoKoodi] = getKoodistoKooditList(relaatioYlakoodiPath + tutkintotyyppiKoodiUri(koodiArvo))

    /**
      * Get Koodisto. Use cache only if koodistoVersion is explicitely provided
      *
      * @param koodistoUri Koodisto uri
      * @param koodistoVersio Koodisto version
      * @return Koodisto
      */
    private def getKoodistoBlocking(koodistoUri: String, koodistoVersio: Integer = null): Koodisto =
        try cacheRx(koodistoUri, koodistoVersio, versionRequired = true) { requestKoodisto(koodistoUri, koodistoVersio) }.toCompletableFuture.join()
        catch { case _: Exception => Koodisto.notFound(koodistoUri, koodistoVersio) }

    private def getKoodistoKooditList(koodistoKoodiPath: String, koodistoVersio: Integer = null, includeExpired: Boolean = false): java.util.List[KoodistoKoodi] =
        getKoodistoKooditBlocking(koodistoKoodiPath, koodistoVersio).toList.filter(koodi => includeExpired || koodi.isValidDate).distinct.asJava

    private def getKoodistoKooditBlocking(koodistoKoodiPath: String, koodistoVersio: Integer): Array[KoodistoKoodi] =
        try requestKoodistoKoodit(koodistoKoodiPath, koodistoVersio).toCompletableFuture.join
        catch { case _: Exception => Array.empty }

    private def getKoodistoKoodiBlocking(koodistoUrl: String, koodiUri: String, koodistoVersio: Integer = null): KoodistoKoodi =
        try requestKoodistoKoodi(koodistoUrl, koodiUri, koodistoVersio).toCompletableFuture.join
        catch { case _: Exception => KoodistoKoodi.notFound(koodiUri) }

    private def requestKoodisto(koodistoUri: String, koodistoVersio: Integer) =
        requestRx(withKoodistoVersio(koodistoUrl(koodistoUri), koodistoVersio), classOf[Koodisto])

    private def requestKoodistoKoodit(koodistoKoodiPath: String, koodistoVersio: Integer) =
        cacheRx(koodistoKoodiPath, koodistoVersio) {
            requestRx(withKoodistoVersio(koodistoServiceUrl + koodistoKoodiPath, koodistoVersio), classOf[Array[KoodistoKoodi]])
        }

    private def requestKoodistoKoodi(koodistoKoodiUrl: String, koodiUri: String, koodistoVersio: Integer) =
        cacheRx(koodiUri, koodistoVersio) {
            requestRx(withKoodistoVersio(koodistoKoodiUrl + "/" + koodiUri, koodistoVersio), classOf[KoodistoKoodi])
        }

    private def withKoodistoVersio(koodistoUrl: String, versio: Integer) = koodistoVersio(versio) match {
        case v if null == v || v.trim.isEmpty => koodistoUrl
        case v: String => koodistoUrl + "?" + v
    }
}