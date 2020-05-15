/*
 * This file is generated by jOOQ.
 */
package fi.minedu.oiva.backend.model.jooq.tables.records;


import fi.minedu.oiva.backend.model.jooq.tables.LupaLiite;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class LupaLiiteRecord extends UpdatableRecordImpl<LupaLiiteRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = -606525517;

    /**
     * Setter for <code>lupa_liite.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>lupa_liite.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>lupa_liite.lupa_id</code>.
     */
    public void setLupaId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>lupa_liite.lupa_id</code>.
     */
    @NotNull
    public Long getLupaId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>lupa_liite.liite_id</code>.
     */
    public void setLiiteId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>lupa_liite.liite_id</code>.
     */
    @NotNull
    public Long getLiiteId() {
        return (Long) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LupaLiite.LUPA_LIITE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return LupaLiite.LUPA_LIITE.LUPA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return LupaLiite.LUPA_LIITE.LIITE_ID;
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
        return getLupaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getLiiteId();
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
    public Long value3() {
        return getLiiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaLiiteRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaLiiteRecord value2(Long value) {
        setLupaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaLiiteRecord value3(Long value) {
        setLiiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LupaLiiteRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LupaLiiteRecord
     */
    public LupaLiiteRecord() {
        super(LupaLiite.LUPA_LIITE);
    }

    /**
     * Create a detached, initialised LupaLiiteRecord
     */
    public LupaLiiteRecord(Long id, Long lupaId, Long liiteId) {
        super(LupaLiite.LUPA_LIITE);

        set(0, id);
        set(1, lupaId);
        set(2, liiteId);
    }
}
