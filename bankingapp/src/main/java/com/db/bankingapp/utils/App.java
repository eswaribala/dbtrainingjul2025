package com.db.bankingapp.utils;

import com.db.bankingapp.models.Corporate;
import com.db.bankingapp.models.Customer;
import com.db.bankingapp.models.Individual;
import com.github.javafaker.Faker;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try {
            try{

                int[] array=new int[args.length-1];
                System.out.println(array[0]);


            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());

            }


            System.out.println(10/args.length);


            System.out.println(args[0]);
            System.out.println(args[3]);

        }catch(NegativeArraySizeException|ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

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
        int decimalNumber=5;
        int reminderNumber=0;
        StringBuilder binary=new StringBuilder("");
        //decimal to binary conversion
        while(decimalNumber>0){
            reminderNumber=decimalNumber%2;
            binary.append(reminderNumber);
            decimalNumber=decimalNumber/2;
        }

        System.out.println("Binary: "+binary.reverse().toString());
        //Customer customer=new Customer();


    }
}
