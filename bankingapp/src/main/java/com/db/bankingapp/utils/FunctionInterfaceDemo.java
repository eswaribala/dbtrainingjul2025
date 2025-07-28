package com.db.bankingapp.utils;

import com.db.bankingapp.facades.OTPGenerator;

import java.util.Random;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
       /*
        OTPGenerator otpGenerator=new OTPGenerator() {
            @Override
            public int getOTP() {
                return new Random().nextInt(1000,9999);
            }
        };
        */

        //Lambda expression
        OTPGenerator otpGenerator=()->new Random().nextInt(1000,9999);


        System.out.println(otpGenerator.getOTP());

    }
}
