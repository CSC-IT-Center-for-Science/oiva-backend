/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.jooq.tables;


import com.fasterxml.jackson.databind.JsonNode;

import fi.minedu.oiva.backend.jooq.Keys;
import fi.minedu.oiva.backend.jooq.Oiva;
import fi.minedu.oiva.backend.jooq.PostgresJSONJacksonBinding;
import fi.minedu.oiva.backend.jooq.tables.records.MuutosRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Muutos extends TableImpl<MuutosRecord> {

    private static final long serialVersionUID = 942090804;

    /**
     * The reference instance of <code>oiva.muutos</code>
     */
    public static final Muutos MUUTOS = new Muutos();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MuutosRecord> getRecordType() {
        return MuutosRecord.class;
    }

    /**
     * The column <code>oiva.muutos.id</code>.
     */
    public final TableField<MuutosRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('muutos_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>oiva.muutos.muutospyynto_id</code>.
     */
    public final TableField<MuutosRecord, Long> MUUTOSPYYNTO_ID = createField("muutospyynto_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>oiva.muutos.kohde_id</code>.
     */
    public final TableField<MuutosRecord, Long> KOHDE_ID = createField("kohde_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>oiva.muutos.parent_id</code>.
     */
    public final TableField<MuutosRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>oiva.muutos.koodisto</code>.
     */
    public final TableField<MuutosRecord, String> KOODISTO = createField("koodisto", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>oiva.muutos.koodiarvo</code>.
     */
    public final TableField<MuutosRecord, String> KOODIARVO = createField("koodiarvo", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>oiva.muutos.arvo</code>.
     */
    public final TableField<MuutosRecord, String> ARVO = createField("arvo", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>oiva.muutos.maaraystyyppi_id</code>.
     */
    public final TableField<MuutosRecord, Long> MAARAYSTYYPPI_ID = createField("maaraystyyppi_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>oiva.muutos.meta</code>.
     */
    public final TableField<MuutosRecord, JsonNode> META = createField("meta", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "", new PostgresJSONJacksonBinding());

    /**
     * The column <code>oiva.muutos.luoja</code>.
     */
    public final TableField<MuutosRecord, String> LUOJA = createField("luoja", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>oiva.muutos.luontipvm</code>.
     */
    public final TableField<MuutosRecord, Timestamp> LUONTIPVM = createField("luontipvm", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>oiva.muutos.paivittaja</code>.
     */
    public final TableField<MuutosRecord, String> PAIVITTAJA = createField("paivittaja", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>oiva.muutos.paivityspvm</code>.
     */
    public final TableField<MuutosRecord, Timestamp> PAIVITYSPVM = createField("paivityspvm", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>oiva.muutos.maarays_id</code>.
     */
    public final TableField<MuutosRecord, Long> MAARAYS_ID = createField("maarays_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>oiva.muutos.tila</code>.
     */
    public final TableField<MuutosRecord, String> TILA = createField("tila", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>oiva.muutos.uuid</code>.
     */
    public final TableField<MuutosRecord, UUID> UUID = createField("uuid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v1()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * Create a <code>oiva.muutos</code> table reference
     */
    public Muutos() {
        this("muutos", null);
    }

    /**
     * Create an aliased <code>oiva.muutos</code> table reference
     */
    public Muutos(String alias) {
        this(alias, MUUTOS);
    }

    private Muutos(String alias, Table<MuutosRecord> aliased) {
        this(alias, aliased, null);
    }

    private Muutos(String alias, Table<MuutosRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MuutosRecord, Long> getIdentity() {
        return Keys.IDENTITY_MUUTOS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MuutosRecord> getPrimaryKey() {
        return Keys.MUUTOS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MuutosRecord>> getKeys() {
        return Arrays.<UniqueKey<MuutosRecord>>asList(Keys.MUUTOS_PKEY, Keys.MUUTOS_UUID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MuutosRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MuutosRecord, ?>>asList(Keys.MUUTOS__FK_MUUTOSPYYNTO, Keys.MUUTOS__FK_KOHDE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Muutos as(String alias) {
        return new Muutos(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Muutos rename(String name) {
        return new Muutos(name, null);
    }
}
