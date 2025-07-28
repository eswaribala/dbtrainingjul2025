package com.db.bankingapp.dao;

import java.io.File;
import java.io.IOException;

public class JsonFileHandlerImpl implements FileHandler {

    @Override
    public boolean createFile(String dir, String fileName) throws IOException {
        return false;
    }

    @Override
    public boolean writeMessage(File file, String msg) throws IOException {
        return false;
    }

    @Override
    public void readMessage(File file) throws IOException {

    }
}
