package fi.minedu.oiva.backend.service

import java.util.Optional
import java.util.concurrent.CompletionStage
import javax.annotation.PostConstruct

import fi.minedu.oiva.backend.cache.CacheAware
import fi.minedu.oiva.backend.cas.CASClient
import fi.minedu.oiva.backend.entity.Maarays
import fi.minedu.oiva.backend.entity.dto.OrganisaatioInfo
import fi.minedu.oiva.backend.entity.json.ObjectMapperSingleton
import fi.minedu.oiva.backend.entity.opintopolku._

import scala.collection.JavaConversions._
import com.fasterxml.jackson.core.`type`.TypeReference
import dispatch.Defaults._
import dispatch._
import org.glassfish.jersey.client.rx.RxClient
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.{Scope, ScopedProxyMode}
import org.springframework.stereotype.Service

import scala.collection.JavaConverters._
import scala.compat.java8.FutureConverters

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.TARGET_CLASS)
class OpintopolkuService extends CacheAware {

    @Value("${opintopolku.baseUrl}${opintopolku.organisaatio.restUrl}")
    private val organisaatioServiceUrl: String = null
    private lazy val organisaatioQueryServiceUrl: String = organisaatioServiceUrl + "/%s?includeImage=false"
    private lazy val koulutustoimijatServiceUrl: String = organisaatioServiceUrl + "/v2/hae?organisaatioTyyppi=Koulutustoimija&aktiiviset=true&suunnitellut=true&lakkautetut=true"

    @Value("${opintopolku.baseUrl}${opintopolku.koodisto.restUrl}")
    private val koodistoServiceUrl: String = null

    // Koodisto relaatiot
    private lazy val relaatioAlakoodiPath: String = "/relaatio/sisaltyy-alakoodit/"
    private lazy val relaatioYlakoodiPath: String = "/relaatio/sisaltyy-ylakoodit/"

    // Koodisto koodit
    private lazy val alueHallintovirastoKoodiPath: String = "/aluehallintovirasto/koodi"
    private lazy val maakuntaKoodiPath: String = "/maakunta/koodi"
    private lazy val kuntaKoodiPath: String = "/kunta/koodi"
    private lazy val kieliKoodiPath: String = "/kieli/koodi"
    private lazy val oppilaitoksenOpetuskieliKoodiPath: String = "/oppilaitoksenopetuskieli/koodi"

    def koodistoKooditPath(koodistoUri: String) = s"/${koodistoUri}/koodi"
    def koodistoUrl(koodistoUri: String) = koodistoServiceUrl + s"/${koodistoUri}"
    def koodistoKoodiUrl(koodistoUri: String) = koodistoServiceUrl + koodistoKooditPath(koodistoUri)
    def koodiUri(koodistoUri: String, koodiArvo: String): String = s"${koodistoUri}_${koodiArvo}"

    // Koodi urit
    def aluehallintovirastoKoodiUri(koodiArvo: String) = s"aluehallintovirasto_${koodiArvo}"
    def maakuntaKoodiUri(koodiArvo: String) = s"maakunta_${koodiArvo}"
    def kuntaKoodiUri(koodiArvo: String) = s"kunta_${koodiArvo}"
    def koulutusAlaOph2002KoodiUri(koodiArvo: String) = s"koulutusalaoph2002_${koodiArvo}"
    def koulutustyyppiKoodiUri(koodiArvo: String) = s"koulutustyyppi_${koodiArvo}"
    def koulutusKoodiUri(koodiArvo: String) = s"koulutus_${koodiArvo}"
    def osaamisalaKoodiUri(koodiArvo: String) = s"osaamisala_${koodiArvo}"
    def kieliKoodiUri(koodiArvo: String) = s"kieli_${koodiArvo}"

    def koodistoVersio(versio: Integer) = if(null != versio) s"koodistoVersio=${versio}" else ""

    @Value("${opintopolku.baseUrl}${opintopolku.autentikaatio.restUrl}")
    private val authenticationServiceUrl: String = null
    private lazy val securityCheckUrl: String = authenticationServiceUrl + "/j_spring_cas_security_check"

    @Value("${opintopolku.baseUrl}${opintopolku.henkilo.restUrl}")
    private val henkiloServiceUrl: String = null
    private lazy val organisaatiohenkiloUrl: String = henkiloServiceUrl + "/%s/organisaatiohenkilo"

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

    /**
     * Fetches organization raw string data from Opintopolku
     *
     * NOTE! OID can also be Y-tunnus!
     *
     * @param oid oid of org
     * @return Future of raw string
     */
    def getOrganisaatioAsRawScalaFuture(oid: String) = cache(oid) {
        Http(url(organisaatioQueryServiceUrl.format(oid)) OK as.String)
    }

