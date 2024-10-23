package com.example.uberbackendspringboot.exceptions;

import lombok.Data;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
