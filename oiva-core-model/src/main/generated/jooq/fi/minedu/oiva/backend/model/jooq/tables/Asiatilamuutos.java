/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables;


import fi.minedu.oiva.backend.model.jooq.DefaultSchema;
import fi.minedu.oiva.backend.model.jooq.Keys;
import fi.minedu.oiva.backend.model.jooq.tables.records.AsiatilamuutosRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class Asiatilamuutos extends TableImpl<AsiatilamuutosRecord> {

    private static final long serialVersionUID = -875831560;

    /**
     * The reference instance of <code>asiatilamuutos</code>
     */
    public static final Asiatilamuutos ASIATILAMUUTOS = new Asiatilamuutos();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AsiatilamuutosRecord> getRecordType() {
        return AsiatilamuutosRecord.class;
    }

    /**
     * The column <code>asiatilamuutos.id</code>.
     */
    public final TableField<AsiatilamuutosRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('asiatilamuutos_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>asiatilamuutos.alkutila</code>.
     */
    public final TableField<AsiatilamuutosRecord, String> ALKUTILA = createField("alkutila", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>asiatilamuutos.lopputila</code>.
     */
    public final TableField<AsiatilamuutosRecord, String> LOPPUTILA = createField("lopputila", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>asiatilamuutos.muutosaika</code>.
     */
    public final TableField<AsiatilamuutosRecord, Timestamp> MUUTOSAIKA = createField("muutosaika", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>asiatilamuutos.kayttajatunnus</code>.
     */
    public final TableField<AsiatilamuutosRecord, String> KAYTTAJATUNNUS = createField("kayttajatunnus", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>asiatilamuutos</code> table reference
     */
    public Asiatilamuutos() {
        this("asiatilamuutos", null);
    }

    /**
     * Create an aliased <code>asiatilamuutos</code> table reference
     */
    public Asiatilamuutos(String alias) {
        this(alias, ASIATILAMUUTOS);
    }

    private Asiatilamuutos(String alias, Table<AsiatilamuutosRecord> aliased) {
        this(alias, aliased, null);
    }

    private Asiatilamuutos(String alias, Table<AsiatilamuutosRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AsiatilamuutosRecord, Long> getIdentity() {
        return Keys.IDENTITY_ASIATILAMUUTOS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AsiatilamuutosRecord> getPrimaryKey() {
        return Keys.ASIATILAMUUTOS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AsiatilamuutosRecord>> getKeys() {
        return Arrays.<UniqueKey<AsiatilamuutosRecord>>asList(Keys.ASIATILAMUUTOS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Asiatilamuutos as(String alias) {
        return new Asiatilamuutos(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Asiatilamuutos rename(String name) {
        return new Asiatilamuutos(name, null);
    }
}