    def getOrganisaatio(oid: String) = {
        val url = organisaatioQueryServiceUrl.format(oid)
        cacheRx(oid) {
            requestRx(url, classOf[Organisaatio])
        }
    }

    def getOrganisaatioAsRaw(oid: String) = {
        val url = organisaatioQueryServiceUrl.format(oid)
        cacheRx(url) {
            requestRx(url, classOf[String])
        }
    }

    def requestRx[T](url: String, clazz: Class[T]) = rxClient.target(url).request().rx().get(clazz)
    def request[T](url: String, clazz: Class[T]) = rxClient.target(url).request().get(clazz)
    def toJson[T](str: String, clazz: Class[T]) = ObjectMapperSingleton.mapper.readValue(str, clazz)

    /**
     * Maps raw JSON string to Organisaatio entity
     * @param oid oid of org
     * @return entity
     */
    def getOrganisaatioAsScalaFuture(oid: String) =
        for (orgStr <- getOrganisaatioAsRawScalaFuture(oid)) yield toJson(orgStr, classOf[Organisaatio])

    def getBlockingOrganisaatio(oid: String) = getOrganisaatio(oid).toCompletableFuture.join()

    def getOrganisaatiosAsCSString(oids: Array[String]): CompletionStage[String] =
        Future.sequence(oids.distinct.toList.map(oid => getOrganisaatioAsRawScalaFuture(oid))).collect {
            case x: List[String] => x.mkString("[", ",", "]")
        }

    /**
     * Get by list of oids
     */
    def getOrganisaatiosAsScalaFuture(oids: Array[String]): Future[List[Organisaatio]] =
        Future.sequence(oids.distinct.toList.map(getOrganisaatioAsScalaFuture))

    /**
     * Fetches person's organizational data from Opintopolku
     *
     * @param oid
     * @return Organisaatiohenkilo data
     */
    def getOrganisaatiohenkilo(oid: String): java.util.List[OrganisaatioInfo] = {
        val strResp = casClient.getTicket(securityCheckUrl, opintopolkuApiUsername, opintopolkuApiPassword)
            .flatMap {
                ticket => Http(url(organisaatiohenkiloUrl.format(oid)).GET.addQueryParameter("ticket", ticket) OK as.String)
            }.apply()
        ObjectMapperSingleton.mapper.readValue(strResp, new TypeReference[java.util.List[OrganisaatioInfo]](){})
    }

    implicit def future2CS[T](future: Future[T]): CompletionStage[T] = FutureConverters.toJava(future)

