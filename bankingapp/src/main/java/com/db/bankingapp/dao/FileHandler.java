package com.db.bankingapp.dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public interface FileHandler {
    boolean createFile(String dir, String fileName) throws IOException;
    boolean writeMessage(File file, String msg) throws IOException;

}
