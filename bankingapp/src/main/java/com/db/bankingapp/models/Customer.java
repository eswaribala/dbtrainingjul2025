package com.db.bankingapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
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
