package com.fda.exception;

public class DeliveryAgentNotFoundException extends RuntimeException {
    public DeliveryAgentNotFoundException(String message) {
        super(message);
    }
}