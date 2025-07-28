package com.db.bankingapp.utils;

import com.db.bankingapp.dao.IndividualDao;
import com.db.bankingapp.dao.IndividualDaoImpl;
import com.db.bankingapp.exceptions.ContactNoException;
import com.db.bankingapp.exceptions.FirstNameException;
import com.db.bankingapp.models.Address;
import com.db.bankingapp.models.FullName;
import com.db.bankingapp.models.Gender;
import com.db.bankingapp.models.Individual;
import com.github.javafaker.Faker;

import java.sql.SQLException;
import java.time.ZoneId;
import java.util.Random;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        IndividualDao individualDao = new IndividualDaoImpl();
        Faker faker = new Faker();
        Individual individual=null;
        for (int i = 0; i < 5; i++) {
            //subclass object
           individual = new Individual();
            //creating full name object
            FullName fullName=new FullName();
            try {
                fullName.setFirstName(faker.name().firstName());
            }
            catch(FirstNameException e){
                System.out.println(e.getMessage());

            }
            fullName.setLastName(faker.name().lastName());
            fullName.setMiddleName("");

            //creating address object
            Address address=new Address();
            address.setStreetName(faker.address().streetName());
            address.setDoorNo(faker.number().digits(10));
            address.setCity(faker.address().city());
            address.setState(faker.address().state());
            individual.setAccountNo(faker.number().numberBetween(10000,100000));
            individual.setFullName(fullName);
            individual.setEmail(faker.internet().emailAddress());
            try {
                individual.setContactNo(faker.number().numberBetween(9999999900L, 9999999999L));
            }catch (ContactNoException e){
                System.out.println(e.getMessage());
            }
            individual.setPassword(faker.internet().password().substring(1,8));
            individual.setAddress(address);
            individual.setGender(getRandomGender());
            individual.setBirthDate(faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            individualDao.insertIndividual(individual);

        }

    }
    public static Gender getRandomGender(){
        Random random=new Random();
        Gender[] values=Gender.values();
        return values[random.nextInt(values.length)];
    }
}
