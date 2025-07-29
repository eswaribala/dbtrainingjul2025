package com.db.bankingapp.tests;

import com.db.bankingapp.exceptions.ContactNoException;
import com.db.bankingapp.exceptions.FirstNameException;
import com.db.bankingapp.models.FullName;
import com.db.bankingapp.models.Gender;
import com.db.bankingapp.models.Individual;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IndividualTest {

    private Individual individual;
    private  FullName fullName;
/*
    @BeforeAll
    public static void createInstance(){
        individual=new Individual();
        fullName=new FullName();
    }
    */
    @BeforeEach
    public void createEachInstance(){
        individual=new Individual();
        fullName=new FullName();
    }

    @Test
    @Disabled
    public void testIndividualInstanceNotNull(){
        assertNotNull(individual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "individual.csv", numLinesToSkip = 1)
    @DisplayName("Testing CSV Parameterized call")
    @Tag("parameter_group")
    public void testDOB(String accountNo,String firstName,String lastName,String middleName,String email,String contactNo,String password, String gender,String dob) {

        fullName.setFirstName(firstName);
        fullName.setLastName(lastName);
        fullName.setMiddleName(middleName);
        individual.setAccountNo(Long.parseLong(accountNo));
        individual.setFullName(fullName);
        individual.setEmail(email);
        individual.setPassword(password);
        individual.setBirthDate(LocalDate.parse(dob));
        individual.setGender(Gender.valueOf(gender));
        //individual.setContactNo(Long.parseLong(contactNo));
        assertTrue(individual.getFullName().getFirstName().length()>3);
        assertAll(
                "Grouping more than one condition",
                () ->  assertTrue(individual.getEmail().contains("@") ),
                () ->  assertTrue(individual.getPassword().length()>4)
        );

    }

    @Test
    public void testFirNameException(){


        FirstNameException firstNameException=assertThrows(FirstNameException.class,()->{
            fullName.setFirstName("58694369652");
        });
        assertEquals("First Name not in alphabets",firstNameException.getMessage());


    }

    @Test
    public void testContactNoException(){


        ContactNoException contactNoException=assertThrows(ContactNoException.class,()->{
            individual.setContactNo(9952032862345L);
        });
        assertEquals("Contact Number should be in 10 digits",contactNoException.getMessage());


    }

    @Nested
    class WhenIndividualIsNew{

        @Test
        public void testGender(){
            individual.setGender(Gender.MALE);
            assertSame(Gender.MALE, individual.getGender());
        }
        @Test
        public void testDOB(){
            individual.setBirthDate(LocalDate.of(1970,12,2));
            assertTrue(ChronoUnit.YEARS.between(individual.getBirthDate(), LocalDate.now()) >18);

        }
    }

    @AfterEach
    public void testEnds(){
        individual=null;
        fullName=null;
    }

}
