create table PAYTHATRENT_BANK_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BANK_ID integer not null,
    BANK_NAME varchar(255) not null,
    BRANCH varchar(255),
    ACCOUNT_NUMBER varchar(255),
    --
    primary key (ID)
);