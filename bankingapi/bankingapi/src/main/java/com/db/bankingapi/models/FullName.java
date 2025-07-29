package com.db.bankingapi.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
//bean
@Component
@Scope("prototype")
public class FullName {

    private String firstName;
    private String lastName;
    private String middleName;
    //if first name not in alphabets

}
