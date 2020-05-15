/*
 * This file is generated by jOOQ.
 */
package fi.minedu.oiva.backend.model.jooq.tables.records;


import com.fasterxml.jackson.databind.JsonNode;

import fi.minedu.oiva.backend.model.jooq.tables.Liite;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LiiteRecord extends UpdatableRecordImpl<LiiteRecord> implements Record16<Long, String, String, Boolean, String, Timestamp, String, Timestamp, Long, JsonNode, String, String, UUID, Boolean, String, String> {

    private static final long serialVersionUID = 1169657394;

    /**
     * Setter for <code>liite.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>liite.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>liite.nimi</code>.
     */
    public void setNimi(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>liite.nimi</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getNimi() {
        return (String) get(1);
    }

    /**
     * Setter for <code>liite.polku</code>.
     */
    public void setPolku(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>liite.polku</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getPolku() {
        return (String) get(2);
    }

    /**
     * Setter for <code>liite.tila</code>.
     */
    public void setTila(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>liite.tila</code>.
     */
    public Boolean getTila() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>liite.luoja</code>.
     */
    public void setLuoja(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>liite.luoja</code>.
     */
    @NotNull
    public String getLuoja() {
        return (String) get(4);
    }

    /**
     * Setter for <code>liite.luontipvm</code>.
     */
    public void setLuontipvm(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>liite.luontipvm</code>.
     */
    public Timestamp getLuontipvm() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>liite.paivittaja</code>.
     */
    public void setPaivittaja(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>liite.paivittaja</code>.
     */
    public String getPaivittaja() {
        return (String) get(6);
    }

    /**
     * Setter for <code>liite.paivityspvm</code>.
     */
    public void setPaivityspvm(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>liite.paivityspvm</code>.
     */
    public Timestamp getPaivityspvm() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>liite.koko</code>.
     */
    public void setKoko(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>liite.koko</code>.
     */
    public Long getKoko() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>liite.meta</code>.
     */
    public void setMeta(JsonNode value) {
        set(9, value);
    }

    /**
     * Getter for <code>liite.meta</code>.
     */
    public JsonNode getMeta() {
        return (JsonNode) get(9);
    }

    /**
     * Setter for <code>liite.tyyppi</code>.
     */
    public void setTyyppi(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>liite.tyyppi</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getTyyppi() {
        return (String) get(10);
    }

    /**
     * Setter for <code>liite.kieli</code>.
     */
    public void setKieli(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>liite.kieli</code>.
     */
    @NotNull
    @Size(max = 2)
    public String getKieli() {
        return (String) get(11);
    }

    /**
     * Setter for <code>liite.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(12, value);
    }

    /**
     * Getter for <code>liite.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(12);
    }

    /**
     * Setter for <code>liite.salainen</code>.
     */
    public void setSalainen(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>liite.salainen</code>.
     */
    public Boolean getSalainen() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>liite.paikka</code>.
     */
    public void setPaikka(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>liite.paikka</code>.
     */
    @Size(max = 255)
    public String getPaikka() {
        return (String) get(14);
    }

    /**
     * Setter for <code>liite.tiedosto_id</code>.
     */
    public void setTiedostoId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>liite.tiedosto_id</code>.
     */
    @Size(max = 255)
    public String getTiedostoId() {
        return (String) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, Boolean, String, Timestamp, String, Timestamp, Long, JsonNode, String, String, UUID, Boolean, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, Boolean, String, Timestamp, String, Timestamp, Long, JsonNode, String, String, UUID, Boolean, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Liite.LIITE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Liite.LIITE.NIMI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Liite.LIITE.POLKU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Liite.LIITE.TILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Liite.LIITE.LUOJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Liite.LIITE.LUONTIPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Liite.LIITE.PAIVITTAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Liite.LIITE.PAIVITYSPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return Liite.LIITE.KOKO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonNode> field10() {
        return Liite.LIITE.META;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Liite.LIITE.TYYPPI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Liite.LIITE.KIELI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field13() {
        return Liite.LIITE.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Liite.LIITE.SALAINEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Liite.LIITE.PAIKKA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Liite.LIITE.TIEDOSTO_ID;
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
    public String component2() {
        return getNimi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPolku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getTila();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLuoja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getLuontipvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPaivittaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getPaivityspvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getKoko();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonNode component10() {
        return getMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getTyyppi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getKieli();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component13() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getSalainen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getPaikka();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getTiedostoId();
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
    public String value2() {
        return getNimi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPolku();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getTila();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLuoja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLuontipvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPaivittaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getPaivityspvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getKoko();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonNode value10() {
        return getMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTyyppi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getKieli();
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
    public Boolean value14() {
        return getSalainen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getPaikka();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getTiedostoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value2(String value) {
        setNimi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value3(String value) {
        setPolku(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value4(Boolean value) {
        setTila(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value5(String value) {
        setLuoja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value6(Timestamp value) {
        setLuontipvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value7(String value) {
        setPaivittaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value8(Timestamp value) {
        setPaivityspvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value9(Long value) {
        setKoko(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value10(JsonNode value) {
        setMeta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value11(String value) {
        setTyyppi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value12(String value) {
        setKieli(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value13(UUID value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value14(Boolean value) {
        setSalainen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value15(String value) {
        setPaikka(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord value16(String value) {
        setTiedostoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LiiteRecord values(Long value1, String value2, String value3, Boolean value4, String value5, Timestamp value6, String value7, Timestamp value8, Long value9, JsonNode value10, String value11, String value12, UUID value13, Boolean value14, String value15, String value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LiiteRecord
     */
    public LiiteRecord() {
        super(Liite.LIITE);
    }

    /**
     * Create a detached, initialised LiiteRecord
     */
    public LiiteRecord(Long id, String nimi, String polku, Boolean tila, String luoja, Timestamp luontipvm, String paivittaja, Timestamp paivityspvm, Long koko, JsonNode meta, String tyyppi, String kieli, UUID uuid, Boolean salainen, String paikka, String tiedostoId) {
        super(Liite.LIITE);

        set(0, id);
        set(1, nimi);
        set(2, polku);
        set(3, tila);
        set(4, luoja);
        set(5, luontipvm);
        set(6, paivittaja);
        set(7, paivityspvm);
        set(8, koko);
        set(9, meta);
        set(10, tyyppi);
        set(11, kieli);
        set(12, uuid);
        set(13, salainen);
        set(14, paikka);
        set(15, tiedostoId);
    }
}
