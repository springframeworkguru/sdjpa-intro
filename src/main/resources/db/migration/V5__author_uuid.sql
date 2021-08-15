create table author_uuid
(
    id         varchar(36) not null,
    first_name varchar(255),
    last_name varchar(255),
    primary key (id)
) engine = InnoDB;