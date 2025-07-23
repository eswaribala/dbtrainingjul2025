package com.db.bankingapp.dao;

import java.io.File;
import java.io.IOException;

public class FileHandlerImpl implements FileHandler {
    @Override
    public boolean createFile(String dir, String fileName) throws IOException {
        File file = new File(dir);
        boolean status=false;
        if (!file.exists()) {
            file.mkdir();
        }else{
            file=new  File(dir,fileName);
            if(!file.exists()){
                file.createNewFile();
                status=true;
            }
        }

        return status;
    }
}
