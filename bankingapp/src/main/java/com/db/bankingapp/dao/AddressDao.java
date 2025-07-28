package com.db.bankingapp.dao;

import com.db.bankingapp.models.Address;
import com.db.bankingapp.models.Corporate;

import java.util.Hashtable;

public interface AddressDao {

    void addAddress(long accountNo, Address address);

    Hashtable<Long,Address> getAllAddress();

    Address getAddress(long accountNo);

}
