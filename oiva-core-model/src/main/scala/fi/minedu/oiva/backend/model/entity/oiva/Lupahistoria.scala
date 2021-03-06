package fi.minedu.oiva.backend.model.entity.oiva

import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.{JsonIgnore, JsonIgnoreProperties, JsonInclude}
import fi.minedu.oiva.backend.model.jooq.tables._

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
class Lupahistoria(var lupahistoria: Lupahistoria, var paatoskirje: Liite) extends pojos.Lupahistoria  {

  def this() = this(null, null)

  // exclude from json
  @JsonIgnore override def getId = super.getId
  @JsonIgnore override def getLupaId = super.getLupaId

  def getEsitysmalli = lupahistoria
  def setEsitysmalli(esitysmalli: Esitysmalli): Unit = this.lupahistoria = lupahistoria

  def getPaatoskirje = paatoskirje
  def setPaatoskirje(paatoskirje: Liite): Unit = this.paatoskirje = paatoskirje
}
