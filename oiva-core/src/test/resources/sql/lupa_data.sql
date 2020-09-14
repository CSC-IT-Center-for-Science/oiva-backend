INSERT INTO lupa (id, edellinen_lupa_id, paatoskierros_id, lupatila_id, asiatyyppi_id, diaarinumero,
                       jarjestaja_ytunnus, jarjestaja_oid, alkupvm, loppupvm, paatospvm, meta, maksu, luoja, luontipvm,
                       paivittaja, paivityspvm, uuid, koulutustyyppi, oppilaitostyyppi)
VALUES (1, null, 1, 3, 1, '11/111/2019', '1111111-1', '1.1.111.111.11.11111111111', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-04-26 13:49:05.834530', null, null, 'cc3c1d00-43b6-11e8-b2ef-005056aa0e61', '1', '1'),
       (2, null, 1, 3, 1, '22/222/2019', '2222222-2', '2.2.222.222.22.22222222222', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-08-28 12:58:22.066839', null, null, 'cc3c1d00-43b6-11e8-b2ef-005056aa0e62', '1', '2'),
       (3, null, 1, 3, 1, '33/333/2019', '3333333-3', '3.3.333.333.33.33333333333', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-09-20 09:25:22.066839', null, null, 'cc3c1d00-43b6-11e8-b2ef-005056aa0e63', '2', '1'),
       (4, null, 1, 3, 1, '44/444/2019', '4444444-4', '4.4.444.444.44.44444444444', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-09-21 09:48:22.066839', null, null, 'cc3c1d00-43b6-11e8-b2ef-005056aa0e64', '2', '2'),
       (5, null, 1, 3, 5, '55/555/2019', '5555555-5', '5.5.555.555.55.55555555555', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-09-21 09:48:22.066839', null, null, 'cc3c1d00-43b6-11e8-b2ef-005056aa0e65', '1', '1'),
       (6, null, 1, 3, 1, '66/666/2019', '6666666-6', '6.6.666.666.66.66666666666', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-09-21 09:48:22.066839', null, null, 'cc3c1d00-43b6-11e8-b2ef-005056aa0e66', null, null),
       (7, null, 1, 3, 1, '77/777/2019', '7777777-7', '7.7.777.777.77.77777777777', '2019-01-01', null, '2018-12-31',
        '{"ministeri": "Testi Ministeri", "esittelija": "Testi Esittelijä"}',
        false, 'oiva', '2017-09-21 09:48:22.066839', null, null, 'cc3c1d00-43b6-11e8-b2ef-005056aa0e67', null, null);