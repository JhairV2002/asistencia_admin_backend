CREATE TABLE IF NOT EXISTS public.actividades
(
    actividad_id serial NOT NULL,
    nombre character varying COLLATE pg_catalog."default",
    categoria character varying COLLATE pg_catalog."default",
    created timestamp without time zone,
    updated timestamp without time zone,
    enabled boolean,
    archivate boolean,
    categoria_id integer,
    CONSTRAINT actividades_pkey PRIMARY KEY (actividad_id),
    CONSTRAINT fk_actividades_categoria FOREIGN KEY (categoria_id)
        REFERENCES public.categoria_actividad (categoria_actividad_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

CREATE TABLE IF NOT EXISTS public.categoria_actividad
(
    categoria_actividad_id serial NOT NULL,
    nombre character varying(200) COLLATE pg_catalog."default",
    secuencia integer NOT NULL DEFAULT nextval('categoria_actividad_secuencia_seq'::regclass),
    color character varying(200) COLLATE pg_catalog."default",
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone NOT NULL,
    enabled boolean NOT NULL,
    archived boolean NOT NULL,
    rol_id integer,
    CONSTRAINT categoria_actividad_pkey PRIMARY KEY (categoria_actividad_id),
    CONSTRAINT fk_rol FOREIGN KEY (rol_id)
        REFERENCES public.roles (rol_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

CREATE TABLE IF NOT EXISTS public.dias_festivos
(
    id_dia_festivo serial NOT NULL,
    nombre_dia_festivo character varying COLLATE pg_catalog."default",
    fecha_dia_festivo date,
    created timestamp without time zone,
    updated timestamp without time zone,
    archived boolean,
    enabled boolean,
    fk_roles integer,
    CONSTRAINT dias_festivos_pkey PRIMARY KEY (id_dia_festivo)
)
CREATE TABLE IF NOT EXISTS public.personas
(
    id serial NOT NULL DEFAULT,
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(50) COLLATE pg_catalog."default" NOT NULL,
    enabled boolean NOT NULL,
    CONSTRAINT personas_pkey PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS public.roles
(
    rol_id serial NOT NULL,
    nombre character varying(50) COLLATE pg_catalog."default" NOT NULL,
    admin boolean NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone NOT NULL,
    enable boolean NOT NULL,
    archived boolean NOT NULL,
    categoria_actividad_id integer,
    CONSTRAINT rol_pkey PRIMARY KEY (rol_id),
    CONSTRAINT fk_categoria_roles FOREIGN KEY (categoria_actividad_id)
        REFERENCES public.categoria_actividad (categoria_actividad_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)



CREATE TABLE IF NOT EXISTS public.dias_festivos_categorias
(
    id serial NOT NULL,
    dia_festivo_id integer,
    categoria_id integer,
    CONSTRAINT dias_festivos_categorias_pkey PRIMARY KEY (id),
    CONSTRAINT fk_categorias FOREIGN KEY (categoria_id)
        REFERENCES public.categoria_actividad (categoria_actividad_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_dias_festivos FOREIGN KEY (dia_festivo_id)
        REFERENCES public.dias_festivos (id_dia_festivo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)


CREATE TABLE IF NOT EXISTS public.rol_person
(
    id serial NOT NULL,
    rol_id integer,
    person_id integer,
    CONSTRAINT role_person_pkey PRIMARY KEY (id),
    CONSTRAINT fk_person_id FOREIGN KEY (person_id)
        REFERENCES public.personas (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_rol_id FOREIGN KEY (rol_id)
        REFERENCES public.roles (rol_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)


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
*TABLA PRIMARIA*



*TABLA DE ROMPIMIENTO*

CREATE TABLE IF NOT EXISTS public.categoria_actividades
(
    id serial NOT NULL,
    categoria_id integer,
    actividad_id integer,
    CONSTRAINT categoria_actividades_pkey PRIMARY KEY (id),
    CONSTRAINT fk_actividad FOREIGN KEY (actividad_id)
        REFERENCES public.actividades (actividad_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_categoria FOREIGN KEY (categoria_id)
        REFERENCES public.categoria_actividad (categoria_actividad_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
