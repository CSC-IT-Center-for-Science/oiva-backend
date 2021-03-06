/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables.pojos;


import com.fasterxml.jackson.databind.JsonNode;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Muutos implements Serializable {

    private static final long serialVersionUID = -1672702744;

    private Long      id;
    private Long      muutospyyntoId;
    private Long      kohdeId;
    private Long      parentId;
    private String    koodisto;
    private String    koodiarvo;
    private String    arvo;
    private Long      maaraystyyppiId;
    private JsonNode  meta;
    private String    luoja;
    private Timestamp luontipvm;
    private String    paivittaja;
    private Timestamp paivityspvm;
    private Long      maaraysId;
    private String    tila;
    private UUID      uuid;
    private String    paatosTila;
    private String    muutosperustelukoodiarvo;
    private String    orgOid;
    private Long      parentMaaraysId;

    public Muutos() {}

    public Muutos(Muutos value) {
        this.id = value.id;
        this.muutospyyntoId = value.muutospyyntoId;
        this.kohdeId = value.kohdeId;
        this.parentId = value.parentId;
        this.koodisto = value.koodisto;
        this.koodiarvo = value.koodiarvo;
        this.arvo = value.arvo;
        this.maaraystyyppiId = value.maaraystyyppiId;
        this.meta = value.meta;
        this.luoja = value.luoja;
        this.luontipvm = value.luontipvm;
        this.paivittaja = value.paivittaja;
        this.paivityspvm = value.paivityspvm;
        this.maaraysId = value.maaraysId;
        this.tila = value.tila;
        this.uuid = value.uuid;
        this.paatosTila = value.paatosTila;
        this.muutosperustelukoodiarvo = value.muutosperustelukoodiarvo;
        this.orgOid = value.orgOid;
        this.parentMaaraysId = value.parentMaaraysId;
    }

    public Muutos(
        Long      id,
        Long      muutospyyntoId,
        Long      kohdeId,
        Long      parentId,
        String    koodisto,
        String    koodiarvo,
        String    arvo,
        Long      maaraystyyppiId,
        JsonNode  meta,
        String    luoja,
        Timestamp luontipvm,
        String    paivittaja,
        Timestamp paivityspvm,
        Long      maaraysId,
        String    tila,
        UUID      uuid,
        String    paatosTila,
        String    muutosperustelukoodiarvo,
        String    orgOid,
        Long      parentMaaraysId
    ) {
        this.id = id;
        this.muutospyyntoId = muutospyyntoId;
        this.kohdeId = kohdeId;
        this.parentId = parentId;
        this.koodisto = koodisto;
        this.koodiarvo = koodiarvo;
        this.arvo = arvo;
        this.maaraystyyppiId = maaraystyyppiId;
        this.meta = meta;
        this.luoja = luoja;
        this.luontipvm = luontipvm;
        this.paivittaja = paivittaja;
        this.paivityspvm = paivityspvm;
        this.maaraysId = maaraysId;
        this.tila = tila;
        this.uuid = uuid;
        this.paatosTila = paatosTila;
        this.muutosperustelukoodiarvo = muutosperustelukoodiarvo;
        this.orgOid = orgOid;
        this.parentMaaraysId = parentMaaraysId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public Long getMuutospyyntoId() {
        return this.muutospyyntoId;
    }

    public void setMuutospyyntoId(Long muutospyyntoId) {
        this.muutospyyntoId = muutospyyntoId;
    }

    @NotNull
    public Long getKohdeId() {
        return this.kohdeId;
    }

    public void setKohdeId(Long kohdeId) {
        this.kohdeId = kohdeId;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Size(max = 255)
    public String getKoodisto() {
        return this.koodisto;
    }

    public void setKoodisto(String koodisto) {
        this.koodisto = koodisto;
    }

    @NotNull
    public String getKoodiarvo() {
        return this.koodiarvo;
    }

    public void setKoodiarvo(String koodiarvo) {
        this.koodiarvo = koodiarvo;
    }

    @Size(max = 255)
    public String getArvo() {
        return this.arvo;
    }

    public void setArvo(String arvo) {
        this.arvo = arvo;
    }

    @NotNull
    public Long getMaaraystyyppiId() {
        return this.maaraystyyppiId;
    }

    public void setMaaraystyyppiId(Long maaraystyyppiId) {
        this.maaraystyyppiId = maaraystyyppiId;
    }

    public JsonNode getMeta() {
        return this.meta;
    }

    public void setMeta(JsonNode meta) {
        this.meta = meta;
    }

    public String getLuoja() {
        return this.luoja;
    }

    public void setLuoja(String luoja) {
        this.luoja = luoja;
    }

    public Timestamp getLuontipvm() {
        return this.luontipvm;
    }

    public void setLuontipvm(Timestamp luontipvm) {
        this.luontipvm = luontipvm;
    }

    public String getPaivittaja() {
        return this.paivittaja;
    }

    public void setPaivittaja(String paivittaja) {
        this.paivittaja = paivittaja;
    }

    public Timestamp getPaivityspvm() {
        return this.paivityspvm;
    }

    public void setPaivityspvm(Timestamp paivityspvm) {
        this.paivityspvm = paivityspvm;
    }

    public Long getMaaraysId() {
        return this.maaraysId;
    }

    public void setMaaraysId(Long maaraysId) {
        this.maaraysId = maaraysId;
    }

    @Size(max = 10)
    public String getTila() {
        return this.tila;
    }

    public void setTila(String tila) {
        this.tila = tila;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Size(max = 20)
    public String getPaatosTila() {
        return this.paatosTila;
    }

    public void setPaatosTila(String paatosTila) {
        this.paatosTila = paatosTila;
    }

    public String getMuutosperustelukoodiarvo() {
        return this.muutosperustelukoodiarvo;
    }

    public void setMuutosperustelukoodiarvo(String muutosperustelukoodiarvo) {
        this.muutosperustelukoodiarvo = muutosperustelukoodiarvo;
    }

    @Size(max = 255)
    public String getOrgOid() {
        return this.orgOid;
    }

    public void setOrgOid(String orgOid) {
        this.orgOid = orgOid;
    }

    public Long getParentMaaraysId() {
        return this.parentMaaraysId;
    }

    public void setParentMaaraysId(Long parentMaaraysId) {
        this.parentMaaraysId = parentMaaraysId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Muutos (");

        sb.append(id);
        sb.append(", ").append(muutospyyntoId);
        sb.append(", ").append(kohdeId);
        sb.append(", ").append(parentId);
        sb.append(", ").append(koodisto);
        sb.append(", ").append(koodiarvo);
        sb.append(", ").append(arvo);
        sb.append(", ").append(maaraystyyppiId);
        sb.append(", ").append(meta);
        sb.append(", ").append(luoja);
        sb.append(", ").append(luontipvm);
        sb.append(", ").append(paivittaja);
        sb.append(", ").append(paivityspvm);
        sb.append(", ").append(maaraysId);
        sb.append(", ").append(tila);
        sb.append(", ").append(uuid);
        sb.append(", ").append(paatosTila);
        sb.append(", ").append(muutosperustelukoodiarvo);
        sb.append(", ").append(orgOid);
        sb.append(", ").append(parentMaaraysId);

        sb.append(")");
        return sb.toString();
    }
}
