package com.company.paythatrent.entity.employermanagement;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PAYTHATRENT_BANK_DETAILS")
@Entity(name = "paythatrent_BankDetails")
public class BankDetails extends StandardEntity {
    private static final long serialVersionUID = -2075007740771579184L;

    @NotNull
    @Column(name = "BANK_ID", nullable = false, unique = true)
    private Integer bankId;

    @NotNull
    @Column(name = "BANK_NAME", nullable = false)
    private String bankName;

    @Column(name = "BRANCH")
    private String branch;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }
}