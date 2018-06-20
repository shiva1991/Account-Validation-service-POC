package com.voya.web.model;

public class AccountValidationResponse extends VoyaModal {
    private String decision;
    private RawResponse rawResponse;

    public AccountValidationResponse() {
    }

    public AccountValidationResponse(String decision, RawResponse rawResponse) {
        this.decision = decision;
        this.rawResponse = rawResponse;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public RawResponse getRawResponse() {
        return rawResponse;
    }

    public void setRawResponse(RawResponse rawResponse) {
        this.rawResponse = rawResponse;
    }
}
