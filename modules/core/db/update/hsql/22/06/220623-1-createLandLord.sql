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
);