package com.db.bankingapp.utils;

import com.db.bankingapp.dao.AddressDao;
import com.db.bankingapp.dao.AddressDaoImpl;
import com.db.bankingapp.models.Address;
import com.github.javafaker.Faker;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {
        AddressDao addressDao = new AddressDaoImpl();
        Faker faker = new Faker();
        Address address = null;
        for(int i = 0; i < 10; i++){
            address = new Address();
            address.setDoorNo(faker.address().buildingNumber());
            address.setStreetName(faker.address().streetAddress());
            address.setCity(faker.address().city());
            address.setState(faker.address().state());
            addressDao.addAddress(faker.number().numberBetween(100000,1000000),address);
        }

        //retrieve all the addresses and print
      Iterator<Map.Entry<Long,Address>> iterator= addressDao.getAllAddress().entrySet().iterator();
       while(iterator.hasNext()){
           Map.Entry<Long,Address> entry= iterator.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
       }

       //retrieve address for the given key
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter account no: ");
       long  accountNo = scanner.nextLong();
       scanner.nextLine();
       scanner.close();
       System.out.println(addressDao.getAddress(accountNo));


    }
}
