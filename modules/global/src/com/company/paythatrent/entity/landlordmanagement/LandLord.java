package com.company.paythatrent.entity.landlordmanagement;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PAYTHATRENT_LAND_LORD")
@Entity(name = "paythatrent_LandLord")
@NamePattern("%s|firstName")
public class LandLord extends StandardEntity {
    private static final long serialVersionUID = -3262693931175004429L;

    @NotNull
    @Column(name = "LANDLORD_REGISTRATION_CODE", nullable = false)
    private Long landlordRegistrationCode;

    @Column(name = "LANDLORD_TYPE")
    private String landlordType;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "IDENTIFICATION_NUMBER")
    private String identificationNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "PASSPORT_NUMBER")
    private Long passportNumber;

    public Long getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLandlordType() {
        return landlordType;
    }

    public void setLandlordType(String landlordType) {
        this.landlordType = landlordType;
    }

    public Long getLandlordRegistrationCode() {
        return landlordRegistrationCode;
    }

    public void setLandlordRegistrationCode(Long landlordRegistrationCode) {
        this.landlordRegistrationCode = landlordRegistrationCode;
    }
}