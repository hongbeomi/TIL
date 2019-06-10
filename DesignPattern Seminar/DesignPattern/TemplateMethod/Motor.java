package com.DesignPattern.TemplateMethod;

import javafx.scene.control.skin.TextInputControlSkin;

public abstract class Motor {

    private Door door;
    private MotorStatus  motorStatus;

    public Motor(final Door door){
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(final MotorStatus  motorStatus){
        this.motorStatus = motorStatus;
    }

    public void move(final TextInputControlSkin.Direction direction){
        MotorStatus motorStatus = getMotorStatus();
        if(motorStatus == MotorStatus.MOVING)
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if(doorStatus == DoorStatus.OPENED)
            door.close();

        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(final TextInputControlSkin.Direction direction);

}
