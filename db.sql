create table actividades(
actividad_id serial,
	nombre character varying,
	categoria character varying,
	created timestamp without time zone,
	updated timestamp without time zone,
	enabled boolean,
	archivate boolean

);
drop table actividades;
select * from actividades;