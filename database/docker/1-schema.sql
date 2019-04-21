CREATE TABLE patient (
    id CHARACTER VARYING (255) PRIMARY KEY,
    identifier CHARACTER VARYING(255) NOT NULL,
    name CHARACTER VARYING(255) NOT NULL
);

CREATE TABLE eoc (
    id CHARACTER VARYING (255) PRIMARY KEY,
    identifier CHARACTER VARYING(255) NOT NULL,
    patient_id CHARACTER VARYING(255) NOT NULL,
    team_id CHARACTER VARYING(255) NOT NULL
);

CREATE TABLE team (
    id CHARACTER VARYING (255) PRIMARY KEY,
    doctor_id CHARACTER VARYING(255) NOT NULL,
);

CREATE TABLE doctor  (
    id CHARACTER VARYING (255) PRIMARY KEY,
    identifier CHARACTER VARYING(255) NOT NULL,
    name CHARACTER VARYING(255) NOT NULL
    issuer CHARACTER VARYING(255) NOT NULL
    qualification CHARACTER VARYING(255) NOT NULL

CREATE TABLE organization (
    id CHARACTER VARYING (255) PRIMARY KEY,
    identifier CHARACTER VARYING(255) NOT NULL,
    name CHARACTER VARYING(255) NOT NULL
);
