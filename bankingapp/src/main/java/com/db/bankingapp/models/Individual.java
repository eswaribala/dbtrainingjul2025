package com.db.bankingapp.models;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Individual extends Customer{

    private Gender gender;
    private LocalDate birthDate;
}
