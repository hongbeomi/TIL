package com.DesignPattern.State;

public class ON implements State{
    private static ON on = new ON();
    private ON(){}

    public static ON getInstance(){
        return on;
    }

    public void on_button_pushed(final Light light){
        System.out.println("반응 없음");
    }

    public void off_button_pushed(final Light light){
        light.setState(OFF.getInstance());
        System.out.println("Light Off!");
    }
}
