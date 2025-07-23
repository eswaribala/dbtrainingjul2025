package com.db.bankingapp.models;

import com.db.bankingapp.exceptions.FirstNameException;
import lombok.Data;
import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class FullName {
    @Getter
    private String firstName;
    private String lastName;
    private String middleName;
    //if first name not in alphabets


    public void setFirstName(String firstName) {
        String namePattern="[a-zA-Z]+";
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher=pattern.matcher(firstName);
        if(matcher.find()){
            this.firstName = firstName;
        }else
            throw new FirstNameException("First Name not in alphabets");


    }
}
