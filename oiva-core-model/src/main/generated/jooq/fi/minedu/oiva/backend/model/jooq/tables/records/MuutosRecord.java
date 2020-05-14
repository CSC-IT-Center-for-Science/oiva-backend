/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables.records;


import com.fasterxml.jackson.databind.JsonNode;

import fi.minedu.oiva.backend.model.jooq.tables.Muutos;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MuutosRecord extends UpdatableRecordImpl<MuutosRecord> implements Record20<Long, Long, Long, Long, String, String, String, Long, JsonNode, String, Timestamp, String, Timestamp, Long, String, UUID, String, String, String, Long> {

    private static final long serialVersionUID = 882718869;

    /**
     * Setter for <code>muutos.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>muutos.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>muutos.muutospyynto_id</code>.
     */
    public void setMuutospyyntoId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>muutos.muutospyynto_id</code>.
     */
    @NotNull
    public Long getMuutospyyntoId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>muutos.kohde_id</code>.
     */
    public void setKohdeId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>muutos.kohde_id</code>.
     */
    @NotNull
    public Long getKohdeId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>muutos.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>muutos.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>muutos.koodisto</code>.
     */
    public void setKoodisto(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>muutos.koodisto</code>.
     */
    @Size(max = 255)
    public String getKoodisto() {
        return (String) get(4);
    }

    /**
     * Setter for <code>muutos.koodiarvo</code>.
     */
    public void setKoodiarvo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>muutos.koodiarvo</code>.
     */
    @NotNull
    public String getKoodiarvo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>muutos.arvo</code>.
     */
    public void setArvo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>muutos.arvo</code>.
     */
    @Size(max = 255)
    public String getArvo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>muutos.maaraystyyppi_id</code>.
     */
    public void setMaaraystyyppiId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>muutos.maaraystyyppi_id</code>.
     */
    @NotNull
    public Long getMaaraystyyppiId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>muutos.meta</code>.
     */
    public void setMeta(JsonNode value) {
        set(8, value);
    }

    /**
     * Getter for <code>muutos.meta</code>.
     */
    public JsonNode getMeta() {
        return (JsonNode) get(8);
    }

    /**
     * Setter for <code>muutos.luoja</code>.
     */
    public void setLuoja(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>muutos.luoja</code>.
     */
    public String getLuoja() {
        return (String) get(9);
    }

    /**
     * Setter for <code>muutos.luontipvm</code>.
     */
    public void setLuontipvm(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>muutos.luontipvm</code>.
     */
    public Timestamp getLuontipvm() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>muutos.paivittaja</code>.
     */
    public void setPaivittaja(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>muutos.paivittaja</code>.
     */
    public String getPaivittaja() {
        return (String) get(11);
    }

    /**
     * Setter for <code>muutos.paivityspvm</code>.
     */
    public void setPaivityspvm(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>muutos.paivityspvm</code>.
     */
    public Timestamp getPaivityspvm() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>muutos.maarays_id</code>.
     */
    public void setMaaraysId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>muutos.maarays_id</code>.
     */
    public Long getMaaraysId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>muutos.tila</code>.
     */
    public void setTila(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>muutos.tila</code>.
     */
    @Size(max = 10)
    public String getTila() {
        return (String) get(14);
    }

    /**
     * Setter for <code>muutos.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(15, value);
    }

    /**
     * Getter for <code>muutos.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(15);
    }

    /**
     * Setter for <code>muutos.paatos_tila</code>.
     */
    public void setPaatosTila(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>muutos.paatos_tila</code>.
     */
    @Size(max = 20)
    public String getPaatosTila() {
        return (String) get(16);
    }

    /**
     * Setter for <code>muutos.muutosperustelukoodiarvo</code>.
     */
    public void setMuutosperustelukoodiarvo(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>muutos.muutosperustelukoodiarvo</code>.
     */
    public String getMuutosperustelukoodiarvo() {
        return (String) get(17);
    }

    /**
     * Setter for <code>muutos.org_oid</code>.
     */
    public void setOrgOid(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>muutos.org_oid</code>.
     */
    @Size(max = 255)
    public String getOrgOid() {
        return (String) get(18);
    }

    /**
     * Setter for <code>muutos.parent_maarays_id</code>.
     */
    public void setParentMaaraysId(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>muutos.parent_maarays_id</code>.
     */
    public Long getParentMaaraysId() {
        return (Long) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, Long, Long, Long, String, String, String, Long, JsonNode, String, Timestamp, String, Timestamp, Long, String, UUID, String, String, String, Long> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, Long, Long, Long, String, String, String, Long, JsonNode, String, Timestamp, String, Timestamp, Long, String, UUID, String, String, String, Long> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Muutos.MUUTOS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Muutos.MUUTOS.MUUTOSPYYNTO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Muutos.MUUTOS.KOHDE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Muutos.MUUTOS.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Muutos.MUUTOS.KOODISTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Muutos.MUUTOS.KOODIARVO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Muutos.MUUTOS.ARVO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return Muutos.MUUTOS.MAARAYSTYYPPI_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonNode> field9() {
        return Muutos.MUUTOS.META;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Muutos.MUUTOS.LUOJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Muutos.MUUTOS.LUONTIPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Muutos.MUUTOS.PAIVITTAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return Muutos.MUUTOS.PAIVITYSPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return Muutos.MUUTOS.MAARAYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Muutos.MUUTOS.TILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field16() {
        return Muutos.MUUTOS.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Muutos.MUUTOS.PAATOS_TILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Muutos.MUUTOS.MUUTOSPERUSTELUKOODIARVO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Muutos.MUUTOS.ORG_OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field20() {
        return Muutos.MUUTOS.PARENT_MAARAYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getMuutospyyntoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getKohdeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getKoodisto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getKoodiarvo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getArvo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getMaaraystyyppiId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonNode component9() {
        return getMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getLuoja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getLuontipvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPaivittaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getPaivityspvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getMaaraysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getTila();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component16() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getPaatosTila();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getMuutosperustelukoodiarvo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getOrgOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component20() {
        return getParentMaaraysId();
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
        return getMuutospyyntoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getKohdeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getKoodisto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getKoodiarvo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getArvo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getMaaraystyyppiId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonNode value9() {
        return getMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLuoja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getLuontipvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPaivittaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getPaivityspvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getMaaraysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getTila();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value16() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getPaatosTila();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getMuutosperustelukoodiarvo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getOrgOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value20() {
        return getParentMaaraysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value2(Long value) {
        setMuutospyyntoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value3(Long value) {
        setKohdeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value4(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value5(String value) {
        setKoodisto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value6(String value) {
        setKoodiarvo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value7(String value) {
        setArvo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value8(Long value) {
        setMaaraystyyppiId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value9(JsonNode value) {
        setMeta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value10(String value) {
        setLuoja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value11(Timestamp value) {
        setLuontipvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value12(String value) {
        setPaivittaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value13(Timestamp value) {
        setPaivityspvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value14(Long value) {
        setMaaraysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value15(String value) {
        setTila(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value16(UUID value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value17(String value) {
        setPaatosTila(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value18(String value) {
        setMuutosperustelukoodiarvo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value19(String value) {
        setOrgOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord value20(Long value) {
        setParentMaaraysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosRecord values(Long value1, Long value2, Long value3, Long value4, String value5, String value6, String value7, Long value8, JsonNode value9, String value10, Timestamp value11, String value12, Timestamp value13, Long value14, String value15, UUID value16, String value17, String value18, String value19, Long value20) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MuutosRecord
     */
    public MuutosRecord() {
        super(Muutos.MUUTOS);
    }

    /**
     * Create a detached, initialised MuutosRecord
     */
    public MuutosRecord(Long id, Long muutospyyntoId, Long kohdeId, Long parentId, String koodisto, String koodiarvo, String arvo, Long maaraystyyppiId, JsonNode meta, String luoja, Timestamp luontipvm, String paivittaja, Timestamp paivityspvm, Long maaraysId, String tila, UUID uuid, String paatosTila, String muutosperustelukoodiarvo, String orgOid, Long parentMaaraysId) {
        super(Muutos.MUUTOS);

        set(0, id);
        set(1, muutospyyntoId);
        set(2, kohdeId);
        set(3, parentId);
        set(4, koodisto);
        set(5, koodiarvo);
        set(6, arvo);
        set(7, maaraystyyppiId);
        set(8, meta);
        set(9, luoja);
        set(10, luontipvm);
        set(11, paivittaja);
        set(12, paivityspvm);
        set(13, maaraysId);
        set(14, tila);
        set(15, uuid);
        set(16, paatosTila);
        set(17, muutosperustelukoodiarvo);
        set(18, orgOid);
        set(19, parentMaaraysId);
    }
}
