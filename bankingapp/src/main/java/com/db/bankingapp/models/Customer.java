package com.db.bankingapp.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Customer {
    @Getter
    protected long accountNo;
    @Getter
    @Setter
    protected FullName  fullName;
    @Getter
    @Setter
    protected String email;
    @Getter
    @Setter
    protected String password;
    @Getter
    @Setter
    protected long contactNo;
    @Getter
    @Setter
    protected Address address;

    public Customer(long accountNo) {
        this.accountNo = accountNo;
    }

    public Customer() {
    }
}
