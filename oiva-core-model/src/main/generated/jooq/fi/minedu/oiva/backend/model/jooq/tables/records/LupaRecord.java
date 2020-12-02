/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables.records;


import com.fasterxml.jackson.databind.JsonNode;

import fi.minedu.oiva.backend.model.jooq.tables.Lupa;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LupaRecord extends UpdatableRecordImpl<LupaRecord> implements Record21<Long, Long, Long, Long, Long, String, String, String, Date, Date, Date, JsonNode, Boolean, String, Timestamp, String, Timestamp, UUID, String, String, String> {

    private static final long serialVersionUID = -163837526;

    /**
     * Setter for <code>lupa.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>lupa.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>lupa.edellinen_lupa_id</code>.
     */
    public void setEdellinenLupaId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>lupa.edellinen_lupa_id</code>.
     */
    public Long getEdellinenLupaId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>lupa.paatoskierros_id</code>.
     */
    public void setPaatoskierrosId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>lupa.paatoskierros_id</code>.
     */
    @NotNull
    public Long getPaatoskierrosId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>lupa.lupatila_id</code>.
     */
    public void setLupatilaId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>lupa.lupatila_id</code>.
     */
    @NotNull
    public Long getLupatilaId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>lupa.asiatyyppi_id</code>.
     */
    public void setAsiatyyppiId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>lupa.asiatyyppi_id</code>.
     */
    @NotNull
    public Long getAsiatyyppiId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>lupa.diaarinumero</code>.
     */
    public void setDiaarinumero(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>lupa.diaarinumero</code>.
     */
    @Size(max = 255)
    public String getDiaarinumero() {
        return (String) get(5);
    }

    /**
     * Setter for <code>lupa.jarjestaja_ytunnus</code>.
     */
    public void setJarjestajaYtunnus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>lupa.jarjestaja_ytunnus</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getJarjestajaYtunnus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>lupa.jarjestaja_oid</code>.
     */
    public void setJarjestajaOid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>lupa.jarjestaja_oid</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getJarjestajaOid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>lupa.alkupvm</code>.
     */
    public void setAlkupvm(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>lupa.alkupvm</code>.
     */
    @NotNull
    public Date getAlkupvm() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>lupa.loppupvm</code>.
     */
    public void setLoppupvm(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>lupa.loppupvm</code>.
     */
    public Date getLoppupvm() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>lupa.paatospvm</code>.
     */
    public void setPaatospvm(Date value) {
        set(10, value);
    }

    /**
     * Getter for <code>lupa.paatospvm</code>.
     */
    public Date getPaatospvm() {
        return (Date) get(10);
    }

    /**
     * Setter for <code>lupa.meta</code>.
     */
    public void setMeta(JsonNode value) {
        set(11, value);
    }

    /**
     * Getter for <code>lupa.meta</code>.
     */
    public JsonNode getMeta() {
        return (JsonNode) get(11);
    }

    /**
     * Setter for <code>lupa.maksu</code>.
     */
    public void setMaksu(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>lupa.maksu</code>.
     */
    public Boolean getMaksu() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>lupa.luoja</code>.
     */
    public void setLuoja(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>lupa.luoja</code>.
     */
    public String getLuoja() {
        return (String) get(13);
    }

    /**
     * Setter for <code>lupa.luontipvm</code>.
     */
    public void setLuontipvm(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>lupa.luontipvm</code>.
     */
    public Timestamp getLuontipvm() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>lupa.paivittaja</code>.
     */
    public void setPaivittaja(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>lupa.paivittaja</code>.
     */
    public String getPaivittaja() {
        return (String) get(15);
    }

    /**
     * Setter for <code>lupa.paivityspvm</code>.
     */
    public void setPaivityspvm(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>lupa.paivityspvm</code>.
     */
    public Timestamp getPaivityspvm() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>lupa.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(17, value);
    }

    /**
     * Getter for <code>lupa.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(17);
    }

    /**
     * Setter for <code>lupa.koulutustyyppi</code>.
     */
    public void setKoulutustyyppi(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>lupa.koulutustyyppi</code>.
     */
    public String getKoulutustyyppi() {
        return (String) get(18);
    }

    /**
     * Setter for <code>lupa.oppilaitostyyppi</code>.
     */
    public void setOppilaitostyyppi(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>lupa.oppilaitostyyppi</code>.
     */
    public String getOppilaitostyyppi() {
        return (String) get(19);
    }

    /**
     * Setter for <code>lupa.asianumero</code>.
     */
    public void setAsianumero(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>lupa.asianumero</code>.
     */
    @Size(max = 17)
    public String getAsianumero() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, Long, Long, Long, Long, String, String, String, Date, Date, Date, JsonNode, Boolean, String, Timestamp, String, Timestamp, UUID, String, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, Long, Long, Long, Long, String, String, String, Date, Date, Date, JsonNode, Boolean, String, Timestamp, String, Timestamp, UUID, String, String, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Lupa.LUPA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Lupa.LUPA.EDELLINEN_LUPA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Lupa.LUPA.PAATOSKIERROS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Lupa.LUPA.LUPATILA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Lupa.LUPA.ASIATYYPPI_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Lupa.LUPA.DIAARINUMERO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Lupa.LUPA.JARJESTAJA_YTUNNUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Lupa.LUPA.JARJESTAJA_OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return Lupa.LUPA.ALKUPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return Lupa.LUPA.LOPPUPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field11() {
        return Lupa.LUPA.PAATOSPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonNode> field12() {
        return Lupa.LUPA.META;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Lupa.LUPA.MAKSU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Lupa.LUPA.LUOJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return Lupa.LUPA.LUONTIPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Lupa.LUPA.PAIVITTAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return Lupa.LUPA.PAIVITYSPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field18() {
        return Lupa.LUPA.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Lupa.LUPA.KOULUTUSTYYPPI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return Lupa.LUPA.OPPILAITOSTYYPPI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return Lupa.LUPA.ASIANUMERO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getEdellinenLupaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getPaatoskierrosId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getLupatilaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getAsiatyyppiId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDiaarinumero();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getJarjestajaYtunnus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getJarjestajaOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getAlkupvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value10() {
        return getLoppupvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value11() {
        return getPaatospvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonNode value12() {
        return getMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getMaksu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getLuoja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getLuontipvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getPaivittaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getPaivityspvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value18() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getKoulutustyyppi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getOppilaitostyyppi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getAsianumero();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value2(Long value) {
        setEdellinenLupaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value3(Long value) {
        setPaatoskierrosId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value4(Long value) {
        setLupatilaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value5(Long value) {
        setAsiatyyppiId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value6(String value) {
        setDiaarinumero(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value7(String value) {
        setJarjestajaYtunnus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value8(String value) {
        setJarjestajaOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value9(Date value) {
        setAlkupvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value10(Date value) {
        setLoppupvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value11(Date value) {
        setPaatospvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value12(JsonNode value) {
        setMeta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value13(Boolean value) {
        setMaksu(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value14(String value) {
        setLuoja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value15(Timestamp value) {
        setLuontipvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value16(String value) {
        setPaivittaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value17(Timestamp value) {
        setPaivityspvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value18(UUID value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value19(String value) {
        setKoulutustyyppi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value20(String value) {
        setOppilaitostyyppi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord value21(String value) {
        setAsianumero(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, String value6, String value7, String value8, Date value9, Date value10, Date value11, JsonNode value12, Boolean value13, String value14, Timestamp value15, String value16, Timestamp value17, UUID value18, String value19, String value20, String value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LupaRecord
     */
    public LupaRecord() {
        super(Lupa.LUPA);
    }

    /**
     * Create a detached, initialised LupaRecord
     */
    public LupaRecord(Long id, Long edellinenLupaId, Long paatoskierrosId, Long lupatilaId, Long asiatyyppiId, String diaarinumero, String jarjestajaYtunnus, String jarjestajaOid, Date alkupvm, Date loppupvm, Date paatospvm, JsonNode meta, Boolean maksu, String luoja, Timestamp luontipvm, String paivittaja, Timestamp paivityspvm, UUID uuid, String koulutustyyppi, String oppilaitostyyppi, String asianumero) {
        super(Lupa.LUPA);

        set(0, id);
        set(1, edellinenLupaId);
        set(2, paatoskierrosId);
        set(3, lupatilaId);
        set(4, asiatyyppiId);
        set(5, diaarinumero);
        set(6, jarjestajaYtunnus);
        set(7, jarjestajaOid);
        set(8, alkupvm);
        set(9, loppupvm);
        set(10, paatospvm);
        set(11, meta);
        set(12, maksu);
        set(13, luoja);
        set(14, luontipvm);
        set(15, paivittaja);
        set(16, paivityspvm);
        set(17, uuid);
        set(18, koulutustyyppi);
        set(19, oppilaitostyyppi);
        set(20, asianumero);
    }
}
