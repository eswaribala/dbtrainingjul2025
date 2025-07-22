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
        //literals
        int memoryAddress=0xFD;
        System.out.println("Memory Address: "+memoryAddress);
        int portNumber=015;
        System.out.println("Port Number: "+portNumber);
        float balance=100.00f;
    }
}
