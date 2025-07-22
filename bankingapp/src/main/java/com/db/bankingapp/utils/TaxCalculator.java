package com.db.bankingapp.utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class TaxCalculator {
    public static void main(String[] args) {
        Faker faker=new Faker();
        long income=faker.number().numberBetween(3000000,5000000);
        Gender gender=getRandomGender();
        System.out.println(gender);

    }

    public static Gender getRandomGender(){
        Gender[]  values=Gender.values();
        Random random=new Random();
        return values[random.nextInt(values.length)];

    }
}
