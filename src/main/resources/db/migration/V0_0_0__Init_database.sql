create extension if not exists "uuid-ossp";

create table IF NOT EXISTS version (
	id              uuid primary key    default uuid_generate_v1(),
	version_string  varchar(255)        not null,
	read_only       boolean             not null default false
);
