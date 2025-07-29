package com.db.bankingapi.models;

import lombok.Data;
import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class FullName {

    private String firstName;
    private String lastName;
    private String middleName;
    //if first name not in alphabets

}
