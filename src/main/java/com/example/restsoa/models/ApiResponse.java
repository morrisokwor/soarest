package com.example.restsoa.models;

/**
 * @author Morris.Okworo on 20/03/2023
 */

public class ApiResponse {

    private int responseCode;
    private Object payload;

    public ApiResponse() {
    }

    public ApiResponse(int responseCode, Object payload) {
        this.responseCode = responseCode;
        this.payload = payload;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
