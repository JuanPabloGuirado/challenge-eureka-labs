CREATE TABLE public.superhero
(
    id integer NOT NULL,
    name character varying(64),
    description character varying(500),
    resource_uri character varying(150),
    last_update character varying(150),
    thumbnail_uri character varying(150),
    CONSTRAINT pk_superheroe PRIMARY KEY (id)
)