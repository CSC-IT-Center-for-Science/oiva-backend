/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables;


import fi.minedu.oiva.backend.model.jooq.DefaultSchema;
import fi.minedu.oiva.backend.model.jooq.Indexes;
import fi.minedu.oiva.backend.model.jooq.Keys;
import fi.minedu.oiva.backend.model.jooq.tables.records.MuutospyyntoLiiteRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class MuutospyyntoLiite extends TableImpl<MuutospyyntoLiiteRecord> {

    private static final long serialVersionUID = 1058739103;

    /**
     * The reference instance of <code>muutospyynto_liite</code>
     */
    public static final MuutospyyntoLiite MUUTOSPYYNTO_LIITE = new MuutospyyntoLiite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MuutospyyntoLiiteRecord> getRecordType() {
        return MuutospyyntoLiiteRecord.class;
    }

    /**
     * The column <code>muutospyynto_liite.muutospyynto_id</code>.
     */
    public final TableField<MuutospyyntoLiiteRecord, Long> MUUTOSPYYNTO_ID = createField("muutospyynto_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>muutospyynto_liite.liite_id</code>.
     */
    public final TableField<MuutospyyntoLiiteRecord, Long> LIITE_ID = createField("liite_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>muutospyynto_liite</code> table reference
     */
    public MuutospyyntoLiite() {
        this(DSL.name("muutospyynto_liite"), null);
    }

    /**
     * Create an aliased <code>muutospyynto_liite</code> table reference
     */
    public MuutospyyntoLiite(String alias) {
        this(DSL.name(alias), MUUTOSPYYNTO_LIITE);
    }

    /**
     * Create an aliased <code>muutospyynto_liite</code> table reference
     */
    public MuutospyyntoLiite(Name alias) {
        this(alias, MUUTOSPYYNTO_LIITE);
    }

    private MuutospyyntoLiite(Name alias, Table<MuutospyyntoLiiteRecord> aliased) {
        this(alias, aliased, null);
    }

    private MuutospyyntoLiite(Name alias, Table<MuutospyyntoLiiteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MUUTOSPYYNTO_LIITE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MuutospyyntoLiiteRecord> getPrimaryKey() {
        return Keys.MUUTOSPYYNTO_LIITE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MuutospyyntoLiiteRecord>> getKeys() {
        return Arrays.<UniqueKey<MuutospyyntoLiiteRecord>>asList(Keys.MUUTOSPYYNTO_LIITE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MuutospyyntoLiiteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MuutospyyntoLiiteRecord, ?>>asList(Keys.MUUTOSPYYNTO_LIITE__MUUTOSPYYNTO_LIITE_MUUTOSPYYNTO_ID_FKEY, Keys.MUUTOSPYYNTO_LIITE__MUUTOSPYYNTO_LIITE_LIITE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoLiite as(String alias) {
        return new MuutospyyntoLiite(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutospyyntoLiite as(Name alias) {
        return new MuutospyyntoLiite(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MuutospyyntoLiite rename(String name) {
        return new MuutospyyntoLiite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MuutospyyntoLiite rename(Name name) {
        return new MuutospyyntoLiite(name, null);
    }
}
