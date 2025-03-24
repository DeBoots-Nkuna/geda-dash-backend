package com.boots.geda_dash_backend.exceptions;

public class IndicatorErrorResponse {

    private int status;
    private String message;

    public IndicatorErrorResponse(int status, String message) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
