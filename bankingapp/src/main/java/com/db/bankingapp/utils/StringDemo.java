package com.db.bankingapp.utils;

public class StringDemo {
    public static void main(String[] args) {

        String firstName = "John";
        String lastName = new String("John");
        System.out.println(firstName==lastName);
        System.out.println(firstName.equals(lastName));
        String message="hi how are you?";
        System.out.println(message);
        //Every words first letter should be capitalized
        //proper case
        System.out.println(toProperCase(message));

    }
    public static String toProperCase(String message){

        StringBuilder sb = new StringBuilder();

        if((message==null) || (message.isEmpty())){
            return message;
        }
        else {
            String[] words = message.split(" ");
            for (String word : words) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");

            }
            return sb.toString().trim();
        }



    }
}
