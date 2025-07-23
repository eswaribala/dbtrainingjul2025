package com.db.bankingapp.dao;

import java.io.*;

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
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
        bw.write(msg);
        bw.write("\n");
        bw.write("---------------------------------------------");
        bw.write("\n");

        bw.close();
        status=true;

        return status;
    }

    @Override
    public void readMessage(File file) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
