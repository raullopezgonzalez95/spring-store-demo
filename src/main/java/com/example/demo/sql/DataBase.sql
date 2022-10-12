create table db_example.equivalencias
(
    id         int primary key not null auto_increment,
    categoria  varchar(50)     not null,
    alimento   varchar(50)     not null,
    porcion    varchar(50)     not null,
    comentario varchar(500) null
);

ALTER TABLE db_example.equivalencias
    ADD COLUMN existencia BOOLEAN DEFAULT false NULL AFTER porcion;

ALTER TABLE db_example.equivalencias
    CONVERT TO CHARACTER SET utf8;

insert into db_example.equivalencias(categoria, alimento, porcion, comentario)
values ('FRUTAS', 'Agua de coco natural', '1 1/2 taza', null),
       ('FRUTAS', 'Agua de coco envasada', '1 bote individual (250 ml)', null),
       ('FRUTAS', 'Arándanos deshidratados', '1⁄4 taza', null),
       ('FRUTAS', 'Blueberries', '3⁄4 de taza (100 gramos)', null),
       ('FRUTAS', 'Cereza', '20 piezas (100 gramos)', null),
       ('FRUTAS', 'Chabacano chico', '2 piezas', null),
       ('FRUTAS', 'Ciruela roja grande', '1 pieza', null),
       ('FRUTAS', 'Ciruela pasa', '4 piezas (25 gramos)', null),
       ('FRUTAS', 'Dátil', '2 piezas', null),
       ('FRUTAS', 'Durazno', '1 pieza grande o 2 chicos (155 gramos)', null),
       ('FRUTAS', 'Frambuesa', '1 taza (125 gramos)', null),
       ('FRUTAS', 'Fresas', '1 taza (190 gramos)', null),
       ('FRUTAS', 'Guayaba', '1 grande o 2 chicas (105 gramos)', null),
       ('FRUTAS', 'Granada roja', '1⁄2 pieza (85 gramos)', null),
       ('FRUTAS', 'Granada china', '2 piezas', null),
       ('FRUTAS', 'Higo', '3 piezas (75 gramos)', null),
       ('FRUTAS', 'Kiwi', '2 piezas (100 gramos)', null),
       ('FRUTAS', 'Lichis', '10 piezas (90 gramos)', null),
       ('FRUTAS', 'Mamey', '1⁄4 pieza', null),
       ('FRUTAS', 'Mandarina', '1 grande o 2 chicas (110 gramos)', null),
       ('FRUTAS', 'Mango', '1⁄2 pieza (90 gramos)', null),
       ('FRUTAS', 'Manzana', '1 pieza (110 gramos)', null),
       ('FRUTAS', 'Manzana deshidratada', '6 orejones', null),
       ('FRUTAS', 'Melón', '1 1⁄2 taza (180 gramos)', null),
       ('FRUTAS', 'Moras', '1 taza', null),
       ('FRUTAS', 'Naranja', '2 chicas o 1 grande (125 gramos)', null),
       ('FRUTAS', 'Papaya', '1 taza (150 gramos)', null),
       ('FRUTAS', 'Pera', '1⁄2 pieza (100 gramos)', null),
       ('FRUTAS', 'Pasitas', '10 piezas', null),
       ('FRUTAS', 'Piña', '1 taza (120 gramos)', null),
       ('FRUTAS', 'Plátano/Plátano macho', '1 chico o 1⁄2 grande (65 gramos)', null),
       ('FRUTAS', 'Plátano dominico', '2 piezas', null),
       ('FRUTAS', 'Sandía', '1 taza (195 gramos)', null),
       ('FRUTAS', 'Toronja', '1⁄2 pieza (140 gramos)', null),
       ('FRUTAS', 'Tuna', '2 piezas (155 gramos)', null),
       ('FRUTAS', 'Uvas', '1 taza (85 gramos)', null),
       ('FRUTAS', 'Mermelada sin azúcar', '1 cda (15 gramos)', null),
       ('FRUTAS', 'Fruta liofilizada', '1 taza', null),
       ('FRUTAS', 'Zarzamora', '1 taza (100 gramos)', null);
