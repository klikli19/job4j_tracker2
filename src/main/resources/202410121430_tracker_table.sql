-- liquibase formatted sql

-- changeset klikli:1
CREATE TABLE items (
                       id SERIAL PRIMARY KEY,
                       name TEXT,
                       created TIMESTAMP
);