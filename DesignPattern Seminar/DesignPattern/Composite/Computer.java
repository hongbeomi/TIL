package com.DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    //복수 개의 ComputerDevice 객체를 가리킴
    private List<ComputerDevice> components = new ArrayList<>();

    //ComputerDevice 객체를 Computer 클래스에 추가함.
    public void addComponent(final ComputerDevice component){
        components.add(component);
    }

    //ComputerDevice 객체를 Computer 클래스에서 제거함.
    public void removeComponent(final ComputerDevice component){
        components.remove(component);
    }

    public int getPrice(){
        int price = 0;
        for (ComputerDevice component: components)
            price += component.getPrice();
        return price;
    }

    public int getPower(){
        int power = 0;
        for(ComputerDevice component: components)
            power += component.getPower();
        return power;
    }

}
