package com.db.bankingapi.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Corporate extends Customer {

    private CompanyType companyType;


}
