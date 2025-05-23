package com.aidd.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }
}