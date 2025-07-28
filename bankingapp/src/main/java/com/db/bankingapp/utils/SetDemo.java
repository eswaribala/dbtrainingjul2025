package com.db.bankingapp.utils;

import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> javaTrainees=new HashSet<String>();
        Set<String> dotnetTrainees=new HashSet<String>();
        //add elements to java trainees
        Faker faker=new Faker();
        for(int i=0;i<5;i++){
            javaTrainees.add(faker.name().firstName());
        }
        javaTrainees.add("parameswari");
        javaTrainees.add("vignesh");
        //add elements to dotnet trainees
        for(int i=0;i<5;i++){
            dotnetTrainees.add(faker.name().firstName());
        }
        dotnetTrainees.add("parameswari");
        //print java trainees
        System.out.println("javaTrainees:"+javaTrainees);
        System.out.println("dotnetTrainees:"+dotnetTrainees);
        //intersection
       // javaTrainees.retainAll(dotnetTrainees);
       // System.out.println("Intersection:"+javaTrainees);
       // union
       // javaTrainees.addAll(dotnetTrainees);
       // System.out.println("Union:"+javaTrainees);

        //difference
        javaTrainees.removeAll(dotnetTrainees);
        System.out.println("Minus:"+javaTrainees);


    }
}
