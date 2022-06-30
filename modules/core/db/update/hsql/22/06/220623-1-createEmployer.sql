create table PAYTHATRENT_EMPLOYER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYER_NAME varchar(255) not null,
    ADDRESS bigint,
    EMAIL varchar(255),
    PHONE_NUMBER bigint not null,
    CONTRACT_TYPE varchar(255) not null,
    --
    primary key (ID)
);