package com.DesignPattern.TemplateMethod;

import javafx.scene.control.skin.TextInputControlSkin;

public class LGMotor extends Motor {

    public LGMotor(final Door door) {
        super(door);
    }

    protected void moveMotor(final TextInputControlSkin.Direction direction) {
        if (direction == TextInputControlSkin.Direction.UP)
            System.out.println("LG���͸� ����Ͽ� �ö󰩴ϴ�.");

        else
            System.out.println("LG���͸� ����Ͽ� �������ϴ�.");
    }

}
