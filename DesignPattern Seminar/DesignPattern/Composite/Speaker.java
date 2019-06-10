package com.DesignPattern.Composite;

public class Speaker extends ComputerDevice {

    private int price;
    private int power;

    public Speaker(final int power,final int price){
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
