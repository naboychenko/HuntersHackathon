INSERT INTO patient (id, identifier, name) VALUES ('q1w2e3r4t5y6', '1q2w3e4r5t6y', 'Martin Fauler');
INSERT INTO doctor (id, identifier, name, issuer, qualification) VALUES ('a1s2d3f4g5h6', '3d4f5g6h', 'John Nesh', 'sdss', 'Ophthalmologist');
INSERT INTO organization(id, identifier, name) VALUES ('z1x2c3v4b5n6', '3c4v5b6n', 'Men Clinic');
INSERT INTO team(id, doctor_id) VALUES ('z1x2ct435n6', 'a1s2d3f4g5h6');
INSERT INTO eoc(id, identifier, timestamp, patient_id, team_id, organization_id)
          VALUES ('z1x2c3v4b5y9', '84fewe3', '2019-06-22 19:10:25-07', 'q1w2e3r4t5y6', 'z1x2ct435n6', 'z1x2c3v4b5n6');