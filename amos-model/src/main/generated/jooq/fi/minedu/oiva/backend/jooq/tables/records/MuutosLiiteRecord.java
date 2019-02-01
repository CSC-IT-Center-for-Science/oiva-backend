/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.jooq.tables.records;


import fi.minedu.oiva.backend.jooq.tables.MuutosLiite;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class MuutosLiiteRecord extends UpdatableRecordImpl<MuutosLiiteRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -766753241;

    /**
     * Setter for <code>oiva.muutos_liite.muutos_id</code>.
     */
    public void setMuutosId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>oiva.muutos_liite.muutos_id</code>.
     */
    @NotNull
    public Long getMuutosId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>oiva.muutos_liite.liite_id</code>.
     */
    public void setLiiteId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>oiva.muutos_liite.liite_id</code>.
     */
    @NotNull
    public Long getLiiteId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MuutosLiite.MUUTOS_LIITE.MUUTOS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MuutosLiite.MUUTOS_LIITE.LIITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getMuutosId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getLiiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosLiiteRecord value1(Long value) {
        setMuutosId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosLiiteRecord value2(Long value) {
        setLiiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosLiiteRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MuutosLiiteRecord
     */
    public MuutosLiiteRecord() {
        super(MuutosLiite.MUUTOS_LIITE);
    }

    /**
     * Create a detached, initialised MuutosLiiteRecord
     */
    public MuutosLiiteRecord(Long muutosId, Long liiteId) {
        super(MuutosLiite.MUUTOS_LIITE);

        set(0, muutosId);
        set(1, liiteId);
    }
}
