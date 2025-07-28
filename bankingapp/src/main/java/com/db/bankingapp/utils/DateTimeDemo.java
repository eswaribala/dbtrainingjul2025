package com.db.bankingapp.utils;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTimeDemo {
    public static void main(String[] args) {
        Set<String> zoneIds=ZoneId.getAvailableZoneIds();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        for(String zoneId:zoneIds){
            System.out.println(zoneId);
            //print time all over the world
            System.out.println(ZonedDateTime.now(ZoneId.of(zoneId)).format(formatter));
        }
    }
}
