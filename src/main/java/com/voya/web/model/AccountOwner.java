package com.voya.web.model;

public class AccountOwner extends VoyaModal {
    private String conditionCode;
    private String nameMatch;
    private String firstNameMatch;
    private String lastNameMatch;
    private String middleNameMatch;
    private String nameSuffixMatch;
    private String addressMatch;
    private String cityMatch;
    private String stateMatch;
    private String zipMatch;
    private String homePhoneMatch;
    private String taxIdMatch;
    private String dateOfBirthMatch;
    private String documentIdTypeMatch;
    private String documentIdNumberMatch;
    private String documentIssuerMatch;
    private String overallMatchScore;

    public AccountOwner() {
    }

    public AccountOwner(String conditionCode, String nameMatch, String firstNameMatch, String lastNameMatch, String middleNameMatch, String nameSuffixMatch, String addressMatch, String cityMatch, String stateMatch, String zipMatch, String homePhoneMatch, String taxIdMatch, String dateOfBirthMatch, String documentIdTypeMatch, String documentIdNumberMatch, String documentIssuerMatch, String overallMatchScore) {
        this.conditionCode = conditionCode;
        this.nameMatch = nameMatch;
        this.firstNameMatch = firstNameMatch;
        this.lastNameMatch = lastNameMatch;
        this.middleNameMatch = middleNameMatch;
        this.nameSuffixMatch = nameSuffixMatch;
        this.addressMatch = addressMatch;
        this.cityMatch = cityMatch;
        this.stateMatch = stateMatch;
        this.zipMatch = zipMatch;
        this.homePhoneMatch = homePhoneMatch;
        this.taxIdMatch = taxIdMatch;
        this.dateOfBirthMatch = dateOfBirthMatch;
        this.documentIdTypeMatch = documentIdTypeMatch;
        this.documentIdNumberMatch = documentIdNumberMatch;
        this.documentIssuerMatch = documentIssuerMatch;
        this.overallMatchScore = overallMatchScore;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }

    public String getNameMatch() {
        return nameMatch;
    }

    public void setNameMatch(String nameMatch) {
        this.nameMatch = nameMatch;
    }

    public String getFirstNameMatch() {
        return firstNameMatch;
    }

    public void setFirstNameMatch(String firstNameMatch) {
        this.firstNameMatch = firstNameMatch;
    }

    public String getLastNameMatch() {
        return lastNameMatch;
    }

    public void setLastNameMatch(String lastNameMatch) {
        this.lastNameMatch = lastNameMatch;
    }

    public String getMiddleNameMatch() {
        return middleNameMatch;
    }

    public void setMiddleNameMatch(String middleNameMatch) {
        this.middleNameMatch = middleNameMatch;
    }

    public String getNameSuffixMatch() {
        return nameSuffixMatch;
    }

    public void setNameSuffixMatch(String nameSuffixMatch) {
        this.nameSuffixMatch = nameSuffixMatch;
    }

    public String getAddressMatch() {
        return addressMatch;
    }

    public void setAddressMatch(String addressMatch) {
        this.addressMatch = addressMatch;
    }

    public String getCityMatch() {
        return cityMatch;
    }

    public void setCityMatch(String cityMatch) {
        this.cityMatch = cityMatch;
    }

    public String getStateMatch() {
        return stateMatch;
    }

    public void setStateMatch(String stateMatch) {
        this.stateMatch = stateMatch;
    }

    public String getZipMatch() {
        return zipMatch;
    }

    public void setZipMatch(String zipMatch) {
        this.zipMatch = zipMatch;
    }

    public String getHomePhoneMatch() {
        return homePhoneMatch;
    }

    public void setHomePhoneMatch(String homePhoneMatch) {
        this.homePhoneMatch = homePhoneMatch;
    }

    public String getTaxIdMatch() {
        return taxIdMatch;
    }

    public void setTaxIdMatch(String taxIdMatch) {
        this.taxIdMatch = taxIdMatch;
    }

    public String getDateOfBirthMatch() {
        return dateOfBirthMatch;
    }

    public void setDateOfBirthMatch(String dateOfBirthMatch) {
        this.dateOfBirthMatch = dateOfBirthMatch;
    }

    public String getDocumentIdTypeMatch() {
        return documentIdTypeMatch;
    }

    public void setDocumentIdTypeMatch(String documentIdTypeMatch) {
        this.documentIdTypeMatch = documentIdTypeMatch;
    }

    public String getDocumentIdNumberMatch() {
        return documentIdNumberMatch;
    }

    public void setDocumentIdNumberMatch(String documentIdNumberMatch) {
        this.documentIdNumberMatch = documentIdNumberMatch;
    }

    public String getDocumentIssuerMatch() {
        return documentIssuerMatch;
    }

    public void setDocumentIssuerMatch(String documentIssuerMatch) {
        this.documentIssuerMatch = documentIssuerMatch;
    }

    public String getOverallMatchScore() {
        return overallMatchScore;
    }

    public void setOverallMatchScore(String overallMatchScore) {
        this.overallMatchScore = overallMatchScore;
    }
}
