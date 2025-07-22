package com.db.bankingapp.utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class TaxCalculator {
    public static void main(String[] args) {
        Faker faker=new Faker();
        long income=faker.number().numberBetween(3000000,5000000);
        Gender gender=getRandomGender();
        System.out.println(gender);
        //income tax calculation
        //if male and income > 30L, tax 30%
        if((gender==Gender.MALE)&&(income>=3000000)){
            System.out.println("Income Tax="+(income*0.3));
        }
        //if female and income > 30L, tax 20%
        else if((gender==Gender.FEMALE)&&(income>=3000000)){
            System.out.println("Income Tax="+(income*0.2));
        }
        //if other and income > 30L, tax 0%
        else if((gender==Gender.OTHER)&&(income>=3000000)){
            System.out.println("Income Tax="+(income*0.1));
        }else
           System.out.println("No Income Tax");






    }

    public static Gender getRandomGender(){
        Gender[]  values=Gender.values();
        return values[new Random().nextInt(values.length)];

    }
}
