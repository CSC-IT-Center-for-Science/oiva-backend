/*
 * This file is generated by jOOQ.
 */
package fi.minedu.oiva.backend.model.jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>asiatilamuutos_id_seq</code>
     */
    public static final Sequence<Long> ASIATILAMUUTOS_ID_SEQ = new SequenceImpl<Long>("asiatilamuutos_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>asiatyyppi_id_seq</code>
     */
    public static final Sequence<Long> ASIATYYPPI_ID_SEQ = new SequenceImpl<Long>("asiatyyppi_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>diaarinumero_seq</code>
     */
    public static final Sequence<Long> DIAARINUMERO_SEQ = new SequenceImpl<Long>("diaarinumero_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>esitysmalli_id_seq</code>
     */
    public static final Sequence<Long> ESITYSMALLI_ID_SEQ = new SequenceImpl<Long>("esitysmalli_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>kohde_id_seq</code>
     */
    public static final Sequence<Long> KOHDE_ID_SEQ = new SequenceImpl<Long>("kohde_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>liite_id_seq</code>
     */
    public static final Sequence<Long> LIITE_ID_SEQ = new SequenceImpl<Long>("liite_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>lupahistoria_id_seq</code>
     */
    public static final Sequence<Long> LUPAHISTORIA_ID_SEQ = new SequenceImpl<Long>("lupahistoria_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>lupa_id_seq</code>
     */
    public static final Sequence<Long> LUPA_ID_SEQ = new SequenceImpl<Long>("lupa_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>lupa_liite_id_seq</code>
     */
    public static final Sequence<Long> LUPA_LIITE_ID_SEQ = new SequenceImpl<Long>("lupa_liite_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>lupatila_id_seq</code>
     */
    public static final Sequence<Long> LUPATILA_ID_SEQ = new SequenceImpl<Long>("lupatila_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>maarays_id_seq</code>
     */
    public static final Sequence<Long> MAARAYS_ID_SEQ = new SequenceImpl<Long>("maarays_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>maaraystyyppi_id_seq</code>
     */
    public static final Sequence<Long> MAARAYSTYYPPI_ID_SEQ = new SequenceImpl<Long>("maaraystyyppi_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>muutos_id_seq</code>
     */
    public static final Sequence<Long> MUUTOS_ID_SEQ = new SequenceImpl<Long>("muutos_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>muutospyynto_id_seq</code>
     */
    public static final Sequence<Long> MUUTOSPYYNTO_ID_SEQ = new SequenceImpl<Long>("muutospyynto_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>paatoskierros_id_seq</code>
     */
    public static final Sequence<Long> PAATOSKIERROS_ID_SEQ = new SequenceImpl<Long>("paatoskierros_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
