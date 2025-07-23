package com.db.bankingapp.models;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
@Data
@ToString(callSuper = true)
public class Individual extends Customer{

    private Gender gender;
    private LocalDate birthDate;


    @Override
    public double investmentIR() {
        return  new Faker().number().randomDouble(2,5,8);
    }
}
