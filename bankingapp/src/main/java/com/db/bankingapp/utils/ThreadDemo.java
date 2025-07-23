package com.db.bankingapp.utils;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        AnimationThread[] animationThread=new AnimationThread[5];
        Thread thread=null;
        for(int i=0;i<5;i++){
            animationThread[i]=new AnimationThread("Thread"+i);
            thread=new Thread(animationThread[i]);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
