package com.db.bankingapp.dao;

import com.db.bankingapp.helpers.MySQLHelper;
import com.db.bankingapp.models.Individual;

import java.sql.Connection;
import java.sql.SQLException;

public class IndividualDaoImpl implements IndividualDao {

    private Connection connection;

    public IndividualDaoImpl() throws SQLException, ClassNotFoundException {
        this.connection = MySQLHelper.getConnection();
        if(this.connection != null){
            System.out.println("Connection Successful");
        }else {
            System.out.println("Connection Failed");
        }
    }

    @Override
    public boolean insertIndividual(Individual individual) {
        return false;
    }
}
