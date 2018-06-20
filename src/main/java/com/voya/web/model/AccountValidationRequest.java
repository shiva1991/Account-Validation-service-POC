package com.voya.web.model;

/**
 * Created by manoharc on 03/06/17.
 */
public class AccountValidationRequest extends VoyaModal {
    private String lineOfBusiness;
    private String systemIdentifier;
    private String function;
    private String correlationId;
//    private AccountValidationParameters accountValidationParameters;

    public AccountValidationRequest() {
    }

    public AccountValidationRequest(String lineOfBusiness, String systemIdentifier, String function, String correlationId) {
        this.lineOfBusiness = lineOfBusiness;
        this.systemIdentifier = systemIdentifier;
        this.function = function;
        this.correlationId = correlationId;
//        this.accountValidationParameters = accountValidationParameters;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getSystemIdentifier() {
        return systemIdentifier;
    }

    public void setSystemIdentifier(String systemIdentifier) {
        this.systemIdentifier = systemIdentifier;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

//    public AccountValidationParameters getAccountValidationParameters() {
//        return accountValidationParameters;
//    }
//
//    public void setAccountValidationParameters(AccountValidationParameters accountValidationParameters) {
//        this.accountValidationParameters = accountValidationParameters;
//    }
}
