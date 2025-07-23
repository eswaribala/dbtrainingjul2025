package com.db.bankingapp.utils;

public class AnimationThread implements Runnable {
    private String name;
    public AnimationThread(String name){
        this.name=name;
    }
    public synchronized void run(){
       for(char ch : name.toCharArray()){
           System.out.print(ch+"\t\t");
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }

    }
}
