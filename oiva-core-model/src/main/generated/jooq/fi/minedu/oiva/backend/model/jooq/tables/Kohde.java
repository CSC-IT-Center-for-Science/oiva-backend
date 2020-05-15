/*
 * This file is generated by jOOQ.
 */
package fi.minedu.oiva.backend.model.jooq.tables;


import com.fasterxml.jackson.databind.JsonNode;

import fi.minedu.oiva.backend.model.jooq.DefaultSchema;
import fi.minedu.oiva.backend.model.jooq.Indexes;
import fi.minedu.oiva.backend.model.jooq.Keys;
import fi.minedu.oiva.backend.model.jooq.PostgresJSONJacksonBinding;
import fi.minedu.oiva.backend.model.jooq.tables.records.KohdeRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Kohde extends TableImpl<KohdeRecord> {

    private static final long serialVersionUID = 1693877028;

    /**
     * The reference instance of <code>kohde</code>
     */
    public static final Kohde KOHDE = new Kohde();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KohdeRecord> getRecordType() {
        return KohdeRecord.class;
    }

    /**
     * The column <code>kohde.id</code>.
     */
    public final TableField<KohdeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('kohde_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>kohde.tunniste</code>.
     */
    public final TableField<KohdeRecord, String> TUNNISTE = createField("tunniste", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>kohde.meta</code>.
     */
    public final TableField<KohdeRecord, JsonNode> META = createField("meta", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""), this, "", new PostgresJSONJacksonBinding());

    /**
     * The column <code>kohde.luoja</code>.
     */
    public final TableField<KohdeRecord, String> LUOJA = createField("luoja", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>kohde.luontipvm</code>.
     */
    public final TableField<KohdeRecord, Timestamp> LUONTIPVM = createField("luontipvm", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>kohde.paivittaja</code>.
     */
    public final TableField<KohdeRecord, String> PAIVITTAJA = createField("paivittaja", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>kohde.paivityspvm</code>.
     */
    public final TableField<KohdeRecord, Timestamp> PAIVITYSPVM = createField("paivityspvm", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>kohde.uuid</code>.
     */
    public final TableField<KohdeRecord, UUID> UUID = createField("uuid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v1()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>kohde.koulutustyyppi</code>.
     */
    public final TableField<KohdeRecord, String> KOULUTUSTYYPPI = createField("koulutustyyppi", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>kohde</code> table reference
     */
    public Kohde() {
        this(DSL.name("kohde"), null);
    }

    /**
     * Create an aliased <code>kohde</code> table reference
     */
    public Kohde(String alias) {
        this(DSL.name(alias), KOHDE);
    }

    /**
     * Create an aliased <code>kohde</code> table reference
     */
    public Kohde(Name alias) {
        this(alias, KOHDE);
    }

    private Kohde(Name alias, Table<KohdeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Kohde(Name alias, Table<KohdeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Kohde(Table<O> child, ForeignKey<O, KohdeRecord> key) {
        super(child, key, KOHDE);
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
        return Arrays.<Index>asList(Indexes.KOHDE_PKEY, Indexes.KOHDE_UUID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<KohdeRecord, Long> getIdentity() {
        return Keys.IDENTITY_KOHDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<KohdeRecord> getPrimaryKey() {
        return Keys.KOHDE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<KohdeRecord>> getKeys() {
        return Arrays.<UniqueKey<KohdeRecord>>asList(Keys.KOHDE_PKEY, Keys.KOHDE_UUID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Kohde as(String alias) {
        return new Kohde(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Kohde as(Name alias) {
        return new Kohde(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Kohde rename(String name) {
        return new Kohde(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Kohde rename(Name name) {
        return new Kohde(name, null);
    }
}
