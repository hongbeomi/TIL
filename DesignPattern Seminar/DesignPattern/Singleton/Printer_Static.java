package com.DesignPattern.Singleton;

public class Printer_Static {
    private static int counter = 0;
    public synchronized static void print(final String str){
        counter++;
        System.out.println(str+counter);
    }
}



