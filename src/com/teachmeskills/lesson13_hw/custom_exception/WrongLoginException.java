package com.teachmeskills.lesson13_hw.custom_exception;

/**
 *This class "WrongLoginException" is a custom exception class for login validation
 */
public class WrongLoginException extends Exception{
    private int validationErrorCode;

    public WrongLoginException(String message, int validationErrorCode) {
        super(message);
        this.validationErrorCode = validationErrorCode;
    }

    public WrongLoginException(int validationErrorCode) {
        this.validationErrorCode = validationErrorCode;
    }
}
