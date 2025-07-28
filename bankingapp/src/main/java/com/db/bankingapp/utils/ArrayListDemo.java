package com.db.bankingapp.utils;

import com.db.bankingapp.models.Customer;
import com.db.bankingapp.models.Individual;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        //heterogeneous
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2.0f);
        arrayList.add(3.0);
        arrayList.add(true);
        arrayList.add("active");
        arrayList.add(new Individual());

        //retrieve data from array list
       Iterator itr= arrayList.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }

    }
}
