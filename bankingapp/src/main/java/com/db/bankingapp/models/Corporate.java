package com.db.bankingapp.models;

import lombok.Data;

@Data
public class Corporate extends Customer {

    private CompanyType companyType;
}
