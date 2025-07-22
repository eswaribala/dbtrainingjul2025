package com.db.bankingapp.utils;

import com.github.javafaker.Faker;

public class App {
    public static void main(String[] args) {
        System.out.println("Rocking with java");
        Faker faker= new Faker();
        long accountNo=faker.number().numberBetween(100000,1000000);
        String name=faker.name().fullName();
        String address=faker.address().fullAddress();
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Account No: "+accountNo);
    }
}
