package com.DesignPattern.TemplateMethod;

import javafx.scene.control.skin.TextInputControlSkin;

public class Client {

    public static void main(String[] args) {
        Door door = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
        hyundaiMotor.move(TextInputControlSkin.Direction.DOWN);
    }

}
