package com.db.bankingapp.models;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
@Data
@ToString(callSuper = true)
public class Individual extends Customer{

    private Gender gender;
    private LocalDate birthDate;
}
