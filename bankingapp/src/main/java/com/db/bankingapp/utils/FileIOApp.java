package com.db.bankingapp.utils;

import com.db.bankingapp.dao.FileHandler;
import com.db.bankingapp.dao.FileHandlerImpl;
import com.github.javafaker.Faker;

import java.io.IOException;

public class FileIOApp {
    public static void main(String[] args) throws IOException {

        FileHandler fileHandler=new FileHandlerImpl();
        String fileName="test"+new Faker().number().numberBetween(1,10000)+".log";
       System.out.println( fileHandler.createFile("logs",fileName));
    }
}
