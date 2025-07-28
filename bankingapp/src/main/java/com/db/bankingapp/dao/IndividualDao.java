package com.db.bankingapp.dao;

import com.db.bankingapp.models.Individual;

import java.sql.SQLException;

public interface IndividualDao {

    boolean insertIndividual(Individual individual) throws SQLException;
}
