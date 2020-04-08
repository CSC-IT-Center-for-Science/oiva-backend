/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables.records;


import com.fasterxml.jackson.databind.JsonNode;

import fi.minedu.oiva.backend.model.jooq.tables.Muutospyynto;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class MuutospyyntoRecord extends UpdatableRecordImpl<MuutospyyntoRecord> implements Record15<Long, Long, Date, Date, Date, Long, String, String, String, Timestamp, String, Timestamp, UUID, JsonNode, String> {

    private static final long serialVersionUID = 1238849526;

    /**
     * Setter for <code>muutospyynto.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>muutospyynto.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>muutospyynto.lupa_id</code>.
     */
    public void setLupaId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>muutospyynto.lupa_id</code>.
     */
    @NotNull
    public Long getLupaId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>muutospyynto.hakupvm</code>.
     */
    public void setHakupvm(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>muutospyynto.hakupvm</code>.
     */
    public Date getHakupvm() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>muutospyynto.voimassaalkupvm</code>.
     */
    public void setVoimassaalkupvm(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>muutospyynto.voimassaalkupvm</code>.
     */
    public Date getVoimassaalkupvm() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>muutospyynto.voimassaloppupvm</code>.
     */
    public void setVoimassaloppupvm(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>muutospyynto.voimassaloppupvm</code>.
     */
    public Date getVoimassaloppupvm() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>muutospyynto.paatoskierros_id</code>.
     */
    public void setPaatoskierrosId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>muutospyynto.paatoskierros_id</code>.
     */
    @NotNull
    public Long getPaatoskierrosId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>muutospyynto.tila</code>.
     */
    public void setTila(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>muutospyynto.tila</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getTila() {
        return (String) get(6);
    }

    /**
     * Setter for <code>muutospyynto.jarjestaja_ytunnus</code>.
     */
    public void setJarjestajaYtunnus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>muutospyynto.jarjestaja_ytunnus</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getJarjestajaYtunnus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>muutospyynto.luoja</code>.
     */
    public void setLuoja(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>muutospyynto.luoja</code>.
     */
    public String getLuoja() {
        return (String) get(8);
    }

    /**
     * Setter for <code>muutospyynto.luontipvm</code>.
     */
    public void setLuontipvm(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>muutospyynto.luontipvm</code>.
     */
    public Timestamp getLuontipvm() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>muutospyynto.paivittaja</code>.
     */
    public void setPaivittaja(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>muutospyynto.paivittaja</code>.
     */
    public String getPaivittaja() {
        return (String) get(10);
    }

    /**
     * Setter for <code>muutospyynto.paivityspvm</code>.
     */
    public void setPaivityspvm(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>muutospyynto.paivityspvm</code>.
     */
    public Timestamp getPaivityspvm() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>muutospyynto.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(12, value);
    }

    /**
     * Getter for <code>muutospyynto.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(12);
    }

    /**
     * Setter for <code>muutospyynto.meta</code>.
     */
    public void setMeta(JsonNode value) {
        set(13, value);
    }

    /**
     * Getter for <code>muutospyynto.meta</code>.
     */
    public JsonNode getMeta() {
        return (JsonNode) get(13);
    }

    /**
     * Setter for <code>muutospyynto.alkupera</code>.
     */
    public void setAlkupera(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>muutospyynto.alkupera</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getAlkupera() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Long, Date, Date, Date, Long, String, String, String, Timestamp, String, Timestamp, UUID, JsonNode, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Long, Date, Date, Date, Long, String, String, String, Timestamp, String, Timestamp, UUID, JsonNode, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Muutospyynto.MUUTOSPYYNTO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Muutospyynto.MUUTOSPYYNTO.LUPA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return Muutospyynto.MUUTOSPYYNTO.HAKUPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Muutospyynto.MUUTOSPYYNTO.VOIMASSAALKUPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Muutospyynto.MUUTOSPYYNTO.VOIMASSALOPPUPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Muutospyynto.MUUTOSPYYNTO.PAATOSKIERROS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Muutospyynto.MUUTOSPYYNTO.TILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Muutospyynto.MUUTOSPYYNTO.JARJESTAJA_YTUNNUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Muutospyynto.MUUTOSPYYNTO.LUOJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Muutospyynto.MUUTOSPYYNTO.LUONTIPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Muutospyynto.MUUTOSPYYNTO.PAIVITTAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Muutospyynto.MUUTOSPYYNTO.PAIVITYSPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field13() {
        return Muutospyynto.MUUTOSPYYNTO.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonNode> field14() {
        return Muutospyynto.MUUTOSPYYNTO.META;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Muutospyynto.MUUTOSPYYNTO.ALKUPERA;
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
        return getLupaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getHakupvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getVoimassaalkupvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getVoimassaloppupvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getPaatoskierrosId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTila();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getJarjestajaYtunnus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLuoja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getLuontipvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPaivittaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getPaivityspvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value13() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonNode value14() {
        return getMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getAlkupera();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value2(Long value) {
        setLupaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value3(Date value) {
        setHakupvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value4(Date value) {
        setVoimassaalkupvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value5(Date value) {
        setVoimassaloppupvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value6(Long value) {
        setPaatoskierrosId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value7(String value) {
        setTila(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value8(String value) {
        setJarjestajaYtunnus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value9(String value) {
        setLuoja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value10(Timestamp value) {
        setLuontipvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value11(String value) {
        setPaivittaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value12(Timestamp value) {
        setPaivityspvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value13(UUID value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value14(JsonNode value) {
        setMeta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord value15(String value) {
        setAlkupera(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoRecord values(Long value1, Long value2, Date value3, Date value4, Date value5, Long value6, String value7, String value8, String value9, Timestamp value10, String value11, Timestamp value12, UUID value13, JsonNode value14, String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MuutospyyntoRecord
     */
    public MuutospyyntoRecord() {
        super(Muutospyynto.MUUTOSPYYNTO);
    }

    /**
     * Create a detached, initialised MuutospyyntoRecord
     */
    public MuutospyyntoRecord(Long id, Long lupaId, Date hakupvm, Date voimassaalkupvm, Date voimassaloppupvm, Long paatoskierrosId, String tila, String jarjestajaYtunnus, String luoja, Timestamp luontipvm, String paivittaja, Timestamp paivityspvm, UUID uuid, JsonNode meta, String alkupera) {
        super(Muutospyynto.MUUTOSPYYNTO);

        set(0, id);
        set(1, lupaId);
        set(2, hakupvm);
        set(3, voimassaalkupvm);
        set(4, voimassaloppupvm);
        set(5, paatoskierrosId);
        set(6, tila);
        set(7, jarjestajaYtunnus);
        set(8, luoja);
        set(9, luontipvm);
        set(10, paivittaja);
        set(11, paivityspvm);
        set(12, uuid);
        set(13, meta);
        set(14, alkupera);
    }
}
