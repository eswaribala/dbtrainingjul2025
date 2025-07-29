package com.db.bankingapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor

//abstract class instantiation not possible but it can be inherited
public class Customer {
    public static String IFSCCODE="IDBI00080";
    protected long accountNo;
    protected FullName  fullName;
    protected String email;
    protected String password;
    protected long contactNo;



    protected Address address;

    public Customer(long accountNo) {
        this.accountNo = accountNo;
    }


}
