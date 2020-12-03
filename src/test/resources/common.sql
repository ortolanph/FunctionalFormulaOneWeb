SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

CREATE TABLE public.race_data (
	id int8 NOT NULL,
	constructor_name varchar(255) NULL,
	fastest_lap_rank int4 NOT NULL,
	finish_status varchar(255) NULL,
	pilot_grid int4 NOT NULL,
	pilot_name varchar(255) NULL,
	pilot_number int4 NOT NULL,
	pilot_position int4 NOT NULL,
	race_circuit_name varchar(255) NULL,
	race_country varchar(255) NULL,
	race_locality varchar(255) NULL,
	race_name varchar(255) NULL,
	season_number int4 NOT NULL,
	season_round int4 NOT NULL,
	status varchar(255) NULL,
	CONSTRAINT race_data_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE public.seq_race
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;
