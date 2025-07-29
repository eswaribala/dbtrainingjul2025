package com.db.bankingapi.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
//@Component
public class FullName {

    private String firstName;
    private String lastName;
    private String middleName;
    //if first name not in alphabets

}
