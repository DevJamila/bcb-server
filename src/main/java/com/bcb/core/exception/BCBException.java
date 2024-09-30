package com.bcb.core.exception;

import org.springframework.http.HttpStatus;

public class BCBException extends RuntimeException {

    private HttpStatus status;

    public BCBException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public BCBException(String message, HttpStatus status, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
