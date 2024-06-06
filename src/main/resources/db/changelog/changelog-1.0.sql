--liquibase formatted sql
--
-- Create Resume table
--
CREATE TABLE IF NOT EXISTS resume
(
    id   BIGSERIAL    NOT NULL,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
--liquibase formatted sql
--
-- Create Projects table
--
CREATE TABLE IF NOT EXISTS projects
(
    id          BIGSERIAL    NOT NULL,
    name        VARCHAR(255) NOT NULL,
    description TEXT,
    link        VARCHAR(255),
    resume_id   BIGINT       NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_project_resume FOREIGN KEY (resume_id) REFERENCES resume (id)
);
--liquibase formatted sql
--
-- Create Company table
--
CREATE TABLE IF NOT EXISTS company
(
    id          BIGSERIAL    NOT NULL,
    name        VARCHAR(255) NOT NULL,
    position    VARCHAR(255),
    department  VARCHAR(255),
    description TEXT,
    PRIMARY KEY (id)
);
--liquibase formatted sql
--
-- Create Experience table
--
CREATE TABLE IF NOT EXISTS experience
(
    id         BIGSERIAL NOT NULL,
    company_id BIGINT    NOT NULL,
    start_date DATE      NOT NULL,
    end_date   DATE,
    experience INT,
    resume_id  BIGINT    NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_experience_company FOREIGN KEY (company_id) REFERENCES company (id),
    CONSTRAINT fk_experience_resume FOREIGN KEY (resume_id) REFERENCES resume (id)
);

--liquibase formatted sql
--
-- Create Institution table
--
CREATE TABLE IF NOT EXISTS institution
(
    id      BIGSERIAL    NOT NULL,
    name    VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    phone   VARCHAR(255),
    email   VARCHAR(255),
    website VARCHAR(255),
    PRIMARY KEY (id)
);
--liquibase formatted sql
--
-- Create Education table
--
CREATE TABLE IF NOT EXISTS education
(
    id             BIGSERIAL NOT NULL,
    is_graduated   BOOLEAN   NOT NULL,
    start_date     DATE      NOT NULL,
    end_date       DATE,
    institution_id BIGINT    NOT NULL,
    resume_id      BIGINT    NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_education_institution FOREIGN KEY (institution_id) REFERENCES institution (id),
    CONSTRAINT fk_education_resume FOREIGN KEY (resume_id) REFERENCES resume (id)
);


CREATE TABLE IF NOT EXISTS authority
(
    id   BIGSERIAL    NOT NULL PRIMARY KEY,
    name VARCHAR(255) NOT NULL

);
CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL          NOT NULL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(500)       NOT NULL,
    enabled  BOOLEAN            NOT NULL
);
CREATE TABLE users_authorities
(
    user_id      BIGINT NOT NULL REFERENCES users (id),
    authorities_id BIGINT NOT NULL REFERENCES authority (id),
    CONSTRAINT user_authority_pk PRIMARY KEY (user_id, authorities_id)
);










