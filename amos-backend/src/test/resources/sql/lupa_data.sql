INSERT INTO oiva.lupa (id, edellinen_lupa_id, paatoskierros_id, lupatila_id, asiatyyppi_id, diaarinumero,
                       jarjestaja_ytunnus, jarjestaja_oid, alkupvm, loppupvm, paatospvm, meta, maksu, luoja, luontipvm,
                       paivittaja, paivityspvm)
VALUES (1, null, 1, 3, 1, '11/111/2019', '1111111-1', '1.1.111.111.11.11111111111', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-04-26 13:49:05.834530', null, null),
       (2, null, 1, 3, 1, '22/222/2019', '2222222-2', '2.2.222.222.22.22222222222', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-08-28 12:58:22.066839', null, null),
       (3, null, 1, 3, 1, '33/333/2019', '3333333-3', '3.3.333.333.33.33333333333', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-09-20 09:25:22.066839', null, null),
       (4, null, 1, 3, 1, '44/444/2019', '4444444-4', '4.4.444.444.44.44444444444', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-09-21 09:48:22.066839', null, null),
       (5, null, 1, 3, 5, '55/555/2019', '5555555-5', '5.5.555.555.55.55555555555', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-09-21 09:48:22.066839', null, null);