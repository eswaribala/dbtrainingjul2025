package com.db.bankingapp.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MySQLHelper {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        ResourceBundle rb = ResourceBundle.getBundle("db");
        String driver = rb.getString("driverClassName");
        String url = rb.getString("url");
        String username = rb.getString("userName");
        String password = rb.getString("password");
        Class.forName(driver);
        return  DriverManager.getConnection(url,username,password);
    }
}
