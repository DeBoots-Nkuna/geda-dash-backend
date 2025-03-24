package com.boots.geda_dash_backend.exceptions;

public class IndicatorNotFoundException extends RuntimeException {

    public IndicatorNotFoundException(String message) {
        super(message);
    }

    public IndicatorNotFoundException() {
        super("Indicator not found");
    }

    public IndicatorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
