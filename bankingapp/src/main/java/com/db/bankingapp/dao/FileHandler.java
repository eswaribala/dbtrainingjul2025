package com.db.bankingapp.dao;

import java.io.IOException;

public interface FileHandler {
    boolean createFile(String dir, String fileName) throws IOException;

}
