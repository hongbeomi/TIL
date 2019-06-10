package com.DesignPattern.Composite;

public class Monitor extends ComputerDevice {

    private int price;
    private int power;

    public Monitor(final int power,final int price){
        this.power = power;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public int getPower(){
        return power;
    }

}
