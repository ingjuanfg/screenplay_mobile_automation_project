package com.ingjuanfg.exceptions;

public class LoginIsNotCompleteException  extends AssertionError{
    public static final String LOGIN_FAIL_MESSAGE_EXCEPTION = "YOUR LOGIN WAS NOT SUCCESS";

    public LoginIsNotCompleteException(String mensaje, Throwable cause){
        super(mensaje, cause);
    }
}
