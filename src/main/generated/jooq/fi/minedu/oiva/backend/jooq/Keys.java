/*
 * This file is generated by jOOQ.
*/
package fi.minedu.oiva.backend.jooq;


import fi.minedu.oiva.backend.jooq.tables.Asiatyyppi;
import fi.minedu.oiva.backend.jooq.tables.Esitysmalli;
import fi.minedu.oiva.backend.jooq.tables.Fuusio;
import fi.minedu.oiva.backend.jooq.tables.Kohde;
import fi.minedu.oiva.backend.jooq.tables.Liite;
import fi.minedu.oiva.backend.jooq.tables.Lupa;
import fi.minedu.oiva.backend.jooq.tables.LupaLiite;
import fi.minedu.oiva.backend.jooq.tables.Lupatila;
import fi.minedu.oiva.backend.jooq.tables.Maarays;
import fi.minedu.oiva.backend.jooq.tables.Maaraystyyppi;
import fi.minedu.oiva.backend.jooq.tables.Muutoshistoria;
import fi.minedu.oiva.backend.jooq.tables.Paatoskierros;
import fi.minedu.oiva.backend.jooq.tables.PaatoskierrosKohdeLink;
import fi.minedu.oiva.backend.jooq.tables.Tekstityyppi;
import fi.minedu.oiva.backend.jooq.tables.Tiedote;
import fi.minedu.oiva.backend.jooq.tables.records.AsiatyyppiRecord;
import fi.minedu.oiva.backend.jooq.tables.records.EsitysmalliRecord;
import fi.minedu.oiva.backend.jooq.tables.records.FuusioRecord;
import fi.minedu.oiva.backend.jooq.tables.records.KohdeRecord;
import fi.minedu.oiva.backend.jooq.tables.records.LiiteRecord;
import fi.minedu.oiva.backend.jooq.tables.records.LupaLiiteRecord;
import fi.minedu.oiva.backend.jooq.tables.records.LupaRecord;
import fi.minedu.oiva.backend.jooq.tables.records.LupatilaRecord;
import fi.minedu.oiva.backend.jooq.tables.records.MaaraysRecord;
import fi.minedu.oiva.backend.jooq.tables.records.MaaraystyyppiRecord;
import fi.minedu.oiva.backend.jooq.tables.records.MuutoshistoriaRecord;
import fi.minedu.oiva.backend.jooq.tables.records.PaatoskierrosKohdeLinkRecord;
import fi.minedu.oiva.backend.jooq.tables.records.PaatoskierrosRecord;
import fi.minedu.oiva.backend.jooq.tables.records.TekstityyppiRecord;
import fi.minedu.oiva.backend.jooq.tables.records.TiedoteRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>oiva</code> 
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

    public static final Identity<AsiatyyppiRecord, Long> IDENTITY_ASIATYYPPI = Identities0.IDENTITY_ASIATYYPPI;
    public static final Identity<EsitysmalliRecord, Long> IDENTITY_ESITYSMALLI = Identities0.IDENTITY_ESITYSMALLI;
    public static final Identity<FuusioRecord, Long> IDENTITY_FUUSIO = Identities0.IDENTITY_FUUSIO;
    public static final Identity<KohdeRecord, Long> IDENTITY_KOHDE = Identities0.IDENTITY_KOHDE;
    public static final Identity<LiiteRecord, Long> IDENTITY_LIITE = Identities0.IDENTITY_LIITE;
    public static final Identity<LupaRecord, Long> IDENTITY_LUPA = Identities0.IDENTITY_LUPA;
    public static final Identity<LupaLiiteRecord, Long> IDENTITY_LUPA_LIITE = Identities0.IDENTITY_LUPA_LIITE;
    public static final Identity<LupatilaRecord, Long> IDENTITY_LUPATILA = Identities0.IDENTITY_LUPATILA;
    public static final Identity<MaaraysRecord, Long> IDENTITY_MAARAYS = Identities0.IDENTITY_MAARAYS;
    public static final Identity<MaaraystyyppiRecord, Long> IDENTITY_MAARAYSTYYPPI = Identities0.IDENTITY_MAARAYSTYYPPI;
    public static final Identity<MuutoshistoriaRecord, Long> IDENTITY_MUUTOSHISTORIA = Identities0.IDENTITY_MUUTOSHISTORIA;
    public static final Identity<PaatoskierrosRecord, Long> IDENTITY_PAATOSKIERROS = Identities0.IDENTITY_PAATOSKIERROS;
    public static final Identity<TekstityyppiRecord, Long> IDENTITY_TEKSTITYYPPI = Identities0.IDENTITY_TEKSTITYYPPI;
    public static final Identity<TiedoteRecord, Long> IDENTITY_TIEDOTE = Identities0.IDENTITY_TIEDOTE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AsiatyyppiRecord> ASIATYYPPI_PKEY = UniqueKeys0.ASIATYYPPI_PKEY;
    public static final UniqueKey<EsitysmalliRecord> ESITYSMALLI_PKEY = UniqueKeys0.ESITYSMALLI_PKEY;
    public static final UniqueKey<FuusioRecord> FUUSIO_PKEY = UniqueKeys0.FUUSIO_PKEY;
    public static final UniqueKey<KohdeRecord> KOHDE_PKEY = UniqueKeys0.KOHDE_PKEY;
    public static final UniqueKey<LiiteRecord> LIITE_PKEY = UniqueKeys0.LIITE_PKEY;
    public static final UniqueKey<LupaRecord> LUPA_PKEY = UniqueKeys0.LUPA_PKEY;
    public static final UniqueKey<LupaRecord> LUPA_DIAARINUMERO_KEY = UniqueKeys0.LUPA_DIAARINUMERO_KEY;
    public static final UniqueKey<LupaLiiteRecord> LUPA_LIITE_PKEY = UniqueKeys0.LUPA_LIITE_PKEY;
    public static final UniqueKey<LupatilaRecord> LUPATILA_PKEY = UniqueKeys0.LUPATILA_PKEY;
    public static final UniqueKey<MaaraysRecord> MAARAYS_PKEY = UniqueKeys0.MAARAYS_PKEY;
    public static final UniqueKey<MaaraystyyppiRecord> MAARAYSTYYPPI_PKEY = UniqueKeys0.MAARAYSTYYPPI_PKEY;
    public static final UniqueKey<MuutoshistoriaRecord> MUUTOSHISTORIA_PKEY = UniqueKeys0.MUUTOSHISTORIA_PKEY;
    public static final UniqueKey<PaatoskierrosRecord> PAATOSKIERROS_PKEY = UniqueKeys0.PAATOSKIERROS_PKEY;
    public static final UniqueKey<TekstityyppiRecord> TEKSTITYYPPI_PKEY = UniqueKeys0.TEKSTITYYPPI_PKEY;
    public static final UniqueKey<TiedoteRecord> TIEDOTE_PKEY = UniqueKeys0.TIEDOTE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<FuusioRecord, LupaRecord> FUUSIO__FK_FUUSIO_LUPA = ForeignKeys0.FUUSIO__FK_FUUSIO_LUPA;
    public static final ForeignKey<LupaRecord, PaatoskierrosRecord> LUPA__FK_PAATOSKIERROS = ForeignKeys0.LUPA__FK_PAATOSKIERROS;
    public static final ForeignKey<LupaRecord, LupatilaRecord> LUPA__FK_LUPATILA = ForeignKeys0.LUPA__FK_LUPATILA;
    public static final ForeignKey<LupaRecord, AsiatyyppiRecord> LUPA__FK_ASIATYYPPI = ForeignKeys0.LUPA__FK_ASIATYYPPI;
    public static final ForeignKey<LupaLiiteRecord, LupaRecord> LUPA_LIITE__FK_LUPA = ForeignKeys0.LUPA_LIITE__FK_LUPA;
    public static final ForeignKey<LupaLiiteRecord, LiiteRecord> LUPA_LIITE__FK_LIITE = ForeignKeys0.LUPA_LIITE__FK_LIITE;
    public static final ForeignKey<MaaraysRecord, LupaRecord> MAARAYS__FK_LUPA = ForeignKeys0.MAARAYS__FK_LUPA;
    public static final ForeignKey<MaaraysRecord, KohdeRecord> MAARAYS__FK_KOHDE = ForeignKeys0.MAARAYS__FK_KOHDE;
    public static final ForeignKey<MaaraysRecord, MaaraystyyppiRecord> MAARAYS__FK_MAARAYSTYYPPI = ForeignKeys0.MAARAYS__FK_MAARAYSTYYPPI;
    public static final ForeignKey<MuutoshistoriaRecord, MaaraysRecord> MUUTOSHISTORIA__FK_MAARAYS = ForeignKeys0.MUUTOSHISTORIA__FK_MAARAYS;
    public static final ForeignKey<PaatoskierrosRecord, EsitysmalliRecord> PAATOSKIERROS__FK_ESITYSMALLI = ForeignKeys0.PAATOSKIERROS__FK_ESITYSMALLI;
    public static final ForeignKey<PaatoskierrosKohdeLinkRecord, KohdeRecord> PAATOSKIERROS_KOHDE_LINK__FK_KOHDE = ForeignKeys0.PAATOSKIERROS_KOHDE_LINK__FK_KOHDE;
    public static final ForeignKey<PaatoskierrosKohdeLinkRecord, PaatoskierrosRecord> PAATOSKIERROS_KOHDE_LINK__FK_PAATOSKIERROS = ForeignKeys0.PAATOSKIERROS_KOHDE_LINK__FK_PAATOSKIERROS;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AsiatyyppiRecord, Long> IDENTITY_ASIATYYPPI = createIdentity(Asiatyyppi.ASIATYYPPI, Asiatyyppi.ASIATYYPPI.ID);
        public static Identity<EsitysmalliRecord, Long> IDENTITY_ESITYSMALLI = createIdentity(Esitysmalli.ESITYSMALLI, Esitysmalli.ESITYSMALLI.ID);
        public static Identity<FuusioRecord, Long> IDENTITY_FUUSIO = createIdentity(Fuusio.FUUSIO, Fuusio.FUUSIO.ID);
        public static Identity<KohdeRecord, Long> IDENTITY_KOHDE = createIdentity(Kohde.KOHDE, Kohde.KOHDE.ID);
        public static Identity<LiiteRecord, Long> IDENTITY_LIITE = createIdentity(Liite.LIITE, Liite.LIITE.ID);
        public static Identity<LupaRecord, Long> IDENTITY_LUPA = createIdentity(Lupa.LUPA, Lupa.LUPA.ID);
        public static Identity<LupaLiiteRecord, Long> IDENTITY_LUPA_LIITE = createIdentity(LupaLiite.LUPA_LIITE, LupaLiite.LUPA_LIITE.ID);
        public static Identity<LupatilaRecord, Long> IDENTITY_LUPATILA = createIdentity(Lupatila.LUPATILA, Lupatila.LUPATILA.ID);
        public static Identity<MaaraysRecord, Long> IDENTITY_MAARAYS = createIdentity(Maarays.MAARAYS, Maarays.MAARAYS.ID);
        public static Identity<MaaraystyyppiRecord, Long> IDENTITY_MAARAYSTYYPPI = createIdentity(Maaraystyyppi.MAARAYSTYYPPI, Maaraystyyppi.MAARAYSTYYPPI.ID);
        public static Identity<MuutoshistoriaRecord, Long> IDENTITY_MUUTOSHISTORIA = createIdentity(Muutoshistoria.MUUTOSHISTORIA, Muutoshistoria.MUUTOSHISTORIA.ID);
        public static Identity<PaatoskierrosRecord, Long> IDENTITY_PAATOSKIERROS = createIdentity(Paatoskierros.PAATOSKIERROS, Paatoskierros.PAATOSKIERROS.ID);
        public static Identity<TekstityyppiRecord, Long> IDENTITY_TEKSTITYYPPI = createIdentity(Tekstityyppi.TEKSTITYYPPI, Tekstityyppi.TEKSTITYYPPI.ID);
        public static Identity<TiedoteRecord, Long> IDENTITY_TIEDOTE = createIdentity(Tiedote.TIEDOTE, Tiedote.TIEDOTE.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AsiatyyppiRecord> ASIATYYPPI_PKEY = createUniqueKey(Asiatyyppi.ASIATYYPPI, "asiatyyppi_pkey", Asiatyyppi.ASIATYYPPI.ID);
        public static final UniqueKey<EsitysmalliRecord> ESITYSMALLI_PKEY = createUniqueKey(Esitysmalli.ESITYSMALLI, "esitysmalli_pkey", Esitysmalli.ESITYSMALLI.ID);
        public static final UniqueKey<FuusioRecord> FUUSIO_PKEY = createUniqueKey(Fuusio.FUUSIO, "fuusio_pkey", Fuusio.FUUSIO.ID);
        public static final UniqueKey<KohdeRecord> KOHDE_PKEY = createUniqueKey(Kohde.KOHDE, "kohde_pkey", Kohde.KOHDE.ID);
        public static final UniqueKey<LiiteRecord> LIITE_PKEY = createUniqueKey(Liite.LIITE, "liite_pkey", Liite.LIITE.ID);
        public static final UniqueKey<LupaRecord> LUPA_PKEY = createUniqueKey(Lupa.LUPA, "lupa_pkey", Lupa.LUPA.ID);
        public static final UniqueKey<LupaRecord> LUPA_DIAARINUMERO_KEY = createUniqueKey(Lupa.LUPA, "lupa_diaarinumero_key", Lupa.LUPA.DIAARINUMERO);
        public static final UniqueKey<LupaLiiteRecord> LUPA_LIITE_PKEY = createUniqueKey(LupaLiite.LUPA_LIITE, "lupa_liite_pkey", LupaLiite.LUPA_LIITE.ID);
        public static final UniqueKey<LupatilaRecord> LUPATILA_PKEY = createUniqueKey(Lupatila.LUPATILA, "lupatila_pkey", Lupatila.LUPATILA.ID);
        public static final UniqueKey<MaaraysRecord> MAARAYS_PKEY = createUniqueKey(Maarays.MAARAYS, "maarays_pkey", Maarays.MAARAYS.ID);
        public static final UniqueKey<MaaraystyyppiRecord> MAARAYSTYYPPI_PKEY = createUniqueKey(Maaraystyyppi.MAARAYSTYYPPI, "maaraystyyppi_pkey", Maaraystyyppi.MAARAYSTYYPPI.ID);
        public static final UniqueKey<MuutoshistoriaRecord> MUUTOSHISTORIA_PKEY = createUniqueKey(Muutoshistoria.MUUTOSHISTORIA, "muutoshistoria_pkey", Muutoshistoria.MUUTOSHISTORIA.ID);
        public static final UniqueKey<PaatoskierrosRecord> PAATOSKIERROS_PKEY = createUniqueKey(Paatoskierros.PAATOSKIERROS, "paatoskierros_pkey", Paatoskierros.PAATOSKIERROS.ID);
        public static final UniqueKey<TekstityyppiRecord> TEKSTITYYPPI_PKEY = createUniqueKey(Tekstityyppi.TEKSTITYYPPI, "tekstityyppi_pkey", Tekstityyppi.TEKSTITYYPPI.ID);
        public static final UniqueKey<TiedoteRecord> TIEDOTE_PKEY = createUniqueKey(Tiedote.TIEDOTE, "tiedote_pkey", Tiedote.TIEDOTE.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<FuusioRecord, LupaRecord> FUUSIO__FK_FUUSIO_LUPA = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.LUPA_PKEY, Fuusio.FUUSIO, "fuusio__fk_fuusio_lupa", Fuusio.FUUSIO.LUPA_ID);
        public static final ForeignKey<LupaRecord, PaatoskierrosRecord> LUPA__FK_PAATOSKIERROS = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.PAATOSKIERROS_PKEY, Lupa.LUPA, "lupa__fk_paatoskierros", Lupa.LUPA.PAATOSKIERROS_ID);
        public static final ForeignKey<LupaRecord, LupatilaRecord> LUPA__FK_LUPATILA = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.LUPATILA_PKEY, Lupa.LUPA, "lupa__fk_lupatila", Lupa.LUPA.LUPATILA_ID);
        public static final ForeignKey<LupaRecord, AsiatyyppiRecord> LUPA__FK_ASIATYYPPI = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.ASIATYYPPI_PKEY, Lupa.LUPA, "lupa__fk_asiatyyppi", Lupa.LUPA.ASIATYYPPI_ID);
        public static final ForeignKey<LupaLiiteRecord, LupaRecord> LUPA_LIITE__FK_LUPA = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.LUPA_PKEY, LupaLiite.LUPA_LIITE, "lupa_liite__fk_lupa", LupaLiite.LUPA_LIITE.LUPA_ID);
        public static final ForeignKey<LupaLiiteRecord, LiiteRecord> LUPA_LIITE__FK_LIITE = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.LIITE_PKEY, LupaLiite.LUPA_LIITE, "lupa_liite__fk_liite", LupaLiite.LUPA_LIITE.LIITE_ID);
        public static final ForeignKey<MaaraysRecord, LupaRecord> MAARAYS__FK_LUPA = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.LUPA_PKEY, Maarays.MAARAYS, "maarays__fk_lupa", Maarays.MAARAYS.LUPA_ID);
        public static final ForeignKey<MaaraysRecord, KohdeRecord> MAARAYS__FK_KOHDE = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.KOHDE_PKEY, Maarays.MAARAYS, "maarays__fk_kohde", Maarays.MAARAYS.KOHDE_ID);
        public static final ForeignKey<MaaraysRecord, MaaraystyyppiRecord> MAARAYS__FK_MAARAYSTYYPPI = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.MAARAYSTYYPPI_PKEY, Maarays.MAARAYS, "maarays__fk_maaraystyyppi", Maarays.MAARAYS.MAARAYSTYYPPI_ID);
        public static final ForeignKey<MuutoshistoriaRecord, MaaraysRecord> MUUTOSHISTORIA__FK_MAARAYS = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.MAARAYS_PKEY, Muutoshistoria.MUUTOSHISTORIA, "muutoshistoria__fk_maarays", Muutoshistoria.MUUTOSHISTORIA.MAARAYS_ID);
        public static final ForeignKey<PaatoskierrosRecord, EsitysmalliRecord> PAATOSKIERROS__FK_ESITYSMALLI = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.ESITYSMALLI_PKEY, Paatoskierros.PAATOSKIERROS, "paatoskierros__fk_esitysmalli", Paatoskierros.PAATOSKIERROS.ESITYSMALLI_ID);
        public static final ForeignKey<PaatoskierrosKohdeLinkRecord, KohdeRecord> PAATOSKIERROS_KOHDE_LINK__FK_KOHDE = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.KOHDE_PKEY, PaatoskierrosKohdeLink.PAATOSKIERROS_KOHDE_LINK, "paatoskierros_kohde_link__fk_kohde", PaatoskierrosKohdeLink.PAATOSKIERROS_KOHDE_LINK.KOHDE_ID);
        public static final ForeignKey<PaatoskierrosKohdeLinkRecord, PaatoskierrosRecord> PAATOSKIERROS_KOHDE_LINK__FK_PAATOSKIERROS = createForeignKey(fi.minedu.oiva.backend.jooq.Keys.PAATOSKIERROS_PKEY, PaatoskierrosKohdeLink.PAATOSKIERROS_KOHDE_LINK, "paatoskierros_kohde_link__fk_paatoskierros", PaatoskierrosKohdeLink.PAATOSKIERROS_KOHDE_LINK.PAATOSKIERROS_ID);
    }
}
