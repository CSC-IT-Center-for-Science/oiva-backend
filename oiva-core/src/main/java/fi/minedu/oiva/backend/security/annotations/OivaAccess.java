package fi.minedu.oiva.backend.security.annotations;

import java.util.regex.Pattern;

/*
 * OIVA_APP
 * OIVA_APP_ADMIN
 * OIVA_APP_ESITTELIJA
 * OIVA_APP_NIMENKIRJOITTAJA
 * OIVA_APP_KAYTTAJA
 * OIVA_APP_KATSELIJA
*/

public interface OivaAccess {

    enum Type {
        All,
        OrganizationAndPublic,
        OnlyPublic
    }

    Pattern Format_Role = Pattern.compile("^([A-Za-z_]+)(?:_((?:\\d+\\.?)+)?)?$");

    String Context_Oiva = "OIVA_APP";
    String Context_Yllapitaja = "OIVA_APP_ADMIN";
    String Context_Esittelija = "ESITTELIJA";
    String Context_Kayttaja = "MUOKKAAJA";
    String Context_Katselija = "KATSELIJA";
    String Context_Nimenkirjoittaja = "NIMENKIRJOITTAJA";

    String Role_Application = Context_Oiva;
    String Role_Yllapitaja = Context_Yllapitaja;
    String Role_Esittelija = Context_Oiva + "_" + Context_Esittelija;
    String Role_Kayttaja = Context_Oiva + "_" + Context_Kayttaja;
    String Role_Katselija = Context_Oiva + "_" + Context_Katselija;
    String Role_Nimenkirjoittaja = Context_Oiva + "_" + Context_Nimenkirjoittaja;

    String Application = "hasAuthority('" + Role_Application + "')";
    String Yllapitaja = Application + " and hasAuthority('" + Role_Yllapitaja + "')";
    String Esittelija = Application + " and hasAuthority('" + Role_Esittelija + "')";
    String Kayttaja = Application + " and hasAuthority('" + Role_Kayttaja + "')";
    String Katselija = Application + " and hasAuthority('" + Role_Katselija + "')";
    String Nimenkirjoittaja = Application + " and hasAuthority('" + Role_Nimenkirjoittaja + "')";
}
