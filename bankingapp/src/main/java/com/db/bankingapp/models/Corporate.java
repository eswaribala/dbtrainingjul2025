package com.db.bankingapp.models;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class Corporate extends Customer {

    private CompanyType companyType;

    @Override
    public double investmentIR() {
        return  new Faker().number().randomDouble(2,2,4);
    }
}
