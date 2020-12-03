DELETE FROM public.race_data;

-- Insert x seasons

INSERT INTO public.race_data
	(id, season_number, season_round, race_name, race_circuit_name, pilot_name, pilot_number, pilot_grid, pilot_position, status)
values
    (nextval('public.seq_race'), 4000, 1, 'American Gran Prix', 'USA Speed Rapids', 'Robert Smith', 42, 1, 2, 'Finished'),
    (nextval('public.seq_race'), 4000, 1, 'American Gran Prix', 'USA Speed Rapids', 'Nelson Silva', 31, 2, 1, 'Finished'),
    (nextval('public.seq_race'), 4000, 1, 'American Gran Prix', 'USA Speed Rapids', 'Paolo Riccati', 23, 3, 4, 'Finished'),
    (nextval('public.seq_race'), 4000, 1, 'American Gran Prix', 'USA Speed Rapids', 'Franz Lyndt', 14, 4, 3, 'Finished'),

    (nextval('public.seq_race'), 4000, 2, 'European Gran Prix', 'Euro Race', 'Robert Smith', 42, 1, 1, 'Finished'),
    (nextval('public.seq_race'), 4000, 2, 'European Gran Prix', 'Euro Race', 'Paolo Riccati', 23, 2, 2, 'Finished'),
    (nextval('public.seq_race'), 4000, 2, 'European Gran Prix', 'Euro Race', 'Franz Lyndt', 14, 3, 3, 'Finished'),
    (nextval('public.seq_race'), 4000, 2, 'European Gran Prix', 'Euro Race', 'Nelson Silva', 31, 4, 4, 'Finished');

/*INSERT INTO public.race_data
	(id, season_number, season_round, race_name, race_circuit_name, pilot_name, pilot_number, pilot_grid, pilot_position, status)
values
    (nextval('public.seq_race'), 4001, 1, 'Asian Gran Prix', 'First', 'Pilot1', 1, 1, 1, 'Finished'),
    (nextval('public.seq_race'), 4001, 1, 'Asian Gran Prix', 'First', 'Pilot2', 2, 2, 2, 'Finished'),
    (nextval('public.seq_race'), 4001, 1, 'Asian Gran Prix', 'First', 'Pilot3', 3, 3, 3, 'Finished'),
    (nextval('public.seq_race'), 4001, 1, 'Asian Gran Prix', 'First', 'Pilot4', 4, 4, 4, 'Finished'),

    (nextval('public.seq_race'), 4001, 2, 'African Gran Prix', 'First', 'Pilot1', 1, 1, 1, 'Finished'),
    (nextval('public.seq_race'), 4001, 2, 'African Gran Prix', 'First', 'Pilot2', 2, 2, 2, 'Finished'),
    (nextval('public.seq_race'), 4001, 2, 'African Gran Prix', 'First', 'Pilot3', 3, 3, 3, 'Finished'),
    (nextval('public.seq_race'), 4001, 2, 'African Gran Prix', 'First', 'Pilot4', 4, 4, 4, 'Finished'),

INSERT INTO public.race_data
	(id, season_number, season_round, race_name, race_circuit_name, pilot_name, pilot_number, pilot_grid, pilot_position, status)
values
    (nextval('public.seq_race'), 4002, 1, 'Oceania Gran Prix', 'First', 'Pilot1', 1, 1, 1, 'Finished'),
    (nextval('public.seq_race'), 4002, 1, 'Oceania Gran Prix', 'First', 'Pilot2', 2, 2, 2, 'Finished'),
    (nextval('public.seq_race'), 4002, 1, 'Oceania Gran Prix', 'First', 'Pilot3', 3, 3, 3, 'Finished'),
    (nextval('public.seq_race'), 4002, 1, 'Oceania Gran Prix', 'First', 'Pilot4', 4, 4, 4, 'Finished'),

    (nextval('public.seq_race'), 4002, 2, 'Antartican Gran Prix', 'First', 'Pilot1', 1, 1, 1, 'Finished'),
    (nextval('public.seq_race'), 4002, 2, 'Antartican Gran Prix', 'First', 'Pilot2', 2, 2, 2, 'Finished'),
    (nextval('public.seq_race'), 4002, 2, 'Antartican Gran Prix', 'First', 'Pilot3', 3, 3, 3, 'Finished'),
    (nextval('public.seq_race'), 4002, 2, 'Antartican Gran Prix', 'First', 'Pilot4', 4, 4, 4, 'Finished'),*/
