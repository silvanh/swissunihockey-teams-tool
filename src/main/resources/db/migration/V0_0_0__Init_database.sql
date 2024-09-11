create extension if not exists "uuid-ossp";

create table IF NOT EXISTS application_property (
	id              uuid primary key    default uuid_generate_v1(),
	key  varchar(255)        not null,
	value  varchar(255)        not null,
	read_only       boolean             not null default false
);
