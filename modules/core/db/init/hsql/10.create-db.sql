-- begin PAYTHATRENT_TENANT
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
)^
-- end PAYTHATRENT_TENANT
-- begin PAYTHATRENT_EMPLOYER
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
)^
-- end PAYTHATRENT_EMPLOYER
-- begin PAYTHATRENT_BANK_DETAILS
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
)^
-- end PAYTHATRENT_BANK_DETAILS
-- begin PAYTHATRENT_LAND_LORD
create table PAYTHATRENT_LAND_LORD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LANDLORD_REGISTRATION_CODE bigint not null,
    LANDLORD_TYPE varchar(255),
    COMPANY_NAME varchar(255),
    FIRST_NAME varchar(255),
    MIDDLE_NAME varchar(255),
    LAST_NAME varchar(255),
    IDENTIFICATION_NUMBER varchar(255),
    EMAIL varchar(255) not null,
    PHONE_NUMBER varchar(255),
    PASSPORT_NUMBER bigint,
    --
    primary key (ID)
)^
-- end PAYTHATRENT_LAND_LORD
