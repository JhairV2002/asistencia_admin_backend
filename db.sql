create table actividades(
actividad_id serial,
	nombre character varying,
	categoria character varying,
	created timestamp without time zone,
	updated timestamp without time zone,
	enabled boolean,
	archivate boolean

);
CREATE TABLE IF NOT EXISTS public.actividad_dias_festivos
(
    id serial NOT NULL,
    actividad_id integer,
    dias_festivos_id integer,
    CONSTRAINT fk_actividades FOREIGN KEY (actividad_id)
        REFERENCES public.actividades (actividad_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_dias_feriados FOREIGN KEY (dias_festivos_id)
        REFERENCES public.dias_festivos (id_dia_festivo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
actividades_dias_feriados
drop table actividades;
select * from actividades;