-- schema owner
CREATE USER jpoint WITH password 'jpoint';

-- schema user
CREATE USER jpoint_ms WITH password 'jpoint_ms';

-- create schema
CREATE SCHEMA jpoint AUTHORIZATION jpoint;

GRANT USAGE ON SCHEMA jpoint TO jpoint_ms;
GRANT USAGE ON SCHEMA jpoint TO jpoint;