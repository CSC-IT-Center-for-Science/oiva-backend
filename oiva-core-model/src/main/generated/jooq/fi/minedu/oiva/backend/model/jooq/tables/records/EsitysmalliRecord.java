/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables.records;


import fi.minedu.oiva.backend.model.jooq.tables.Esitysmalli;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class EsitysmalliRecord extends UpdatableRecordImpl<EsitysmalliRecord> implements Record8<Long, String, String, String, Timestamp, String, Timestamp, UUID> {

    private static final long serialVersionUID = 1843232539;

    /**
     * Setter for <code>esitysmalli.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>esitysmalli.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>esitysmalli.templatepath</code>.
     */
    public void setTemplatepath(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>esitysmalli.templatepath</code>.
     */
    @Size(max = 255)
    public String getTemplatepath() {
        return (String) get(1);
    }

    /**
     * Setter for <code>esitysmalli.valituspdf</code>.
     */
    public void setValituspdf(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>esitysmalli.valituspdf</code>.
     */
    @Size(max = 255)
    public String getValituspdf() {
        return (String) get(2);
    }

    /**
     * Setter for <code>esitysmalli.luoja</code>.
     */
    public void setLuoja(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>esitysmalli.luoja</code>.
     */
    public String getLuoja() {
        return (String) get(3);
    }

    /**
     * Setter for <code>esitysmalli.luontipvm</code>.
     */
    public void setLuontipvm(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>esitysmalli.luontipvm</code>.
     */
    public Timestamp getLuontipvm() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>esitysmalli.paivittaja</code>.
     */
    public void setPaivittaja(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>esitysmalli.paivittaja</code>.
     */
    public String getPaivittaja() {
        return (String) get(5);
    }

    /**
     * Setter for <code>esitysmalli.paivityspvm</code>.
     */
    public void setPaivityspvm(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>esitysmalli.paivityspvm</code>.
     */
    public Timestamp getPaivityspvm() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>esitysmalli.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(7, value);
    }

    /**
     * Getter for <code>esitysmalli.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, String, Timestamp, String, Timestamp, UUID> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, String, Timestamp, String, Timestamp, UUID> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Esitysmalli.ESITYSMALLI.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Esitysmalli.ESITYSMALLI.TEMPLATEPATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Esitysmalli.ESITYSMALLI.VALITUSPDF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Esitysmalli.ESITYSMALLI.LUOJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Esitysmalli.ESITYSMALLI.LUONTIPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Esitysmalli.ESITYSMALLI.PAIVITTAJA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Esitysmalli.ESITYSMALLI.PAIVITYSPVM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field8() {
        return Esitysmalli.ESITYSMALLI.UUID;
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
        return getTemplatepath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getValituspdf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLuoja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLuontipvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPaivittaja();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getPaivityspvm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value8() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord value2(String value) {
        setTemplatepath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord value3(String value) {
        setValituspdf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord value4(String value) {
        setLuoja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord value5(Timestamp value) {
        setLuontipvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord value6(String value) {
        setPaivittaja(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord value7(Timestamp value) {
        setPaivityspvm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord value8(UUID value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EsitysmalliRecord values(Long value1, String value2, String value3, String value4, Timestamp value5, String value6, Timestamp value7, UUID value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EsitysmalliRecord
     */
    public EsitysmalliRecord() {
        super(Esitysmalli.ESITYSMALLI);
    }

    /**
     * Create a detached, initialised EsitysmalliRecord
     */
    public EsitysmalliRecord(Long id, String templatepath, String valituspdf, String luoja, Timestamp luontipvm, String paivittaja, Timestamp paivityspvm, UUID uuid) {
        super(Esitysmalli.ESITYSMALLI);

        set(0, id);
        set(1, templatepath);
        set(2, valituspdf);
        set(3, luoja);
        set(4, luontipvm);
        set(5, paivittaja);
        set(6, paivityspvm);
        set(7, uuid);
    }
}
