package com.db.bankingapp.dao;

import com.db.bankingapp.exceptions.ContactNoException;
import com.db.bankingapp.helpers.MySQLHelper;
import com.db.bankingapp.models.FullName;
import com.db.bankingapp.models.Gender;
import com.db.bankingapp.models.Individual;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class IndividualDaoImpl implements IndividualDao {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;

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

    @Override
    public List<Individual> getAllIndividuals() throws SQLException, ContactNoException {

        resourceBundle = ResourceBundle.getBundle("db");
        String query=resourceBundle.getString("allIndividuals");
        statement=this.connection.createStatement();
        resultSet=statement.executeQuery(query);
        List<Individual> individuals=new ArrayList<>();
        Individual individual=null;
        FullName fullName=null;
        while(resultSet.next()){
            individual=new Individual();
            fullName=new FullName();
            fullName.setFirstName(resultSet.getString("first_name"));
            fullName.setLastName(resultSet.getString("last_name"));
            fullName.setMiddleName(resultSet.getString("middle_name"));
            individual.setAccountNo(resultSet.getLong("account_no"));
            individual.setFullName(fullName);
            individual.setEmail(resultSet.getString("email"));
            individual.setPassword(resultSet.getString("password"));
            individual.setContactNo(resultSet.getLong("contact_no"));
            individual.setGender(Gender.valueOf(resultSet.getString("gender")));
            individual.setBirthDate(LocalDate.parse(resultSet.getString("birth_date")));
            individuals.add(individual);
        }
        return individuals;
    }
}
