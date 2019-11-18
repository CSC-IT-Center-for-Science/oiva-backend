/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.jooq.tables;


import fi.minedu.oiva.backend.entity.MaaraystyyppiValue;
import fi.minedu.oiva.backend.entity.MaaraystyyppiValue.Converter;
import fi.minedu.oiva.backend.entity.TranslatedString;
import fi.minedu.oiva.backend.jooq.Keys;
import fi.minedu.oiva.backend.jooq.Oiva;
import fi.minedu.oiva.backend.jooq.TranslatedStringBinding;
import fi.minedu.oiva.backend.jooq.tables.records.MaaraystyyppiRecord;

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
public class Maaraystyyppi extends TableImpl<MaaraystyyppiRecord> {

    private static final long serialVersionUID = 1131416490;

    /**
     * The reference instance of <code>oiva.maaraystyyppi</code>
     */
    public static final Maaraystyyppi MAARAYSTYYPPI = new Maaraystyyppi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MaaraystyyppiRecord> getRecordType() {
        return MaaraystyyppiRecord.class;
    }

    /**
     * The column <code>oiva.maaraystyyppi.id</code>.
     */
    public final TableField<MaaraystyyppiRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('maaraystyyppi_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>oiva.maaraystyyppi.tunniste</code>.
     */
    public final TableField<MaaraystyyppiRecord, MaaraystyyppiValue> TUNNISTE = createField("tunniste", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "", new Converter());

    /**
     * The column <code>oiva.maaraystyyppi.selite</code>.
     */
    public final TableField<MaaraystyyppiRecord, TranslatedString> SELITE = createField("selite", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "", new TranslatedStringBinding());

    /**
     * The column <code>oiva.maaraystyyppi.uuid</code>.
     */
    public final TableField<MaaraystyyppiRecord, UUID> UUID = createField("uuid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v1()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * Create a <code>oiva.maaraystyyppi</code> table reference
     */
    public Maaraystyyppi() {
        this("maaraystyyppi", null);
    }

    /**
     * Create an aliased <code>oiva.maaraystyyppi</code> table reference
     */
    public Maaraystyyppi(String alias) {
        this(alias, MAARAYSTYYPPI);
    }

    private Maaraystyyppi(String alias, Table<MaaraystyyppiRecord> aliased) {
        this(alias, aliased, null);
    }

    private Maaraystyyppi(String alias, Table<MaaraystyyppiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Oiva.OIVA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MaaraystyyppiRecord, Long> getIdentity() {
        return Keys.IDENTITY_MAARAYSTYYPPI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MaaraystyyppiRecord> getPrimaryKey() {
        return Keys.MAARAYSTYYPPI_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MaaraystyyppiRecord>> getKeys() {
        return Arrays.<UniqueKey<MaaraystyyppiRecord>>asList(Keys.MAARAYSTYYPPI_PKEY, Keys.MAARAYSTYYPPI_UUID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Maaraystyyppi as(String alias) {
        return new Maaraystyyppi(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Maaraystyyppi rename(String name) {
        return new Maaraystyyppi(name, null);
    }
}