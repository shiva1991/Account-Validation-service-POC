package com.voya.web.model;

public class RawResponse extends VoyaModal {
    private String bankRoutingNumber;
    private String bankAccountNumber;
    private AccountOwner accountOwner;
    private AccountStatus accountStatus;

    public RawResponse() {
    }

    /**
     * @param bankRoutingNumber
     * @param bankAccountNumber
     * @param accountOwner
     * @param accountStatus
     */
    public RawResponse(String bankRoutingNumber, String bankAccountNumber, AccountOwner accountOwner, AccountStatus accountStatus) {
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.accountOwner = accountOwner;
        this.accountStatus = accountStatus;
    }

    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(AccountOwner accountOwner) {
        this.accountOwner = accountOwner;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
