package com.DesignPattern.TemplateMethod;


public class HyundaiMotor extends Motor{

    public HyundaiMotor(final Door door){
        super(door);
    }

    protected void moveMotor(final TextInputControlSkin.Direction direction){
        if (direction == TextInputControlSkin.Direction.UP)
            System.out.println("현대모터를 사용하여 올라갑니다.");

        else
            System.out.println("현대모터를 사용하여 내려갑니다.");
    }

}
