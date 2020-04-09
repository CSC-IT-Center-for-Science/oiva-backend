/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq.tables;


import com.fasterxml.jackson.databind.JsonNode;

import fi.minedu.oiva.backend.model.jooq.DefaultSchema;
import fi.minedu.oiva.backend.model.jooq.Keys;
import fi.minedu.oiva.backend.model.jooq.PostgresJSONJacksonBinding;
import fi.minedu.oiva.backend.model.jooq.tables.records.MuutospyyntoRecord;

import java.sql.Date;
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
public class Muutospyynto extends TableImpl<MuutospyyntoRecord> {

    private static final long serialVersionUID = -1813649814;

    /**
     * The reference instance of <code>muutospyynto</code>
     */
    public static final Muutospyynto MUUTOSPYYNTO = new Muutospyynto();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MuutospyyntoRecord> getRecordType() {
        return MuutospyyntoRecord.class;
    }

    /**
     * The column <code>muutospyynto.id</code>.
     */
    public final TableField<MuutospyyntoRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('muutospyynto_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>muutospyynto.lupa_id</code>.
     */
    public final TableField<MuutospyyntoRecord, Long> LUPA_ID = createField("lupa_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>muutospyynto.hakupvm</code>.
     */
    public final TableField<MuutospyyntoRecord, Date> HAKUPVM = createField("hakupvm", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>muutospyynto.voimassaalkupvm</code>.
     */
    public final TableField<MuutospyyntoRecord, Date> VOIMASSAALKUPVM = createField("voimassaalkupvm", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>muutospyynto.voimassaloppupvm</code>.
     */
    public final TableField<MuutospyyntoRecord, Date> VOIMASSALOPPUPVM = createField("voimassaloppupvm", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>muutospyynto.paatoskierros_id</code>.
     */
    public final TableField<MuutospyyntoRecord, Long> PAATOSKIERROS_ID = createField("paatoskierros_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>muutospyynto.tila</code>.
     */
    public final TableField<MuutospyyntoRecord, String> TILA = createField("tila", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>muutospyynto.jarjestaja_ytunnus</code>.
     */
    public final TableField<MuutospyyntoRecord, String> JARJESTAJA_YTUNNUS = createField("jarjestaja_ytunnus", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>muutospyynto.luoja</code>.
     */
    public final TableField<MuutospyyntoRecord, String> LUOJA = createField("luoja", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>muutospyynto.luontipvm</code>.
     */
    public final TableField<MuutospyyntoRecord, Timestamp> LUONTIPVM = createField("luontipvm", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>muutospyynto.paivittaja</code>.
     */
    public final TableField<MuutospyyntoRecord, String> PAIVITTAJA = createField("paivittaja", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>muutospyynto.paivityspvm</code>.
     */
    public final TableField<MuutospyyntoRecord, Timestamp> PAIVITYSPVM = createField("paivityspvm", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>muutospyynto.uuid</code>.
     */
    public final TableField<MuutospyyntoRecord, UUID> UUID = createField("uuid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v1()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>muutospyynto.meta</code>.
     */
    public final TableField<MuutospyyntoRecord, JsonNode> META = createField("meta", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "", new PostgresJSONJacksonBinding());

    /**
     * The column <code>muutospyynto.alkupera</code>.
     */
    public final TableField<MuutospyyntoRecord, String> ALKUPERA = createField("alkupera", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>muutospyynto.asianumero</code>.
     */
    public final TableField<MuutospyyntoRecord, String> ASIANUMERO = createField("asianumero", org.jooq.impl.SQLDataType.VARCHAR.length(16).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>muutospyynto.paatospvm</code>.
     */
    public final TableField<MuutospyyntoRecord, Date> PAATOSPVM = createField("paatospvm", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * Create a <code>muutospyynto</code> table reference
     */
    public Muutospyynto() {
        this("muutospyynto", null);
    }

    /**
     * Create an aliased <code>muutospyynto</code> table reference
     */
    public Muutospyynto(String alias) {
        this(alias, MUUTOSPYYNTO);
    }

    private Muutospyynto(String alias, Table<MuutospyyntoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Muutospyynto(String alias, Table<MuutospyyntoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MuutospyyntoRecord, Long> getIdentity() {
        return Keys.IDENTITY_MUUTOSPYYNTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MuutospyyntoRecord> getPrimaryKey() {
        return Keys.MUUTOSPYYNTO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MuutospyyntoRecord>> getKeys() {
        return Arrays.<UniqueKey<MuutospyyntoRecord>>asList(Keys.MUUTOSPYYNTO_PKEY, Keys.MUUTOSPYYNTO_UUID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MuutospyyntoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MuutospyyntoRecord, ?>>asList(Keys.MUUTOSPYYNTO__FK_LUPA, Keys.MUUTOSPYYNTO__FK_PAATOSKIERROS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Muutospyynto as(String alias) {
        return new Muutospyynto(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Muutospyynto rename(String name) {
        return new Muutospyynto(name, null);
    }
}
