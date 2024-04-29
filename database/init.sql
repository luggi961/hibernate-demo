CREATE DATABASE demo
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.UTF-8'
    LC_CTYPE = 'en_US.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

create table abstract_entity
(
    dtype       text  not null,
    id          bigint generated by default as identity
        constraint abstract_entity_pk
            primary key,
    entity_data jsonb not null
);

insert into abstract_entity (dtype, entity_data)
values ('EntityA', '{
    "testA": "Test Test",
    "id": 999
}')