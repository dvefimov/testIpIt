package com.springapp.exceptionPac;

/**
 * Created with IntelliJ IDEA.
 * User: техно сити
 * Date: 13.11.14
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 */
public class LoginError extends Exception {
    public LoginError() {
    }

    public LoginError(String message) {
        super(message);
    }

    public LoginError(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginError(Throwable cause) {
        super(cause);
    }

    public LoginError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
