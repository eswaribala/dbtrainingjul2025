package com.db.bankingapp.exceptions;

//unchecked exception
public class FirstNameException extends RuntimeException {
    public FirstNameException(String message){
        super(message);
    }
}
