package com.DesignPattern.State;

public class OFF implements State {
    private static OFF off = new OFF();
    OFF(){}

    public static OFF getInstance(){
        return off;
    }

    public void on_button_pushed(final Light light){
        light.setState(ON.getInstance());
        System.out.println("Light On!");
    }

    public void off_button_pushed(final Light light){
        System.out.println("반응 없음");
    }
}
