CREATE TABLE patient (
    id CHARACTER VARYING (255) PRIMARY KEY,
    identifier CHARACTER VARYING(255) NOT NULL,
    name CHARACTER VARYING(255) NOT NULL
);

CREATE TABLE doctor (
    id CHARACTER VARYING (255) PRIMARY KEY,
    identifier CHARACTER VARYING(255) NOT NULL,
    name CHARACTER VARYING(255) NOT NULL,
    issuer CHARACTER VARYING(255) NOT NULL,
    qualification CHARACTER VARYING(255) NOT NULL);

CREATE TABLE team (
    id CHARACTER VARYING (255) PRIMARY KEY,
    doctor_id CHARACTER VARYING(255) NOT NULL,
    FOREIGN KEY (doctor_id) REFERENCES doctor (id)
);

CREATE TABLE organization (
    id CHARACTER VARYING (255) PRIMARY KEY,
    identifier CHARACTER VARYING(255) NOT NULL,
    name CHARACTER VARYING(255) NOT NULL
);

CREATE TABLE eoc (
    id CHARACTER VARYING (255) PRIMARY KEY,
    identifier CHARACTER VARYING(255) NOT NULL,
    timestamp TIMESTAMP NOT NULL,
    patient_id CHARACTER VARYING(255) NOT NULL,
    team_id CHARACTER VARYING(255) NOT NULL,
    organization_id CHARACTER VARYING(255) NOT NULL,
    FOREIGN KEY (patient_id) REFERENCES patient (id),
    FOREIGN KEY (team_id) REFERENCES team (id),
    FOREIGN KEY (organization_id) REFERENCES organization (id)
);

CREATE TABLE care_plan (
    id CHARACTER VARYING (255) PRIMARY KEY,
    description CHARACTER VARYING(255) NOT NULL,
    eoc_id CHARACTER VARYING (255),
    FOREIGN KEY (eoc_id) REFERENCES eoc (id)
);