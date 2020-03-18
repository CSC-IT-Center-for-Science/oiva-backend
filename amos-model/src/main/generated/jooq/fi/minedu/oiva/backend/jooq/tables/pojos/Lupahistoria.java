/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
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
public class Lupahistoria implements Serializable {

    private static final long serialVersionUID = -195727014;

    private Long   id;
    private String diaarinumero;
    private String ytunnus;
    private String oid;
    private String maakunta;
    private String tila;
    private Date   voimassaoloalkupvm;
    private Date   voimassaololoppupvm;
    private Date   paatospvm;
    private String filename;
    private UUID   uuid;
    private Date   kumottupvm;
    private Long   lupaId;

    public Lupahistoria() {}

    public Lupahistoria(Lupahistoria value) {
        this.id = value.id;
        this.diaarinumero = value.diaarinumero;
        this.ytunnus = value.ytunnus;
        this.oid = value.oid;
        this.maakunta = value.maakunta;
        this.tila = value.tila;
        this.voimassaoloalkupvm = value.voimassaoloalkupvm;
        this.voimassaololoppupvm = value.voimassaololoppupvm;
        this.paatospvm = value.paatospvm;
        this.filename = value.filename;
        this.uuid = value.uuid;
        this.kumottupvm = value.kumottupvm;
        this.lupaId = value.lupaId;
    }

    public Lupahistoria(
        Long   id,
        String diaarinumero,
        String ytunnus,
        String oid,
        String maakunta,
        String tila,
        Date   voimassaoloalkupvm,
        Date   voimassaololoppupvm,
        Date   paatospvm,
        String filename,
        UUID   uuid,
        Date   kumottupvm,
        Long   lupaId
    ) {
        this.id = id;
        this.diaarinumero = diaarinumero;
        this.ytunnus = ytunnus;
        this.oid = oid;
        this.maakunta = maakunta;
        this.tila = tila;
        this.voimassaoloalkupvm = voimassaoloalkupvm;
        this.voimassaololoppupvm = voimassaololoppupvm;
        this.paatospvm = paatospvm;
        this.filename = filename;
        this.uuid = uuid;
        this.kumottupvm = kumottupvm;
        this.lupaId = lupaId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 20)
    public String getDiaarinumero() {
        return this.diaarinumero;
    }

    public void setDiaarinumero(String diaarinumero) {
        this.diaarinumero = diaarinumero;
    }

    @NotNull
    @Size(max = 10)
    public String getYtunnus() {
        return this.ytunnus;
    }

    public void setYtunnus(String ytunnus) {
        this.ytunnus = ytunnus;
    }

    @NotNull
    @Size(max = 255)
    public String getOid() {
        return this.oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @NotNull
    @Size(max = 100)
    public String getMaakunta() {
        return this.maakunta;
    }

    public void setMaakunta(String maakunta) {
        this.maakunta = maakunta;
    }

    @NotNull
    @Size(max = 100)
    public String getTila() {
        return this.tila;
    }

    public void setTila(String tila) {
        this.tila = tila;
    }

    @NotNull
    public Date getVoimassaoloalkupvm() {
        return this.voimassaoloalkupvm;
    }

    public void setVoimassaoloalkupvm(Date voimassaoloalkupvm) {
        this.voimassaoloalkupvm = voimassaoloalkupvm;
    }

    @NotNull
    public Date getVoimassaololoppupvm() {
        return this.voimassaololoppupvm;
    }

    public void setVoimassaololoppupvm(Date voimassaololoppupvm) {
        this.voimassaololoppupvm = voimassaololoppupvm;
    }

    @NotNull
    public Date getPaatospvm() {
        return this.paatospvm;
    }

    public void setPaatospvm(Date paatospvm) {
        this.paatospvm = paatospvm;
    }

    @NotNull
    @Size(max = 255)
    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Date getKumottupvm() {
        return this.kumottupvm;
    }

    public void setKumottupvm(Date kumottupvm) {
        this.kumottupvm = kumottupvm;
    }

    public Long getLupaId() {
        return this.lupaId;
    }

    public void setLupaId(Long lupaId) {
        this.lupaId = lupaId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lupahistoria (");

        sb.append(id);
        sb.append(", ").append(diaarinumero);
        sb.append(", ").append(ytunnus);
        sb.append(", ").append(oid);
        sb.append(", ").append(maakunta);
        sb.append(", ").append(tila);
        sb.append(", ").append(voimassaoloalkupvm);
        sb.append(", ").append(voimassaololoppupvm);
        sb.append(", ").append(paatospvm);
        sb.append(", ").append(filename);
        sb.append(", ").append(uuid);
        sb.append(", ").append(kumottupvm);
        sb.append(", ").append(lupaId);

        sb.append(")");
        return sb.toString();
    }
}
