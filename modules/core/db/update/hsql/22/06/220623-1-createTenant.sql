create table PAYTHATRENT_TENANT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255),
    MIDDLE_NAME varchar(255),
    LAST_NAME varchar(255),
    IDENTIFICATION_NUMBER bigint not null,
    PASSPORT_NUMBER bigint,
    TENANT_STATUS varchar(255),
    NATIONALITY varchar(255) not null,
    DATE_OF_BIRTH date not null,
    ADDRESS bigint not null,
    MOBILE_NUMBER bigint not null,
    EMAIL varchar(255) not null,
    CURRENT_SALARY bigint not null,
    --
    primary key (ID)
);