-- Table: public.superheroe

-- DROP TABLE public.superheroe;

CREATE TABLE public.superheroe
(
    id integer NOT NULL,
    name character varying(64) COLLATE pg_catalog."default",
    description character varying(500) COLLATE pg_catalog."default",
    resource_uri character varying(150) COLLATE pg_catalog."default",
    last_update character varying(150) COLLATE pg_catalog."default",
    thumbnail_uri character varying(150) COLLATE pg_catalog."default",
    CONSTRAINT pk_superheroe PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.superheroe
    OWNER to postgres;