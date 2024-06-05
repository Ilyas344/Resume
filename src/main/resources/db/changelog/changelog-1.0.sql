--liquibase formatted sql
--
-- Create Resume table
--
CREATE TABLE IF NOT EXISTS resume
(
    id         BIGSERIAL    NOT NULL PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    contact_id BIGINT       NOT NULL,
    CONSTRAINT fk_resume_contact FOREIGN KEY (contact_id) REFERENCES contacts (id)
);

--liquibase formatted sql
--
-- Create Projects table
--
CREATE TABLE IF NOT EXISTS projects
(
    id          BIGSERIAL    NOT NULL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    description TEXT,
    link        VARCHAR(255)
);
--liquibase formatted sql
--
-- Create Experience table
--
CREATE TABLE IF NOT EXISTS experience
(
    id         BIGSERIAL NOT NULL PRIMARY KEY,
    company_id BIGINT    NOT NULL,
    start_date DATE      NOT NULL,
    end_date   DATE,
    experience INT,

    CONSTRAINT fk_experience_company FOREIGN KEY (company_id) REFERENCES company (id)
);

--liquibase formatted sql
--
-- Create Company table
--
CREATE TABLE IF NOT EXISTS company
(
    id          BIGSERIAL    NOT NULL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    description TEXT
);
--liquibase formatted sql
--
-- Create Institution table
--
--liquibase formatted sql
--
-- Create Institution table
--
CREATE TABLE IF NOT EXISTS institution
(
    id      BIGSERIAL    NOT NULL PRIMARY KEY,
    name    VARCHAR(255) NOT NULL,
    address  VARCHAR (255),
    phone   VARCHAR(255),
    email   VARCHAR(255),
    website VARCHAR(255)
);

--liquibase formatted sql
--
-- Create Education table
--
CREATE TABLE IF NOT EXISTS education
(
    id             BIGSERIAL NOT NULL PRIMARY KEY,
    is_graduated   BOOLEAN   NOT NULL,
    start_date     DATE      NOT NULL,
    end_date       DATE,
    institution_id BIGINT    NOT NULL,
        CONSTRAINT fk_education_institution FOREIGN KEY (institution_id) REFERENCES institution (id)
);
--liquibase formatted sql
--
-- Create Contacts table
--
CREATE TABLE contacts
(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    PRIMARY KEY (id)
);
--liquibase formatted sql
--
-- Create contact_phones table
--
CREATE TABLE contact_phones
(
    contact_id   BIGINT       NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    PRIMARY KEY (contact_id, phone_number),
    CONSTRAINT fk_contact_phones_contact FOREIGN KEY (contact_id) REFERENCES contacts (id)
);

--liquibase formatted sql
--
-- Create contact_emails table
--
CREATE TABLE contact_emails
(
    contact_id    BIGINT       NOT NULL,
    email_address VARCHAR(255) NOT NULL,
    PRIMARY KEY (contact_id, email_address),
    CONSTRAINT fk_contact_emails_contact FOREIGN KEY (contact_id) REFERENCES contacts (id)
);

--liquibase formatted sql
--
-- Create contact_links table
--
CREATE TABLE contact_links
(
    contact_id BIGINT       NOT NULL,
    link       VARCHAR(255) NOT NULL,
    PRIMARY KEY (contact_id, link),
    CONSTRAINT fk_contact_links_contact FOREIGN KEY (contact_id) REFERENCES contacts (id)
);







