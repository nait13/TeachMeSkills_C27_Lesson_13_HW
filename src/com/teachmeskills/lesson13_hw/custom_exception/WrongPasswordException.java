package com.teachmeskills.lesson13_hw.custom_exception;

/**
 * This class "WrongPasswordException" is a custom exception class for password validation
 */
public class WrongPasswordException extends Exception{
    private int validationErrorCode;

    public WrongPasswordException(String message, int validationErrorCode) {
        super(message);
        this.validationErrorCode = validationErrorCode;
    }

    public WrongPasswordException(int validationErrorCode) {
        this.validationErrorCode = validationErrorCode;
    }
}
