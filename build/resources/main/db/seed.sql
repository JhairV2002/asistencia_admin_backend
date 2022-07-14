CREATE TABLE IF NOT EXISTS public.categoria_actividad
(
    categoria_actividad_id integer NOT NULL DEFAULT nextval('categoria_actividad_categoria_actividad_id_seq'::regclass),
    nombre character varying(200) COLLATE pg_catalog."default",
    secuencia integer COLLATE pg_catalog."default",
    color character varying(200) COLLATE pg_catalog."default"
    created timestamp without time zone,
    updated timestamp without time zone
    enabled boolean,
    archived boolean,
    CONSTRAINT categoria_actividad_pkey PRIMARY KEY (categoria_actividad_id)
)