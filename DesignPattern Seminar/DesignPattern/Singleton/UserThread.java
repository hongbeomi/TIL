package com.DesignPattern.Singleton;

public class UserThread extends Thread {
    public UserThread(final String name){
        super(name);
    }

    public void run(){
        Printer_Static.print(Thread.currentThread().getName()+"print using "+".");
    }
}