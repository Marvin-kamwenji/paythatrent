package com.company.paythatrent.entity.employermanagement;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "PAYTHATRENT_EMPLOYER")
@Entity(name = "paythatrent_Employer")
@NamePattern("%s %s|employerName,address")
public class Employer extends StandardEntity {
    private static final long serialVersionUID = 1649396251937890672L;

    @NotNull
    @Column(name = "EMPLOYER_NAME", nullable = false)
    private String employerName;

    @Column(name = "ADDRESS")
    private Long address;

    @Column(name = "EMAIL")
    @Email
    private String email;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false)
    private Long phoneNumber;

    @NotNull
    @Column(name = "CONTRACT_TYPE", nullable = false)
    private String contractType;

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAddress() {
        return address;
    }

    public void setAddress(Long address) {
        this.address = address;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
}