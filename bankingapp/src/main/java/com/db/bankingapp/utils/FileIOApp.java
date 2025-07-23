package com.db.bankingapp.utils;

import com.db.bankingapp.dao.FileHandler;
import com.db.bankingapp.dao.FileHandlerImpl;

import java.io.IOException;

public class FileIOApp {
    public static void main(String[] args) throws IOException {

        FileHandler fileHandler=new FileHandlerImpl();
       System.out.println( fileHandler.createFile("logs","test.log"));
    }
}
