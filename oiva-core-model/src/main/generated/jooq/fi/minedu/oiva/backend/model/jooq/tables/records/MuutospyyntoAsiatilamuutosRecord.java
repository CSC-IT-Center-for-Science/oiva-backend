/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables.records;


import fi.minedu.oiva.backend.model.jooq.tables.MuutospyyntoAsiatilamuutos;

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
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MuutospyyntoAsiatilamuutosRecord extends UpdatableRecordImpl<MuutospyyntoAsiatilamuutosRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -804549595;

    /**
     * Setter for <code>muutospyynto_asiatilamuutos.muutospyynto_id</code>.
     */
    public void setMuutospyyntoId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>muutospyynto_asiatilamuutos.muutospyynto_id</code>.
     */
    @NotNull
    public Long getMuutospyyntoId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>muutospyynto_asiatilamuutos.asiatilamuutos_id</code>.
     */
    public void setAsiatilamuutosId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>muutospyynto_asiatilamuutos.asiatilamuutos_id</code>.
     */
    @NotNull
    public Long getAsiatilamuutosId() {
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
        return MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS.MUUTOSPYYNTO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS.ASIATILAMUUTOS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getMuutospyyntoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getAsiatilamuutosId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getMuutospyyntoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getAsiatilamuutosId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoAsiatilamuutosRecord value1(Long value) {
        setMuutospyyntoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoAsiatilamuutosRecord value2(Long value) {
        setAsiatilamuutosId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoAsiatilamuutosRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MuutospyyntoAsiatilamuutosRecord
     */
    public MuutospyyntoAsiatilamuutosRecord() {
        super(MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS);
    }

    /**
     * Create a detached, initialised MuutospyyntoAsiatilamuutosRecord
     */
    public MuutospyyntoAsiatilamuutosRecord(Long muutospyyntoId, Long asiatilamuutosId) {
        super(MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS);

        set(0, muutospyyntoId);
        set(1, asiatilamuutosId);
    }
}
