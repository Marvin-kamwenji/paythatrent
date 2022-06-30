package com.company.paythatrent.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "PAYTHATRENT_TENANT")
@Entity(name = "paythatrent_Tenant")
@NamePattern("%s|firstName")
public class Tenant extends StandardEntity {
    private static final long serialVersionUID = 553709370074538289L;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "IDENTIFICATION_NUMBER", nullable = false, unique = true)
    @NotNull
    private Long identificationNumber;

    @Column(name = "PASSPORT_NUMBER", unique = true)
    private Long passportNumber;

    @Column(name = "TENANT_STATUS")
    private String tenantStatus;

    @NotNull
    @Column(name = "NATIONALITY", nullable = false)
    private String nationality;

    @NotNull
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "ADDRESS", nullable = false)
    @NotNull
    private Long address;

    @Column(name = "MOBILE_NUMBER", nullable = false)
    @NotNull
    private Long mobileNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    @Email
    private String email;

    @NotNull
    @Column(name = "CURRENT_SALARY", nullable = false)
    private Long currentSalary;

    public void setIdentificationNumber(Long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setPassportNumber(Long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Long getPassportNumber() {
        return passportNumber;
    }

    public void setAddress(Long address) {
        this.address = address;
    }

    public Long getAddress() {
        return address;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public Long getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Long currentSalary) {
        this.currentSalary = currentSalary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTenantStatus() {
        return tenantStatus;
    }

    public void setTenantStatus(String tenantStatus) {
        this.tenantStatus = tenantStatus;
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
}