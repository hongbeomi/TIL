package com.DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    //���� ���� ComputerDevice ��ü�� ����Ŵ
    private List<ComputerDevice> components = new ArrayList<>();

    //ComputerDevice ��ü�� Computer Ŭ������ �߰���.
    public void addComponent(final ComputerDevice component){
        components.add(component);
    }

    //ComputerDevice ��ü�� Computer Ŭ�������� ������.
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
