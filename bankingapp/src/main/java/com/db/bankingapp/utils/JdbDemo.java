package com.db.bankingapp.utils;

import com.db.bankingapp.dao.IndividualDao;
import com.db.bankingapp.dao.IndividualDaoImpl;

import java.sql.SQLException;

public class JdbDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        IndividualDao individualDao = new IndividualDaoImpl();


    }
}
