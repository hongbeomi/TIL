package com.DesignPattern.FactoryMethod;

import javafx.scene.control.skin.TextInputControlSkin;

interface ElevatorScheduler {
    public int selectElevator(final ElevatorManager manager,final int destination,final TextInputControlSkin.Direction direction);
}
