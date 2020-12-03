DELETE FROM public.race_data;

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
