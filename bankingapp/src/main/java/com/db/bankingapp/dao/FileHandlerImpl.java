package com.db.bankingapp.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerImpl implements FileHandler {
    @Override
    public boolean createFile(String dir, String fileName) throws IOException {
        File file = new File(dir);
        boolean status=false;
        if (!file.exists()) {
            file.mkdir();
        }

        file=new  File(dir,fileName);
            if(!file.exists()){
                file.createNewFile();
                status=true;
            }


        return status;
    }

    @Override
    public boolean writeMessage(File file, String msg) throws IOException {
        boolean status=false;
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(msg);
        bw.close();
        status=true;

        return status;
    }
}
