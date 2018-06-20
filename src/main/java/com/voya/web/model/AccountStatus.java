package com.voya.web.model;

public class AccountStatus extends VoyaModal {
    private String secondaryStatusCode;
    private String additionalStatusCode;
    private String lastUpdateDate;
    private String addedOrClosedDate;
    private String previousStatusCode;
    private String primaryStatusCode;

    public AccountStatus() {
    }

    public AccountStatus(String secondaryStatusCode, String additionalStatusCode, String lastUpdateDate, String addedOrClosedDate, String previousStatusCode, String primaryStatusCode) {
        this.secondaryStatusCode = secondaryStatusCode;
        this.additionalStatusCode = additionalStatusCode;
        this.lastUpdateDate = lastUpdateDate;
        this.addedOrClosedDate = addedOrClosedDate;
        this.previousStatusCode = previousStatusCode;
        this.primaryStatusCode = primaryStatusCode;
    }

    public String getSecondaryStatusCode() {
        return secondaryStatusCode;
    }

    public void setSecondaryStatusCode(String secondaryStatusCode) {
        this.secondaryStatusCode = secondaryStatusCode;
    }

    public String getAdditionalStatusCode() {
        return additionalStatusCode;
    }

    public void setAdditionalStatusCode(String additionalStatusCode) {
        this.additionalStatusCode = additionalStatusCode;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getAddedOrClosedDate() {
        return addedOrClosedDate;
    }

    public void setAddedOrClosedDate(String addedOrClosedDate) {
        this.addedOrClosedDate = addedOrClosedDate;
    }

    public String getPreviousStatusCode() {
        return previousStatusCode;
    }

    public void setPreviousStatusCode(String previousStatusCode) {
        this.previousStatusCode = previousStatusCode;
    }

    public String getPrimaryStatusCode() {
        return primaryStatusCode;
    }

    public void setPrimaryStatusCode(String primaryStatusCode) {
        this.primaryStatusCode = primaryStatusCode;
    }
}
