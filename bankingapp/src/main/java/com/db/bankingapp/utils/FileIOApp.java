package com.db.bankingapp.utils;

import com.db.bankingapp.dao.FileHandler;
import com.db.bankingapp.dao.FileHandlerImpl;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;

public class FileIOApp {
    public static void main(String[] args) throws IOException {

        FileHandler fileHandler=new FileHandlerImpl();
        String fileName="test"+new Faker().number().numberBetween(1,10000)+".log";
         System.out.println( fileHandler.createFile("logs",fileName));
         Faker faker=new Faker();
         for(int i=0;i<100;i++){
             fileHandler.writeMessage(new File("logs",fileName),faker.lorem().sentence());
         }


    }
}
