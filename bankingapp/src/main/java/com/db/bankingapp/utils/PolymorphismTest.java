package com.db.bankingapp.utils;

import com.db.bankingapp.models.Address;
import com.db.bankingapp.models.Customer;
import com.db.bankingapp.models.FullName;
import com.db.bankingapp.models.Individual;
import com.github.javafaker.Faker;

public class PolymorphismTest {
    public static void main(String[] args) {
        Faker faker = new Faker();

        //assigining individual object to customer
        Customer customer=new Individual();
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


        //customer.setAccountNo(faker.number().numberBetween(10000,1000000));
        customer.setFullName(fullName);

        customer.setEmail(faker.internet().emailAddress());
       // customer.setContactNo(faker.number().numberBetween(9999990000L,9999999999L));
        customer.setPassword(faker.internet().password());
        customer.setAddress(address);
        //downcasting super class object to sub class
        //not permitted
        //class cast exception
      //  Individual individual=new Customer();

    }
}
