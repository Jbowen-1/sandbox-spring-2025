package org.example.sandbox.exception;

public class DivideByZeroException extends Exception{

    public DivideByZeroException(String message) {
        super(message);
    }

    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByZeroException(Throwable cause) {
        super(cause);
    }

    public DivideByZeroException() {
    }
}
