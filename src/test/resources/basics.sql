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

-- Insert at least 5 seasons

INSERT INTO public.race_data
	(id, season_number, season_round, race_name, race_circuit_name, race_locality, race_country, pilot_name, pilot_number, pilot_grid, pilot_position, constructor_name, fastest_lap_rank, status, finish_status)
values
    (nextval('public.seq_race'), 3000, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

    (nextval('public.seq_race'), 3000, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

    (nextval('public.seq_race'), 3000, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

    (nextval('public.seq_race'), 3000, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

    (nextval('public.seq_race'), 3000, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3000, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null);

INSERT INTO public.race_data
	(id, season_number, season_round, race_name, race_circuit_name, race_locality, race_country, pilot_name, pilot_number, pilot_grid, pilot_position, constructor_name, fastest_lap_rank, status, finish_status)
 values
    (nextval('public.seq_race'), 3001, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

    (nextval('public.seq_race'), 3001, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

    (nextval('public.seq_race'), 3001, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

    (nextval('public.seq_race'), 3001, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

    (nextval('public.seq_race'), 3001, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
    (nextval('public.seq_race'), 3001, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null);

INSERT INTO public.race_data
	(id, season_number, season_round, race_name, race_circuit_name, race_locality, race_country, pilot_name, pilot_number, pilot_grid, pilot_position, constructor_name, fastest_lap_rank, status, finish_status)
 values
    (nextval('public.seq_race'), 3002, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3002, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3002, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3002, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3002, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3002, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null);

INSERT INTO public.race_data
 	(id, season_number, season_round, race_name, race_circuit_name, race_locality, race_country, pilot_name, pilot_number, pilot_grid, pilot_position, constructor_name, fastest_lap_rank, status, finish_status)
 values
     (nextval('public.seq_race'), 3003, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3003, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3003, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3003, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3003, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3003, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null);

INSERT INTO public.race_data
 	(id, season_number, season_round, race_name, race_circuit_name, race_locality, race_country, pilot_name, pilot_number, pilot_grid, pilot_position, constructor_name, fastest_lap_rank, status, finish_status)
 values
     (nextval('public.seq_race'), 3004, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 1, 'First Gran Prix', 'First', 'Locality1', 'Country1', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3004, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 2, 'Second Gran Prix', 'First', 'Locality2', 'Country2', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3004, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 3, 'Third Gran Prix', 'First', 'Locality3', 'Country3', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3004, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 4, 'Fourth Gran Prix', 'First', 'Locality4', 'Country4', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null),

     (nextval('public.seq_race'), 3004, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot1', 1, 1, 1, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot2', 2, 2, 2, 'Constructor1', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot3', 3, 3, 3, 'Constructor2', -1, 'Finished', null),
     (nextval('public.seq_race'), 3004, 5, 'Fifth Gran Prix', 'First', 'Locality5', 'Country5', 'Pilot4', 4, 4, 4, 'Constructor2', -1, 'Finished', null);
