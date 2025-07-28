package com.db.bankingapp.dao;

import com.db.bankingapp.models.Corporate;

import java.util.List;

public interface CorporateDao {
    void addCorporate(Corporate corporate);
    List<Corporate> getAllCorporates();
}
