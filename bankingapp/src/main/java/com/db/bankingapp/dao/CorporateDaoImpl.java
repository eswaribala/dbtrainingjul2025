package com.db.bankingapp.dao;

import com.db.bankingapp.models.Corporate;

import java.util.ArrayList;
import java.util.List;

public class CorporateDaoImpl implements CorporateDao{

    private List<Corporate> corporateList;

    public CorporateDaoImpl(){
        corporateList=new ArrayList<Corporate>();
    }
    @Override
    public void addCorporate(Corporate corporate) {
        corporateList.add(corporate);
    }

    @Override
    public List<Corporate> getAllCorporates() {
        return corporateList;
    }
}
