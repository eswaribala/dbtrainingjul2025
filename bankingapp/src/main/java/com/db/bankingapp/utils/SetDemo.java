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
        //add elements to dotnet trainees
        for(int i=0;i<5;i++){
            dotnetTrainees.add(faker.name().firstName());
        }

        //print java trainees
        System.out.println("javaTrainees:"+javaTrainees);
        System.out.println("dotnetTrainees:"+dotnetTrainees);
    }
}
