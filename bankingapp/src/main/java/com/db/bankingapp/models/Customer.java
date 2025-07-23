package com.db.bankingapp.models;

import com.db.bankingapp.exceptions.ContactNoException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.regex.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor

//abstract class instantiation not possible but it can be inherited
public abstract class Customer {
    public static String IFSCCODE="IDBI00080";
    protected long accountNo;
    protected FullName  fullName;
    protected String email;
    protected String password;
    protected long contactNo;

    public void setContactNo(long contactNo) throws ContactNoException {
        String contactNoPattern="^\\d{10}$";

        if(Pattern.matches(contactNoPattern, String.valueOf(contactNo))){
            this.contactNo = contactNo;
        }else
            throw new ContactNoException("Contact Number should be in 10 digits");

    }

    protected Address address;

    public Customer(long accountNo) {
        this.accountNo = accountNo;
    }

    //code implementation happens in sub class level
    public abstract double investmentIR();
}
