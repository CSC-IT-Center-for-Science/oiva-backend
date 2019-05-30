package fi.minedu.oiva.backend.entity.oiva

import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.{JsonIgnore, JsonIgnoreProperties, JsonInclude}

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
class Maaraystyyppi() extends fi.minedu.oiva.backend.jooq.tables.pojos.Maaraystyyppi  {

    // exclude from json
    @JsonIgnore override def getId = super.getId
}