/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.jooq.tables;


import fi.minedu.oiva.backend.entity.LupatilaValue;
import fi.minedu.oiva.backend.entity.LupatilaValue.Converter;
import fi.minedu.oiva.backend.entity.TranslatedString;
import fi.minedu.oiva.backend.jooq.DefaultSchema;
import fi.minedu.oiva.backend.jooq.Keys;
import fi.minedu.oiva.backend.jooq.TranslatedStringBinding;
import fi.minedu.oiva.backend.jooq.tables.records.LupatilaRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
public class Lupatila extends TableImpl<LupatilaRecord> {

    private static final long serialVersionUID = 156993832;

    /**
     * The reference instance of <code>lupatila</code>
     */
    public static final Lupatila LUPATILA = new Lupatila();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LupatilaRecord> getRecordType() {
        return LupatilaRecord.class;
    }

    /**
     * The column <code>lupatila.id</code>.
     */
    public final TableField<LupatilaRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lupatila_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>lupatila.tunniste</code>.
     */
    public final TableField<LupatilaRecord, LupatilaValue> TUNNISTE = createField("tunniste", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "", new Converter());

    /**
     * The column <code>lupatila.selite</code>.
     */
    public final TableField<LupatilaRecord, TranslatedString> SELITE = createField("selite", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "", new TranslatedStringBinding());

    /**
     * The column <code>lupatila.uuid</code>.
     */
    public final TableField<LupatilaRecord, UUID> UUID = createField("uuid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v1()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * Create a <code>lupatila</code> table reference
     */
    public Lupatila() {
        this("lupatila", null);
    }

    /**
     * Create an aliased <code>lupatila</code> table reference
     */
    public Lupatila(String alias) {
        this(alias, LUPATILA);
    }

    private Lupatila(String alias, Table<LupatilaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Lupatila(String alias, Table<LupatilaRecord> aliased, Field<?>[] parameters) {
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
    public Identity<LupatilaRecord, Long> getIdentity() {
        return Keys.IDENTITY_LUPATILA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LupatilaRecord> getPrimaryKey() {
        return Keys.LUPATILA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LupatilaRecord>> getKeys() {
        return Arrays.<UniqueKey<LupatilaRecord>>asList(Keys.LUPATILA_PKEY, Keys.LUPATILA_UUID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lupatila as(String alias) {
        return new Lupatila(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Lupatila rename(String name) {
        return new Lupatila(name, null);
    }
}