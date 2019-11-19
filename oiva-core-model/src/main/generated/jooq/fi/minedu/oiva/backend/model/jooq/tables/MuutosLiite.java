/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables;


import fi.minedu.oiva.backend.model.jooq.DefaultSchema;
import fi.minedu.oiva.backend.model.jooq.Keys;
import fi.minedu.oiva.backend.model.jooq.tables.records.MuutosLiiteRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class MuutosLiite extends TableImpl<MuutosLiiteRecord> {

    private static final long serialVersionUID = -2101758756;

    /**
     * The reference instance of <code>muutos_liite</code>
     */
    public static final MuutosLiite MUUTOS_LIITE = new MuutosLiite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MuutosLiiteRecord> getRecordType() {
        return MuutosLiiteRecord.class;
    }

    /**
     * The column <code>muutos_liite.muutos_id</code>.
     */
    public final TableField<MuutosLiiteRecord, Long> MUUTOS_ID = createField("muutos_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>muutos_liite.liite_id</code>.
     */
    public final TableField<MuutosLiiteRecord, Long> LIITE_ID = createField("liite_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>muutos_liite</code> table reference
     */
    public MuutosLiite() {
        this("muutos_liite", null);
    }

    /**
     * Create an aliased <code>muutos_liite</code> table reference
     */
    public MuutosLiite(String alias) {
        this(alias, MUUTOS_LIITE);
    }

    private MuutosLiite(String alias, Table<MuutosLiiteRecord> aliased) {
        this(alias, aliased, null);
    }

    private MuutosLiite(String alias, Table<MuutosLiiteRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<MuutosLiiteRecord> getPrimaryKey() {
        return Keys.MUUTOS_LIITE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MuutosLiiteRecord>> getKeys() {
        return Arrays.<UniqueKey<MuutosLiiteRecord>>asList(Keys.MUUTOS_LIITE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MuutosLiiteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MuutosLiiteRecord, ?>>asList(Keys.MUUTOS_LIITE__MUUTOS_LIITE_MUUTOS_ID_FKEY, Keys.MUUTOS_LIITE__MUUTOS_LIITE_LIITE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuutosLiite as(String alias) {
        return new MuutosLiite(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MuutosLiite rename(String name) {
        return new MuutosLiite(name, null);
    }
}