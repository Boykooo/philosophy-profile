create extension if not exists pgcrypto;

create table profile
(
    id         uuid default gen_random_uuid() primary key,
    email      varchar(255) not null,
    first_name varchar(255) not null,
    last_name  varchar(255) not null
);