package com.db.bankingapp.utils;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import com.github.javafaker.Faker;

public class DateTimeDemo {
    public static void main(String[] args) {
        Set<String> zoneIds=ZoneId.getAvailableZoneIds();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        for(String zoneId:zoneIds){
            System.out.println(zoneId);
            //print time all over the world
            System.out.println(ZonedDateTime.now(ZoneId.of(zoneId)).format(formatter));
        }
        LocalDate now = LocalDate.now();
        LocalDate dob=new Faker().date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println(dob);
        // find out the age

        System.out.println(ChronoUnit.YEARS.between(dob,now));


    }
}
