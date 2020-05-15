/*
 * This file is generated by jOOQ.
 */
package fi.minedu.oiva.backend.model.jooq.tables.pojos;


import com.fasterxml.jackson.databind.JsonNode;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Kohde implements Serializable {

    private static final long serialVersionUID = -1673248238;

    private Long      id;
    private String    tunniste;
    private JsonNode  meta;
    private String    luoja;
    private Timestamp luontipvm;
    private String    paivittaja;
    private Timestamp paivityspvm;
    private UUID      uuid;
    private String    koulutustyyppi;

    public Kohde() {}

    public Kohde(Kohde value) {
        this.id = value.id;
        this.tunniste = value.tunniste;
        this.meta = value.meta;
        this.luoja = value.luoja;
        this.luontipvm = value.luontipvm;
        this.paivittaja = value.paivittaja;
        this.paivityspvm = value.paivityspvm;
        this.uuid = value.uuid;
        this.koulutustyyppi = value.koulutustyyppi;
    }

    public Kohde(
        Long      id,
        String    tunniste,
        JsonNode  meta,
        String    luoja,
        Timestamp luontipvm,
        String    paivittaja,
        Timestamp paivityspvm,
        UUID      uuid,
        String    koulutustyyppi
    ) {
        this.id = id;
        this.tunniste = tunniste;
        this.meta = meta;
        this.luoja = luoja;
        this.luontipvm = luontipvm;
        this.paivittaja = paivittaja;
        this.paivityspvm = paivityspvm;
        this.uuid = uuid;
        this.koulutustyyppi = koulutustyyppi;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Size(max = 255)
    public String getTunniste() {
        return this.tunniste;
    }

    public void setTunniste(String tunniste) {
        this.tunniste = tunniste;
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

    public UUID getUuid() {
        return this.uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getKoulutustyyppi() {
        return this.koulutustyyppi;
    }

    public void setKoulutustyyppi(String koulutustyyppi) {
        this.koulutustyyppi = koulutustyyppi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Kohde (");

        sb.append(id);
        sb.append(", ").append(tunniste);
        sb.append(", ").append(meta);
        sb.append(", ").append(luoja);
        sb.append(", ").append(luontipvm);
        sb.append(", ").append(paivittaja);
        sb.append(", ").append(paivityspvm);
        sb.append(", ").append(uuid);
        sb.append(", ").append(koulutustyyppi);

        sb.append(")");
        return sb.toString();
    }
}
