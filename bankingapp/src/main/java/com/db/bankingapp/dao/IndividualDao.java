package com.db.bankingapp.dao;

import com.db.bankingapp.exceptions.ContactNoException;
import com.db.bankingapp.models.Individual;

import java.sql.SQLException;
import java.util.List;

public interface IndividualDao {

    boolean insertIndividual(Individual individual) throws SQLException;
    List<Individual> getAllIndividuals() throws SQLException, ContactNoException;
}
