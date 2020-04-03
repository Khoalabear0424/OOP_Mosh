package com.khoaproject.exceptions;

//Checked -> Exception
//Unchecked (runtime) -> RunTimeException
public class InsufficientFundsException extends Exception{

    public InsufficientFundsException() {
        super("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
