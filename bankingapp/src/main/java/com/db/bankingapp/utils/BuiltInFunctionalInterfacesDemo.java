package com.db.bankingapp.utils;

import com.db.bankingapp.dao.AddressDao;
import com.db.bankingapp.dao.AddressDaoImpl;
import com.db.bankingapp.models.Address;
import com.github.javafaker.Faker;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BuiltInFunctionalInterfacesDemo {
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

        System.out.println(addressDao.getAllAddress().keySet());

        //retrieve address for the given key
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account no: ");
        long  accountNo = scanner.nextLong();
        scanner.nextLine();
        scanner.close();

        //Function

        Function<Long, Address> function=(actNo)->addressDao.getAddress(accountNo);

        Address addr= function.apply(accountNo);
        System.out.println(addr);

        //BiFunction

        BiFunction<Address, Address,Boolean> addressComparison=(a1,a2)->
                a1.getCity().equals(a2.getCity())&&a1.getState().equals(a2.getState());

       System.out.println(addressComparison.apply(addr,addr));



    }
}
