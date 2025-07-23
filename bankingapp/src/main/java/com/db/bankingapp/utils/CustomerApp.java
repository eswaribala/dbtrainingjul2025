package com.db.bankingapp.utils;

import com.db.bankingapp.models.Address;
import com.db.bankingapp.models.Customer;
import com.db.bankingapp.models.FullName;
import com.github.javafaker.Faker;

import java.util.Random;

public class CustomerApp {

    public static void main(String[] args) {
        //creating the object
        Faker faker = new Faker();
        Customer customer=new Customer();
        //creating full name object
        FullName fullName=new FullName();
        fullName.setFirstName(faker.name().firstName());
        fullName.setLastName(faker.name().lastName());
        fullName.setMiddleName("");

        //creating address object
        Address address=new Address();
        address.setStreetName(faker.address().streetName());
        address.setDoorNo(faker.number().digits(10));
        address.setCity(faker.address().city());
        address.setState(faker.address().state());


        customer.setAccountNo(faker.number().numberBetween(10000,1000000));
        customer.setFullName(fullName);
        customer.setGender(getRandomGender());
        customer.setEmail(faker.internet().emailAddress());
        customer.setContactNo(faker.number().numberBetween(9999990000L,9999999999L));
        customer.setPassword(faker.internet().password());
        customer.setAddress(address);

        System.out.println(customer);


    }

    public static Gender getRandomGender(){
        Random random=new Random();
        Gender[] values=Gender.values();
        return values[random.nextInt(values.length)];
    }

}
