package com.example.shop.exception;

public class ClientNotFoundException extends Exception {
    private long clientId;
    public ClientNotFoundException(long clientId) {
        super(String.format("Client is not found with id : '%s'", clientId));
    }
}
