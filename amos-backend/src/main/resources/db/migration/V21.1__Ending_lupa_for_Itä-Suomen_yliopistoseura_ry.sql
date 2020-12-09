-- Itä-Suomen yliopistoseura ry ending lupa
WITH cur_lupa AS (
    UPDATE lupa
        SET loppupvm = '2020-12-31'
        WHERE jarjestaja_ytunnus = '0206795-4'
            AND
              diaarinumero = '195/532/2012' RETURNING diaarinumero, jarjestaja_ytunnus,
                  jarjestaja_oid, alkupvm, loppupvm, paatospvm, meta, koulutustyyppi, oppilaitostyyppi
),
     historia AS (
         INSERT INTO lupahistoria (diaarinumero, ytunnus, oid, maakunta, tila, voimassaoloalkupvm, voimassaololoppupvm,
                                   paatospvm, filename, koulutustyyppi, oppilaitostyyppi)
             SELECT diaarinumero,
                    jarjestaja_ytunnus,
                    jarjestaja_oid,
                    'Etelä-Karjala',
                    'Järjestämisluvan peruutus',
                    alkupvm,
                    loppupvm,
                    paatospvm,
                    meta->>'liitetiedosto',
                    koulutustyyppi,
                    oppilaitostyyppi
             FROM cur_lupa
     )

SELECT *
FROM cur_lupa;
