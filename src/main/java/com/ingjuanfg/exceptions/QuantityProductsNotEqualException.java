package com.ingjuanfg.exceptions;

public class QuantityProductsNotEqualException extends AssertionError{
    public static final String CANTIDAD_NO_CORRRESPONDE_EXCEPTION_MESSAGE = "La cantidad de prod no es igual";

    public QuantityProductsNotEqualException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
