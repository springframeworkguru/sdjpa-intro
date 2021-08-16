drop table if exists book;
drop table if exists author;

create table book (
                      id IDENTITY not null,
                      isbn varchar(255),
                      publisher varchar(255),
                      title varchar(255),
                      author_id BIGINT,
                      primary key (id)
);

create table author
(
    id         IDENTITY not null,
    first_name varchar(255),
    last_name varchar(255),
    primary key (id)
);