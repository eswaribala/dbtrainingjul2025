package com.db.bankingapp.dao;

import com.db.bankingapp.models.Address;

import java.util.Hashtable;

public class AddressDaoImpl implements AddressDao {

    private Hashtable<Long,Address> addresses;

    public AddressDaoImpl() {
        addresses = new Hashtable<>();
    }

    @Override
    public void addAddress(long accountNo, Address address) {
        addresses.put(accountNo,address);

    }

    @Override
    public Hashtable<Long, Address> getAllAddress() {
        return addresses;
    }

    @Override
    public Address getAddress(long accountNo) {
        return addresses.get(accountNo);
    }
}
