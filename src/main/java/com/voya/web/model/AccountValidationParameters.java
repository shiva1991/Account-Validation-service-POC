package com.voya.web.model;

public class AccountValidationParameters extends VoyaModal {
    private String bankRoutingNumber;
    private String bankAccountNumber;
    private String businessName;
    private String firstName;
    private String middleName;
    private String lastName;
    private String namePrefix;
    private String nameSuffix;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zip;
    private String homePhone;
    private String workPhone;
    private String taxId;
    private String dateOfBirth;
    private String documentIssuer;
    private String documentType;
    private String documentIdNumber;

    public AccountValidationParameters() {
    }

    public AccountValidationParameters(String bankRoutingNumber, String bankAccountNumber, String businessName, String firstName, String middleName, String lastName, String namePrefix, String nameSuffix, String city, String state, String zip, String homePhone, String workPhone, String taxId, String dateOfBirth, String documentIssuer, String documentType, String documentIdNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.businessName = businessName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.namePrefix = namePrefix;
        this.nameSuffix = nameSuffix;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.taxId = taxId;
        this.dateOfBirth = dateOfBirth;
        this.documentIssuer = documentIssuer;
        this.documentType = documentType;
        this.documentIdNumber = documentIdNumber;
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

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDocumentIssuer() {
        return documentIssuer;
    }

    public void setDocumentIssuer(String documentIssuer) {
        this.documentIssuer = documentIssuer;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentIdNumber() {
        return documentIdNumber;
    }

    public void setDocumentIdNumber(String documentIdNumber) {
        this.documentIdNumber = documentIdNumber;
    }
}
