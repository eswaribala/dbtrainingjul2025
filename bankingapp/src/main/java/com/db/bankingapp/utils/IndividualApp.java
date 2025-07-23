package com.db.bankingapp.utils;

import com.db.bankingapp.models.Address;
import com.db.bankingapp.models.FullName;
import com.db.bankingapp.models.Gender;
import com.db.bankingapp.models.Individual;
import com.github.javafaker.Faker;

import java.time.ZoneId;
import java.util.Random;

public class IndividualApp {
    public static void main(String[] args) {
        Faker faker = new Faker();
        //subclass object
        Individual individual=new Individual();
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
        individual.setAccountNo(faker.number().numberBetween(10000,1000000));
        individual.setFullName(fullName);
        individual.setEmail(faker.internet().emailAddress());
        individual.setContactNo(faker.number().numberBetween(9999990000L,9999999999L));
        individual.setPassword(faker.internet().password());
        individual.setAddress(address);
        individual.setGender(getRandomGender());
        individual.setBirthDate(faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        System.out.println(individual);

    }
    public static Gender getRandomGender(){
        Random random=new Random();
        Gender[] values=Gender.values();
        return values[random.nextInt(values.length)];
    }
}
