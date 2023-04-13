DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo ENUM('Comercial','Tecnico','Operario'),
	salario int
);

insert into empleado (nombre, trabajo, salario) values ('Remiendos García', 'Operario', 1200);
insert into empleado (nombre, trabajo, salario) values ('Calvin Clain', 'Comercial', 1300);
insert into empleado (nombre, trabajo, salario) values ('Rodrigo Mendez', 'Tecnico', 1400);
