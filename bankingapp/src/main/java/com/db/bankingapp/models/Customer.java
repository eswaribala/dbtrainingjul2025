package com.db.bankingapp.models;

import com.db.bankingapp.utils.Gender;
import lombok.Data;
import lombok.Getter;

@Data
public class Customer {
    private long accountNo;
    private FullName  fullName;
    private String email;
    private String password;
    private long contactNo;

    private Gender gender;

    private Address address;




}
