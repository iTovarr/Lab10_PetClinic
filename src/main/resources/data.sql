-- Datos de mascotas para pruebas
-- ID 1         : "Leo"       → usado en testFindPetById y testFindPetByName
-- type_id = 5  : 2 registros → usado en testFindPetByTypeId
-- owner_id = 10: 2 registros → usado en testFindPetByOwnerId

INSERT INTO pets (name, owner_id, type_id) VALUES ('Leo',      1,  5);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Basil',    4,  6);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Rosy',     5,  2);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Jewel',    5,  2);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Iggy',     6,  3);
INSERT INTO pets (name, owner_id, type_id) VALUES ('George',   7,  4);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Samantha', 8,  1);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Max',      8,  1);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Lucky',    9,  5);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Mulligan', 10, 5);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Freddy',   10, 4);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Lucky',    11, 2);
INSERT INTO pets (name, owner_id, type_id) VALUES ('Sly',      12, 1);