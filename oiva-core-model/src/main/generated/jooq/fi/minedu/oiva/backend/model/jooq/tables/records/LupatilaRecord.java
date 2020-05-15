/*
 * This file is generated by jOOQ.
 */
package fi.minedu.oiva.backend.model.jooq.tables.records;


import fi.minedu.oiva.backend.model.entity.LupatilaValue;
import fi.minedu.oiva.backend.model.entity.TranslatedString;
import fi.minedu.oiva.backend.model.jooq.tables.Lupatila;

import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class LupatilaRecord extends UpdatableRecordImpl<LupatilaRecord> implements Record4<Long, LupatilaValue, TranslatedString, UUID> {

    private static final long serialVersionUID = -2126640645;

    /**
     * Setter for <code>lupatila.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>lupatila.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>lupatila.tunniste</code>.
     */
    public void setTunniste(LupatilaValue value) {
        set(1, value);
    }

    /**
     * Getter for <code>lupatila.tunniste</code>.
     */
    @NotNull
    public LupatilaValue getTunniste() {
        return (LupatilaValue) get(1);
    }

    /**
     * Setter for <code>lupatila.selite</code>.
     */
    public void setSelite(TranslatedString value) {
        set(2, value);
    }

    /**
     * Getter for <code>lupatila.selite</code>.
     */
    public TranslatedString getSelite() {
        return (TranslatedString) get(2);
    }

    /**
     * Setter for <code>lupatila.uuid</code>.
     */
    public void setUuid(UUID value) {
        set(3, value);
    }

    /**
     * Getter for <code>lupatila.uuid</code>.
     */
    public UUID getUuid() {
        return (UUID) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, LupatilaValue, TranslatedString, UUID> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, LupatilaValue, TranslatedString, UUID> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Lupatila.LUPATILA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LupatilaValue> field2() {
        return Lupatila.LUPATILA.TUNNISTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TranslatedString> field3() {
        return Lupatila.LUPATILA.SELITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field4() {
        return Lupatila.LUPATILA.UUID;
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
    public LupatilaValue component2() {
        return getTunniste();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslatedString component3() {
        return getSelite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component4() {
        return getUuid();
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
    public LupatilaValue value2() {
        return getTunniste();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslatedString value3() {
        return getSelite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value4() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupatilaRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupatilaRecord value2(LupatilaValue value) {
        setTunniste(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupatilaRecord value3(TranslatedString value) {
        setSelite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupatilaRecord value4(UUID value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupatilaRecord values(Long value1, LupatilaValue value2, TranslatedString value3, UUID value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LupatilaRecord
     */
    public LupatilaRecord() {
        super(Lupatila.LUPATILA);
    }

    /**
     * Create a detached, initialised LupatilaRecord
     */
    public LupatilaRecord(Long id, LupatilaValue tunniste, TranslatedString selite, UUID uuid) {
        super(Lupatila.LUPATILA);

        set(0, id);
        set(1, tunniste);
        set(2, selite);
        set(3, uuid);
    }
}