    /**
     * Hakee ja palauttaa maakunnat ja maakuntaan kuuluvat kaikki kunnat
     */
    def getMaakuntaKunnat: java.util.List[Maakunta] =
        for (maakunta <- request(koodistoServiceUrl + maakuntaKoodiPath, classOf[Array[Maakunta]]).toList) yield {
            maakunta.setKunta(request(koodistoServiceUrl + relaatioYlakoodiPath + maakuntaKoodiUri(maakunta.koodiArvo), classOf[Array[Kunta]]))
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
    def getMaakuntaJarjestajat: java.util.List[Maakunta] = {
        val koulutustoimijat = getKoulutustoimijat
        for(maakunta <- getMaakuntaKunnat) yield {
            maakunta.setKunta(for(kunta <- maakunta.getKunnat) yield {
                val jarjestajat = for(koulutustoimija <- koulutustoimijat if koulutustoimija.isKunta(kunta)) yield Jarjestaja(koulutustoimija)
                if(!jarjestajat.isEmpty) kunta.setJarjestaja(jarjestajat.toArray)
                kunta
            })
            maakunta
        }
    }

    def getKoodisto(koodistoUri: String, koodistoVersio: Integer = null) = getKoodistoBlocking(koodistoUri, koodistoVersio)

    def getKoodit(koodistoUri: String, koodistoVersio: Integer) = getKoodistoKooditList(koodistoKooditPath(koodistoUri), koodistoVersio)

    def getKoodi(maarays: Maarays): Optional[KoodistoKoodi] =
        Optional.ofNullable(getKoodi(maarays.getKoodisto, maarays.getKoodiarvo, maarays.getKoodistoversio))

    def getKoodi(koodistoUri: String, koodiArvo: String, koodistoVersio: Integer) =
        getKoodistoKoodiBlocking(koodistoKoodiUrl(koodistoUri), koodiUri(koodistoUri, koodiArvo), koodistoVersio)

    def getAlueHallintovirastoKoodit = getKoodistoKooditList(alueHallintovirastoKoodiPath)

    def getMaakuntaKoodit = getKoodistoKooditList(maakuntaKoodiPath)
    def getKuntaKoodit = getKoodistoKooditList(kuntaKoodiPath)
    def getKuntaKoodi(koodiArvo: String): Optional[KoodistoKoodi] = Optional.ofNullable(getKoodistoKoodiBlocking(koodistoServiceUrl + kuntaKoodiPath, kuntaKoodiUri(koodiArvo)))
    def getKuntaKooditForAlueHallintovirasto(koodiArvo: String) = getKoodistoKooditList(relaatioAlakoodiPath + aluehallintovirastoKoodiUri(koodiArvo))
    def getKuntaKooditForMaakunta(koodiArvo: String) = getKoodistoKooditList(relaatioYlakoodiPath + maakuntaKoodiUri(koodiArvo))

    def getKieliKoodit = getKoodistoKooditList(kieliKoodiPath)
    def getKieliKoodi(koodiArvo: String) = getKoodistoKoodiBlocking(koodistoServiceUrl + kieliKoodiPath, kieliKoodiUri(koodiArvo.toLowerCase))

    def getOppilaitoksenOpetuskieliKoodit = getKoodistoKooditList(oppilaitoksenOpetuskieliKoodiPath)

    // maakunta ja kunta
    def getMaakuntaKoodiForKunta(koodiArvo: String): Optional[KoodistoKoodi] = {
        val maakuntaKoodit = getKuntaAlaKoodit(koodiArvo).filter(_.isKoodisto("maakunta"))
        if(!maakuntaKoodit.isEmpty) Optional.ofNullable(maakuntaKoodit.head) else Optional.empty()
    }

    def getKuntaAlaKoodit(koodiArvo: String) = getKoodistoKooditList(relaatioAlakoodiPath + kuntaKoodiUri(koodiArvo))

    // koulutus
    def getKoulutustyyppiKoodiForKoulutus(koodiArvo: String): Optional[java.util.List[KoodistoKoodi]] =
        Optional.ofNullable(getKoulutusAlaKoodit(koodiArvo).filter(_.isKoodisto("koulutustyyppi")).asJava)

    def getKoulutusalaKoodiForKoulutus(koodiArvo: String): Optional[KoodistoKoodi] = {
        val koulutusalaKoodit = getKoulutusAlaKoodit(koodiArvo).filter(_.isKoodisto("isced2011koulutusalataso1"))
        if(!koulutusalaKoodit.isEmpty) Optional.ofNullable(koulutusalaKoodit.head) else Optional.empty()
    }

    def getKoulutusAlaKoodit(koodiArvo: String) = getKoodistoKooditList(relaatioAlakoodiPath + koulutusKoodiUri(koodiArvo))

    /**
      * Get Koodisto. Use cache only if koodistoVersion is explicitely provided
      *
      * @param koodistoUri Koodisto uri
      * @param koodistoVersio Koodisto version
      * @return Koodisto
      */
    private def getKoodistoBlocking(koodistoUri: String, koodistoVersio: Integer = null): Koodisto =
        try cacheRx(koodistoUri, koodistoVersio, true) { requestKoodisto(koodistoUri, koodistoVersio) }.toCompletableFuture.join()
        catch { case e: Exception => Koodisto.notFound(koodistoUri, koodistoVersio) }

    private def getKoodistoKooditList(koodistoKoodiPath: String, koodistoVersio: Integer = null, includeExpired: Boolean = false): java.util.List[KoodistoKoodi] =
        getKoodistoKooditBlocking(koodistoKoodiPath, koodistoVersio).toList.filter(koodi => includeExpired || koodi.isValidDate).distinct.asJava

    private def getKoodistoKooditBlocking(koodistoKoodiPath: String, koodistoVersio: Integer): Array[KoodistoKoodi] =
        try requestKoodistoKoodit(koodistoKoodiPath, koodistoVersio).toCompletableFuture.join
        catch { case e: Exception => Array.empty }

    private def getKoodistoKoodiBlocking(koodistoUrl: String, koodiUri: String, koodistoVersio: Integer = null): KoodistoKoodi =
        try requestKoodistoKoodi(koodistoUrl, koodiUri, koodistoVersio).toCompletableFuture.join
        catch { case e: Exception => KoodistoKoodi.notFound(koodiUri) }

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
        case v if(null == v || v.trim.isEmpty) => koodistoUrl
        case v: String => koodistoUrl + "?" + v
    }
}