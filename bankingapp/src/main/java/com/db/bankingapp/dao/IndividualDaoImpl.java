package com.db.bankingapp.dao;

import com.db.bankingapp.helpers.MySQLHelper;
import com.db.bankingapp.models.Individual;

import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class IndividualDaoImpl implements IndividualDao {

    private Connection connection;
    private PreparedStatement preparedStatement;

    private ResultSet resultSet;
    private ResourceBundle resourceBundle;

    public IndividualDaoImpl() throws SQLException, ClassNotFoundException {
        this.connection = MySQLHelper.getConnection();
        if(this.connection != null){
            System.out.println("Connection Successful");
        }else {
            System.out.println("Connection Failed");
        }
    }

    @Override
    public boolean insertIndividual(Individual individual) throws SQLException {

        resourceBundle = ResourceBundle.getBundle("db");
        String query=resourceBundle.getString("addIndividual");
        preparedStatement=this.connection.prepareStatement(query);
        preparedStatement.setLong(1,individual.getAccountNo());
        preparedStatement.setString(2,individual.getFullName().getFirstName());
        preparedStatement.setString(3,individual.getFullName().getLastName());
        preparedStatement.setString(4,individual.getFullName().getMiddleName());
        preparedStatement.setString(5,individual.getEmail());
        preparedStatement.setLong(6,individual.getContactNo());
        preparedStatement.setString(7,individual.getPassword());
        preparedStatement.setString(8,individual.getGender().toString());
        preparedStatement.setDate(9, Date.valueOf(individual.getBirthDate()));
        int rows=preparedStatement.executeUpdate();
        return rows > 0;

    }
}
