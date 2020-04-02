/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.model.jooq;


import fi.minedu.oiva.backend.model.jooq.tables.Asiatilamuutos;
import fi.minedu.oiva.backend.model.jooq.tables.Asiatyyppi;
import fi.minedu.oiva.backend.model.jooq.tables.Esitysmalli;
import fi.minedu.oiva.backend.model.jooq.tables.Kohde;
import fi.minedu.oiva.backend.model.jooq.tables.Liite;
import fi.minedu.oiva.backend.model.jooq.tables.Lupa;
import fi.minedu.oiva.backend.model.jooq.tables.LupaLiite;
import fi.minedu.oiva.backend.model.jooq.tables.Lupahistoria;
import fi.minedu.oiva.backend.model.jooq.tables.Lupatila;
import fi.minedu.oiva.backend.model.jooq.tables.Maarays;
import fi.minedu.oiva.backend.model.jooq.tables.Maaraystyyppi;
import fi.minedu.oiva.backend.model.jooq.tables.Muutos;
import fi.minedu.oiva.backend.model.jooq.tables.MuutosLiite;
import fi.minedu.oiva.backend.model.jooq.tables.Muutospyynto;
import fi.minedu.oiva.backend.model.jooq.tables.MuutospyyntoAsiatilamuutos;
import fi.minedu.oiva.backend.model.jooq.tables.MuutospyyntoLiite;
import fi.minedu.oiva.backend.model.jooq.tables.Paatoskierros;
import fi.minedu.oiva.backend.model.jooq.tables.records.AsiatilamuutosRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.AsiatyyppiRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.EsitysmalliRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.KohdeRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.LiiteRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.LupaLiiteRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.LupaRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.LupahistoriaRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.LupatilaRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.MaaraysRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.MaaraystyyppiRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.MuutosLiiteRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.MuutosRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.MuutospyyntoAsiatilamuutosRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.MuutospyyntoLiiteRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.MuutospyyntoRecord;
import fi.minedu.oiva.backend.model.jooq.tables.records.PaatoskierrosRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code></code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AsiatilamuutosRecord, Long> IDENTITY_ASIATILAMUUTOS = Identities0.IDENTITY_ASIATILAMUUTOS;
    public static final Identity<AsiatyyppiRecord, Long> IDENTITY_ASIATYYPPI = Identities0.IDENTITY_ASIATYYPPI;
    public static final Identity<EsitysmalliRecord, Long> IDENTITY_ESITYSMALLI = Identities0.IDENTITY_ESITYSMALLI;
    public static final Identity<KohdeRecord, Long> IDENTITY_KOHDE = Identities0.IDENTITY_KOHDE;
    public static final Identity<LiiteRecord, Long> IDENTITY_LIITE = Identities0.IDENTITY_LIITE;
    public static final Identity<LupaRecord, Long> IDENTITY_LUPA = Identities0.IDENTITY_LUPA;
    public static final Identity<LupaLiiteRecord, Long> IDENTITY_LUPA_LIITE = Identities0.IDENTITY_LUPA_LIITE;
    public static final Identity<LupahistoriaRecord, Long> IDENTITY_LUPAHISTORIA = Identities0.IDENTITY_LUPAHISTORIA;
    public static final Identity<LupatilaRecord, Long> IDENTITY_LUPATILA = Identities0.IDENTITY_LUPATILA;
    public static final Identity<MaaraysRecord, Long> IDENTITY_MAARAYS = Identities0.IDENTITY_MAARAYS;
    public static final Identity<MaaraystyyppiRecord, Long> IDENTITY_MAARAYSTYYPPI = Identities0.IDENTITY_MAARAYSTYYPPI;
    public static final Identity<MuutosRecord, Long> IDENTITY_MUUTOS = Identities0.IDENTITY_MUUTOS;
    public static final Identity<MuutospyyntoRecord, Long> IDENTITY_MUUTOSPYYNTO = Identities0.IDENTITY_MUUTOSPYYNTO;
    public static final Identity<PaatoskierrosRecord, Long> IDENTITY_PAATOSKIERROS = Identities0.IDENTITY_PAATOSKIERROS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AsiatilamuutosRecord> ASIATILAMUUTOS_PKEY = UniqueKeys0.ASIATILAMUUTOS_PKEY;
    public static final UniqueKey<AsiatyyppiRecord> ASIATYYPPI_PKEY = UniqueKeys0.ASIATYYPPI_PKEY;
    public static final UniqueKey<AsiatyyppiRecord> ASIATYYPPI_UUID_KEY = UniqueKeys0.ASIATYYPPI_UUID_KEY;
    public static final UniqueKey<EsitysmalliRecord> ESITYSMALLI_PKEY = UniqueKeys0.ESITYSMALLI_PKEY;
    public static final UniqueKey<EsitysmalliRecord> ESITYSMALLI_UUID_KEY = UniqueKeys0.ESITYSMALLI_UUID_KEY;
    public static final UniqueKey<KohdeRecord> KOHDE_PKEY = UniqueKeys0.KOHDE_PKEY;
    public static final UniqueKey<KohdeRecord> KOHDE_UUID_KEY = UniqueKeys0.KOHDE_UUID_KEY;
    public static final UniqueKey<LiiteRecord> LIITE_PKEY = UniqueKeys0.LIITE_PKEY;
    public static final UniqueKey<LiiteRecord> LIITE_UUID_KEY = UniqueKeys0.LIITE_UUID_KEY;
    public static final UniqueKey<LupaRecord> LUPA_PKEY = UniqueKeys0.LUPA_PKEY;
    public static final UniqueKey<LupaRecord> LUPA_UUID_KEY = UniqueKeys0.LUPA_UUID_KEY;
    public static final UniqueKey<LupaLiiteRecord> LUPA_LIITE_PKEY = UniqueKeys0.LUPA_LIITE_PKEY;
    public static final UniqueKey<LupahistoriaRecord> LUPAHISTORIA_PKEY = UniqueKeys0.LUPAHISTORIA_PKEY;
    public static final UniqueKey<LupahistoriaRecord> LUPAHISTORIA_UUID_KEY = UniqueKeys0.LUPAHISTORIA_UUID_KEY;
    public static final UniqueKey<LupatilaRecord> LUPATILA_PKEY = UniqueKeys0.LUPATILA_PKEY;
    public static final UniqueKey<LupatilaRecord> LUPATILA_UUID_KEY = UniqueKeys0.LUPATILA_UUID_KEY;
    public static final UniqueKey<MaaraysRecord> MAARAYS_PKEY = UniqueKeys0.MAARAYS_PKEY;
    public static final UniqueKey<MaaraysRecord> MAARAYS_UUID_KEY = UniqueKeys0.MAARAYS_UUID_KEY;
    public static final UniqueKey<MaaraystyyppiRecord> MAARAYSTYYPPI_PKEY = UniqueKeys0.MAARAYSTYYPPI_PKEY;
    public static final UniqueKey<MaaraystyyppiRecord> MAARAYSTYYPPI_UUID_KEY = UniqueKeys0.MAARAYSTYYPPI_UUID_KEY;
    public static final UniqueKey<MuutosRecord> MUUTOS_PKEY = UniqueKeys0.MUUTOS_PKEY;
    public static final UniqueKey<MuutosRecord> MUUTOS_UUID_KEY = UniqueKeys0.MUUTOS_UUID_KEY;
    public static final UniqueKey<MuutosLiiteRecord> MUUTOS_LIITE_PKEY = UniqueKeys0.MUUTOS_LIITE_PKEY;
    public static final UniqueKey<MuutospyyntoRecord> MUUTOSPYYNTO_PKEY = UniqueKeys0.MUUTOSPYYNTO_PKEY;
    public static final UniqueKey<MuutospyyntoRecord> MUUTOSPYYNTO_UUID_KEY = UniqueKeys0.MUUTOSPYYNTO_UUID_KEY;
    public static final UniqueKey<MuutospyyntoAsiatilamuutosRecord> MUUTOSPYYNTO_ASIATILAMUUTOS_PKEY = UniqueKeys0.MUUTOSPYYNTO_ASIATILAMUUTOS_PKEY;
    public static final UniqueKey<MuutospyyntoAsiatilamuutosRecord> MUUTOSPYYNTO_ASIATILAMUUTOS_ASIATILAMUUTOS_ID_KEY = UniqueKeys0.MUUTOSPYYNTO_ASIATILAMUUTOS_ASIATILAMUUTOS_ID_KEY;
    public static final UniqueKey<MuutospyyntoLiiteRecord> MUUTOSPYYNTO_LIITE_PKEY = UniqueKeys0.MUUTOSPYYNTO_LIITE_PKEY;
    public static final UniqueKey<PaatoskierrosRecord> PAATOSKIERROS_PKEY = UniqueKeys0.PAATOSKIERROS_PKEY;
    public static final UniqueKey<PaatoskierrosRecord> PAATOSKIERROS_UUID_KEY = UniqueKeys0.PAATOSKIERROS_UUID_KEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<LupaRecord, PaatoskierrosRecord> LUPA__FK_PAATOSKIERROS = ForeignKeys0.LUPA__FK_PAATOSKIERROS;
    public static final ForeignKey<LupaRecord, LupatilaRecord> LUPA__FK_LUPATILA = ForeignKeys0.LUPA__FK_LUPATILA;
    public static final ForeignKey<LupaRecord, AsiatyyppiRecord> LUPA__FK_ASIATYYPPI = ForeignKeys0.LUPA__FK_ASIATYYPPI;
    public static final ForeignKey<LupaLiiteRecord, LupaRecord> LUPA_LIITE__FK_LUPA = ForeignKeys0.LUPA_LIITE__FK_LUPA;
    public static final ForeignKey<LupaLiiteRecord, LiiteRecord> LUPA_LIITE__FK_LIITE = ForeignKeys0.LUPA_LIITE__FK_LIITE;
    public static final ForeignKey<LupahistoriaRecord, LupaRecord> LUPAHISTORIA__LUPAHISTORIA_LUPA_ID_FKEY = ForeignKeys0.LUPAHISTORIA__LUPAHISTORIA_LUPA_ID_FKEY;
    public static final ForeignKey<MaaraysRecord, LupaRecord> MAARAYS__FK_LUPA = ForeignKeys0.MAARAYS__FK_LUPA;
    public static final ForeignKey<MaaraysRecord, KohdeRecord> MAARAYS__FK_KOHDE = ForeignKeys0.MAARAYS__FK_KOHDE;
    public static final ForeignKey<MaaraysRecord, MaaraystyyppiRecord> MAARAYS__FK_MAARAYSTYYPPI = ForeignKeys0.MAARAYS__FK_MAARAYSTYYPPI;
    public static final ForeignKey<MuutosRecord, MuutospyyntoRecord> MUUTOS__FK_MUUTOSPYYNTO = ForeignKeys0.MUUTOS__FK_MUUTOSPYYNTO;
    public static final ForeignKey<MuutosRecord, KohdeRecord> MUUTOS__FK_KOHDE = ForeignKeys0.MUUTOS__FK_KOHDE;
    public static final ForeignKey<MuutosLiiteRecord, MuutosRecord> MUUTOS_LIITE__MUUTOS_LIITE_MUUTOS_ID_FKEY = ForeignKeys0.MUUTOS_LIITE__MUUTOS_LIITE_MUUTOS_ID_FKEY;
    public static final ForeignKey<MuutosLiiteRecord, LiiteRecord> MUUTOS_LIITE__MUUTOS_LIITE_LIITE_ID_FKEY = ForeignKeys0.MUUTOS_LIITE__MUUTOS_LIITE_LIITE_ID_FKEY;
    public static final ForeignKey<MuutospyyntoRecord, LupaRecord> MUUTOSPYYNTO__FK_LUPA = ForeignKeys0.MUUTOSPYYNTO__FK_LUPA;
    public static final ForeignKey<MuutospyyntoRecord, PaatoskierrosRecord> MUUTOSPYYNTO__FK_PAATOSKIERROS = ForeignKeys0.MUUTOSPYYNTO__FK_PAATOSKIERROS;
    public static final ForeignKey<MuutospyyntoAsiatilamuutosRecord, MuutospyyntoRecord> MUUTOSPYYNTO_ASIATILAMUUTOS__MUUTOSPYYNTO_ASIATILAMUUTOS_MUUTOSPYYNTO_ID_FKEY = ForeignKeys0.MUUTOSPYYNTO_ASIATILAMUUTOS__MUUTOSPYYNTO_ASIATILAMUUTOS_MUUTOSPYYNTO_ID_FKEY;
    public static final ForeignKey<MuutospyyntoAsiatilamuutosRecord, AsiatilamuutosRecord> MUUTOSPYYNTO_ASIATILAMUUTOS__MUUTOSPYYNTO_ASIATILAMUUTOS_ASIATILAMUUTOS_ID_FKEY = ForeignKeys0.MUUTOSPYYNTO_ASIATILAMUUTOS__MUUTOSPYYNTO_ASIATILAMUUTOS_ASIATILAMUUTOS_ID_FKEY;
    public static final ForeignKey<MuutospyyntoLiiteRecord, MuutospyyntoRecord> MUUTOSPYYNTO_LIITE__MUUTOSPYYNTO_LIITE_MUUTOSPYYNTO_ID_FKEY = ForeignKeys0.MUUTOSPYYNTO_LIITE__MUUTOSPYYNTO_LIITE_MUUTOSPYYNTO_ID_FKEY;
    public static final ForeignKey<MuutospyyntoLiiteRecord, LiiteRecord> MUUTOSPYYNTO_LIITE__MUUTOSPYYNTO_LIITE_LIITE_ID_FKEY = ForeignKeys0.MUUTOSPYYNTO_LIITE__MUUTOSPYYNTO_LIITE_LIITE_ID_FKEY;
    public static final ForeignKey<PaatoskierrosRecord, EsitysmalliRecord> PAATOSKIERROS__FK_ESITYSMALLI = ForeignKeys0.PAATOSKIERROS__FK_ESITYSMALLI;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AsiatilamuutosRecord, Long> IDENTITY_ASIATILAMUUTOS = createIdentity(Asiatilamuutos.ASIATILAMUUTOS, Asiatilamuutos.ASIATILAMUUTOS.ID);
        public static Identity<AsiatyyppiRecord, Long> IDENTITY_ASIATYYPPI = createIdentity(Asiatyyppi.ASIATYYPPI, Asiatyyppi.ASIATYYPPI.ID);
        public static Identity<EsitysmalliRecord, Long> IDENTITY_ESITYSMALLI = createIdentity(Esitysmalli.ESITYSMALLI, Esitysmalli.ESITYSMALLI.ID);
        public static Identity<KohdeRecord, Long> IDENTITY_KOHDE = createIdentity(Kohde.KOHDE, Kohde.KOHDE.ID);
        public static Identity<LiiteRecord, Long> IDENTITY_LIITE = createIdentity(Liite.LIITE, Liite.LIITE.ID);
        public static Identity<LupaRecord, Long> IDENTITY_LUPA = createIdentity(Lupa.LUPA, Lupa.LUPA.ID);
        public static Identity<LupaLiiteRecord, Long> IDENTITY_LUPA_LIITE = createIdentity(LupaLiite.LUPA_LIITE, LupaLiite.LUPA_LIITE.ID);
        public static Identity<LupahistoriaRecord, Long> IDENTITY_LUPAHISTORIA = createIdentity(Lupahistoria.LUPAHISTORIA, Lupahistoria.LUPAHISTORIA.ID);
        public static Identity<LupatilaRecord, Long> IDENTITY_LUPATILA = createIdentity(Lupatila.LUPATILA, Lupatila.LUPATILA.ID);
        public static Identity<MaaraysRecord, Long> IDENTITY_MAARAYS = createIdentity(Maarays.MAARAYS, Maarays.MAARAYS.ID);
        public static Identity<MaaraystyyppiRecord, Long> IDENTITY_MAARAYSTYYPPI = createIdentity(Maaraystyyppi.MAARAYSTYYPPI, Maaraystyyppi.MAARAYSTYYPPI.ID);
        public static Identity<MuutosRecord, Long> IDENTITY_MUUTOS = createIdentity(Muutos.MUUTOS, Muutos.MUUTOS.ID);
        public static Identity<MuutospyyntoRecord, Long> IDENTITY_MUUTOSPYYNTO = createIdentity(Muutospyynto.MUUTOSPYYNTO, Muutospyynto.MUUTOSPYYNTO.ID);
        public static Identity<PaatoskierrosRecord, Long> IDENTITY_PAATOSKIERROS = createIdentity(Paatoskierros.PAATOSKIERROS, Paatoskierros.PAATOSKIERROS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AsiatilamuutosRecord> ASIATILAMUUTOS_PKEY = createUniqueKey(Asiatilamuutos.ASIATILAMUUTOS, "asiatilamuutos_pkey", Asiatilamuutos.ASIATILAMUUTOS.ID);
        public static final UniqueKey<AsiatyyppiRecord> ASIATYYPPI_PKEY = createUniqueKey(Asiatyyppi.ASIATYYPPI, "asiatyyppi_pkey", Asiatyyppi.ASIATYYPPI.ID);
        public static final UniqueKey<AsiatyyppiRecord> ASIATYYPPI_UUID_KEY = createUniqueKey(Asiatyyppi.ASIATYYPPI, "asiatyyppi_uuid_key", Asiatyyppi.ASIATYYPPI.UUID);
        public static final UniqueKey<EsitysmalliRecord> ESITYSMALLI_PKEY = createUniqueKey(Esitysmalli.ESITYSMALLI, "esitysmalli_pkey", Esitysmalli.ESITYSMALLI.ID);
        public static final UniqueKey<EsitysmalliRecord> ESITYSMALLI_UUID_KEY = createUniqueKey(Esitysmalli.ESITYSMALLI, "esitysmalli_uuid_key", Esitysmalli.ESITYSMALLI.UUID);
        public static final UniqueKey<KohdeRecord> KOHDE_PKEY = createUniqueKey(Kohde.KOHDE, "kohde_pkey", Kohde.KOHDE.ID);
        public static final UniqueKey<KohdeRecord> KOHDE_UUID_KEY = createUniqueKey(Kohde.KOHDE, "kohde_uuid_key", Kohde.KOHDE.UUID);
        public static final UniqueKey<LiiteRecord> LIITE_PKEY = createUniqueKey(Liite.LIITE, "liite_pkey", Liite.LIITE.ID);
        public static final UniqueKey<LiiteRecord> LIITE_UUID_KEY = createUniqueKey(Liite.LIITE, "liite_uuid_key", Liite.LIITE.UUID);
        public static final UniqueKey<LupaRecord> LUPA_PKEY = createUniqueKey(Lupa.LUPA, "lupa_pkey", Lupa.LUPA.ID);
        public static final UniqueKey<LupaRecord> LUPA_UUID_KEY = createUniqueKey(Lupa.LUPA, "lupa_uuid_key", Lupa.LUPA.UUID);
        public static final UniqueKey<LupaLiiteRecord> LUPA_LIITE_PKEY = createUniqueKey(LupaLiite.LUPA_LIITE, "lupa_liite_pkey", LupaLiite.LUPA_LIITE.ID);
        public static final UniqueKey<LupahistoriaRecord> LUPAHISTORIA_PKEY = createUniqueKey(Lupahistoria.LUPAHISTORIA, "lupahistoria_pkey", Lupahistoria.LUPAHISTORIA.ID);
        public static final UniqueKey<LupahistoriaRecord> LUPAHISTORIA_UUID_KEY = createUniqueKey(Lupahistoria.LUPAHISTORIA, "lupahistoria_uuid_key", Lupahistoria.LUPAHISTORIA.UUID);
        public static final UniqueKey<LupatilaRecord> LUPATILA_PKEY = createUniqueKey(Lupatila.LUPATILA, "lupatila_pkey", Lupatila.LUPATILA.ID);
        public static final UniqueKey<LupatilaRecord> LUPATILA_UUID_KEY = createUniqueKey(Lupatila.LUPATILA, "lupatila_uuid_key", Lupatila.LUPATILA.UUID);
        public static final UniqueKey<MaaraysRecord> MAARAYS_PKEY = createUniqueKey(Maarays.MAARAYS, "maarays_pkey", Maarays.MAARAYS.ID);
        public static final UniqueKey<MaaraysRecord> MAARAYS_UUID_KEY = createUniqueKey(Maarays.MAARAYS, "maarays_uuid_key", Maarays.MAARAYS.UUID);
        public static final UniqueKey<MaaraystyyppiRecord> MAARAYSTYYPPI_PKEY = createUniqueKey(Maaraystyyppi.MAARAYSTYYPPI, "maaraystyyppi_pkey", Maaraystyyppi.MAARAYSTYYPPI.ID);
        public static final UniqueKey<MaaraystyyppiRecord> MAARAYSTYYPPI_UUID_KEY = createUniqueKey(Maaraystyyppi.MAARAYSTYYPPI, "maaraystyyppi_uuid_key", Maaraystyyppi.MAARAYSTYYPPI.UUID);
        public static final UniqueKey<MuutosRecord> MUUTOS_PKEY = createUniqueKey(Muutos.MUUTOS, "muutos_pkey", Muutos.MUUTOS.ID);
        public static final UniqueKey<MuutosRecord> MUUTOS_UUID_KEY = createUniqueKey(Muutos.MUUTOS, "muutos_uuid_key", Muutos.MUUTOS.UUID);
        public static final UniqueKey<MuutosLiiteRecord> MUUTOS_LIITE_PKEY = createUniqueKey(MuutosLiite.MUUTOS_LIITE, "muutos_liite_pkey", MuutosLiite.MUUTOS_LIITE.MUUTOS_ID, MuutosLiite.MUUTOS_LIITE.LIITE_ID);
        public static final UniqueKey<MuutospyyntoRecord> MUUTOSPYYNTO_PKEY = createUniqueKey(Muutospyynto.MUUTOSPYYNTO, "muutospyynto_pkey", Muutospyynto.MUUTOSPYYNTO.ID);
        public static final UniqueKey<MuutospyyntoRecord> MUUTOSPYYNTO_UUID_KEY = createUniqueKey(Muutospyynto.MUUTOSPYYNTO, "muutospyynto_uuid_key", Muutospyynto.MUUTOSPYYNTO.UUID);
        public static final UniqueKey<MuutospyyntoAsiatilamuutosRecord> MUUTOSPYYNTO_ASIATILAMUUTOS_PKEY = createUniqueKey(MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS, "muutospyynto_asiatilamuutos_pkey", MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS.MUUTOSPYYNTO_ID, MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS.ASIATILAMUUTOS_ID);
        public static final UniqueKey<MuutospyyntoAsiatilamuutosRecord> MUUTOSPYYNTO_ASIATILAMUUTOS_ASIATILAMUUTOS_ID_KEY = createUniqueKey(MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS, "muutospyynto_asiatilamuutos_asiatilamuutos_id_key", MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS.ASIATILAMUUTOS_ID);
        public static final UniqueKey<MuutospyyntoLiiteRecord> MUUTOSPYYNTO_LIITE_PKEY = createUniqueKey(MuutospyyntoLiite.MUUTOSPYYNTO_LIITE, "muutospyynto_liite_pkey", MuutospyyntoLiite.MUUTOSPYYNTO_LIITE.MUUTOSPYYNTO_ID, MuutospyyntoLiite.MUUTOSPYYNTO_LIITE.LIITE_ID);
        public static final UniqueKey<PaatoskierrosRecord> PAATOSKIERROS_PKEY = createUniqueKey(Paatoskierros.PAATOSKIERROS, "paatoskierros_pkey", Paatoskierros.PAATOSKIERROS.ID);
        public static final UniqueKey<PaatoskierrosRecord> PAATOSKIERROS_UUID_KEY = createUniqueKey(Paatoskierros.PAATOSKIERROS, "paatoskierros_uuid_key", Paatoskierros.PAATOSKIERROS.UUID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<LupaRecord, PaatoskierrosRecord> LUPA__FK_PAATOSKIERROS = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.PAATOSKIERROS_PKEY, Lupa.LUPA, "lupa__fk_paatoskierros", Lupa.LUPA.PAATOSKIERROS_ID);
        public static final ForeignKey<LupaRecord, LupatilaRecord> LUPA__FK_LUPATILA = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.LUPATILA_PKEY, Lupa.LUPA, "lupa__fk_lupatila", Lupa.LUPA.LUPATILA_ID);
        public static final ForeignKey<LupaRecord, AsiatyyppiRecord> LUPA__FK_ASIATYYPPI = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.ASIATYYPPI_PKEY, Lupa.LUPA, "lupa__fk_asiatyyppi", Lupa.LUPA.ASIATYYPPI_ID);
        public static final ForeignKey<LupaLiiteRecord, LupaRecord> LUPA_LIITE__FK_LUPA = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.LUPA_PKEY, LupaLiite.LUPA_LIITE, "lupa_liite__fk_lupa", LupaLiite.LUPA_LIITE.LUPA_ID);
        public static final ForeignKey<LupaLiiteRecord, LiiteRecord> LUPA_LIITE__FK_LIITE = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.LIITE_PKEY, LupaLiite.LUPA_LIITE, "lupa_liite__fk_liite", LupaLiite.LUPA_LIITE.LIITE_ID);
        public static final ForeignKey<LupahistoriaRecord, LupaRecord> LUPAHISTORIA__LUPAHISTORIA_LUPA_ID_FKEY = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.LUPA_PKEY, Lupahistoria.LUPAHISTORIA, "lupahistoria__lupahistoria_lupa_id_fkey", Lupahistoria.LUPAHISTORIA.LUPA_ID);
        public static final ForeignKey<MaaraysRecord, LupaRecord> MAARAYS__FK_LUPA = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.LUPA_PKEY, Maarays.MAARAYS, "maarays__fk_lupa", Maarays.MAARAYS.LUPA_ID);
        public static final ForeignKey<MaaraysRecord, KohdeRecord> MAARAYS__FK_KOHDE = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.KOHDE_PKEY, Maarays.MAARAYS, "maarays__fk_kohde", Maarays.MAARAYS.KOHDE_ID);
        public static final ForeignKey<MaaraysRecord, MaaraystyyppiRecord> MAARAYS__FK_MAARAYSTYYPPI = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.MAARAYSTYYPPI_PKEY, Maarays.MAARAYS, "maarays__fk_maaraystyyppi", Maarays.MAARAYS.MAARAYSTYYPPI_ID);
        public static final ForeignKey<MuutosRecord, MuutospyyntoRecord> MUUTOS__FK_MUUTOSPYYNTO = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.MUUTOSPYYNTO_PKEY, Muutos.MUUTOS, "muutos__fk_muutospyynto", Muutos.MUUTOS.MUUTOSPYYNTO_ID);
        public static final ForeignKey<MuutosRecord, KohdeRecord> MUUTOS__FK_KOHDE = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.KOHDE_PKEY, Muutos.MUUTOS, "muutos__fk_kohde", Muutos.MUUTOS.KOHDE_ID);
        public static final ForeignKey<MuutosLiiteRecord, MuutosRecord> MUUTOS_LIITE__MUUTOS_LIITE_MUUTOS_ID_FKEY = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.MUUTOS_PKEY, MuutosLiite.MUUTOS_LIITE, "muutos_liite__muutos_liite_muutos_id_fkey", MuutosLiite.MUUTOS_LIITE.MUUTOS_ID);
        public static final ForeignKey<MuutosLiiteRecord, LiiteRecord> MUUTOS_LIITE__MUUTOS_LIITE_LIITE_ID_FKEY = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.LIITE_PKEY, MuutosLiite.MUUTOS_LIITE, "muutos_liite__muutos_liite_liite_id_fkey", MuutosLiite.MUUTOS_LIITE.LIITE_ID);
        public static final ForeignKey<MuutospyyntoRecord, LupaRecord> MUUTOSPYYNTO__FK_LUPA = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.LUPA_PKEY, Muutospyynto.MUUTOSPYYNTO, "muutospyynto__fk_lupa", Muutospyynto.MUUTOSPYYNTO.LUPA_ID);
        public static final ForeignKey<MuutospyyntoRecord, PaatoskierrosRecord> MUUTOSPYYNTO__FK_PAATOSKIERROS = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.PAATOSKIERROS_PKEY, Muutospyynto.MUUTOSPYYNTO, "muutospyynto__fk_paatoskierros", Muutospyynto.MUUTOSPYYNTO.PAATOSKIERROS_ID);
        public static final ForeignKey<MuutospyyntoAsiatilamuutosRecord, MuutospyyntoRecord> MUUTOSPYYNTO_ASIATILAMUUTOS__MUUTOSPYYNTO_ASIATILAMUUTOS_MUUTOSPYYNTO_ID_FKEY = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.MUUTOSPYYNTO_PKEY, MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS, "muutospyynto_asiatilamuutos__muutospyynto_asiatilamuutos_muutospyynto_id_fkey", MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS.MUUTOSPYYNTO_ID);
        public static final ForeignKey<MuutospyyntoAsiatilamuutosRecord, AsiatilamuutosRecord> MUUTOSPYYNTO_ASIATILAMUUTOS__MUUTOSPYYNTO_ASIATILAMUUTOS_ASIATILAMUUTOS_ID_FKEY = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.ASIATILAMUUTOS_PKEY, MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS, "muutospyynto_asiatilamuutos__muutospyynto_asiatilamuutos_asiatilamuutos_id_fkey", MuutospyyntoAsiatilamuutos.MUUTOSPYYNTO_ASIATILAMUUTOS.ASIATILAMUUTOS_ID);
        public static final ForeignKey<MuutospyyntoLiiteRecord, MuutospyyntoRecord> MUUTOSPYYNTO_LIITE__MUUTOSPYYNTO_LIITE_MUUTOSPYYNTO_ID_FKEY = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.MUUTOSPYYNTO_PKEY, MuutospyyntoLiite.MUUTOSPYYNTO_LIITE, "muutospyynto_liite__muutospyynto_liite_muutospyynto_id_fkey", MuutospyyntoLiite.MUUTOSPYYNTO_LIITE.MUUTOSPYYNTO_ID);
        public static final ForeignKey<MuutospyyntoLiiteRecord, LiiteRecord> MUUTOSPYYNTO_LIITE__MUUTOSPYYNTO_LIITE_LIITE_ID_FKEY = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.LIITE_PKEY, MuutospyyntoLiite.MUUTOSPYYNTO_LIITE, "muutospyynto_liite__muutospyynto_liite_liite_id_fkey", MuutospyyntoLiite.MUUTOSPYYNTO_LIITE.LIITE_ID);
        public static final ForeignKey<PaatoskierrosRecord, EsitysmalliRecord> PAATOSKIERROS__FK_ESITYSMALLI = createForeignKey(fi.minedu.oiva.backend.model.jooq.Keys.ESITYSMALLI_PKEY, Paatoskierros.PAATOSKIERROS, "paatoskierros__fk_esitysmalli", Paatoskierros.PAATOSKIERROS.ESITYSMALLI_ID);
    }
}
