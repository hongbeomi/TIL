package com.DesignPattern.TemplateMethod;


public class HyundaiMotor extends Motor{

    public HyundaiMotor(final Door door){
        super(door);
    }

    protected void moveMotor(final TextInputControlSkin.Direction direction){
        if (direction == TextInputControlSkin.Direction.UP)
            System.out.println("������͸� ����Ͽ� �ö󰩴ϴ�.");

        else
            System.out.println("������͸� ����Ͽ� �������ϴ�.");
    }

}
