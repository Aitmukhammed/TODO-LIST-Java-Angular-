package com.company.test.exception;

public class ListNotFoundException extends RuntimeException {
    public ListNotFoundException(String message) {
        super(message);
    }
}
