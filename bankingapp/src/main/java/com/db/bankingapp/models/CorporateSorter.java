package com.db.bankingapp.models;

import java.util.Comparator;

public class CorporateSorter implements Comparator<Corporate> {
    @Override
    public int compare(Corporate o1, Corporate o2) {
        return Long.compare(o1.accountNo, o2.accountNo);
    }
}
