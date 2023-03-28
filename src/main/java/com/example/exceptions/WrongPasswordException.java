package com.example.exceptions;


public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(String message, Throwable t) {
        super(message, t);
    }

    public WrongPasswordException(Throwable t) {
        super(t);
    }
}