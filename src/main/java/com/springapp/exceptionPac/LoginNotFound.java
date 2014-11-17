package com.springapp.exceptionPac;

/**
 * Created with IntelliJ IDEA.
 * User: техно сити
 * Date: 13.11.14
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
public class LoginNotFound extends LoginError {
    public LoginNotFound() {
    }

    public LoginNotFound(String message) {
        super(message);
    }

    public LoginNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginNotFound(Throwable cause) {
        super(cause);
    }

    public LoginNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
