package com.db.bankingapp.utils;

import com.db.bankingapp.dao.CorporateDao;
import com.db.bankingapp.dao.CorporateDaoImpl;
import com.db.bankingapp.exceptions.ContactNoException;
import com.db.bankingapp.models.*;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class GenericArrayListDemo {
    public static void main(String[] args) throws ContactNoException {

        Faker faker = new Faker();

        CorporateDao corporateDao = new CorporateDaoImpl();
        Corporate corporate = null;
        FullName fullName = null;
        Address address = null;

        for(int i=0;i<10;i++){
            corporate = new Corporate();
            fullName = new FullName();
            fullName.setFirstName(faker.name().firstName());
            fullName.setLastName(faker.name().lastName());
            fullName.setMiddleName(null);
            address = new Address();
            address.setDoorNo(faker.address().buildingNumber());
            address.setStreetName(faker.address().streetAddress());
            address.setCity(faker.address().city());
            address.setState(faker.address().state());
            corporate.setAccountNo(faker.number().numberBetween(100000,10000000));
            corporate.setFullName(fullName);
            corporate.setEmail(faker.internet().emailAddress());
            corporate.setPassword(faker.internet().password());
            corporate.setAddress(address);
            corporate.setContactNo(faker.number().numberBetween(9999999900L,9999999999L));
            corporate.setCompanyType(getRandomCompanyType());
            corporateDao.addCorporate(corporate);

        }

        //retrieve 10 company details
        System.out.println("Corporate Details Unsorted");
        List<Corporate> corporateList = corporateDao.getAllCorporates();
        for(Corporate corporate1 : corporateList){
            System.out.println(corporate1);
        }

        //sort

        corporateList.sort(new  CorporateSorter());

        //retrieve 10 company details
        System.out.println("Corporate Details sorted");
        for(Corporate corporate1 : corporateList){
            System.out.println(corporate1);
        }


    }

    public static CompanyType getRandomCompanyType(){
        CompanyType[] values= CompanyType.values();
        return  values[(int)(new Random().nextInt(values.length))];
    }
}
