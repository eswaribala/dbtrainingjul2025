package com.db.bankingapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

//abstract class instantiation not possible but it can be inherited
public abstract class Customer {
    protected long accountNo;
    protected FullName  fullName;
    protected String email;
    protected String password;
    protected long contactNo;
    protected Address address;

    public Customer(long accountNo) {
        this.accountNo = accountNo;
    }

    //code implementation happens in sub class level
    public abstract double investmentIR();
}
