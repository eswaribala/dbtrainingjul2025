package com.db.bankinapp.tests;

import com.db.bankingapp.models.Individual;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IndividualTest {

    private static Individual individual;

    @BeforeAll
    public static void createInstance(){
        individual=new Individual();
    }

    @Test
    public void individualInstanceNotNullTest(){
        assertNotNull(individual);
    }
}
