package com.db.bankingapi.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {
    private String doorNo;
    private String streetName;
    private String city;
    private String state;

}
