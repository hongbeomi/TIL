package com.DesignPattern.FactoryMethod;

import javafx.scene.control.skin.TextInputControlSkin;

public class Client {

    public static void main(String[] args) {
        ElevatorManager emWithThroughputScheduler = new ElevatorManagerWithResponseTimeScheduling(2);
        emWithThroughputScheduler.requestElevator(10, TextInputControlSkin.Direction.UP);

        ElevatorManager emWithResponseTimeScheduler = new ElevatorManagerWithThroughputScheduling(2);
        emWithResponseTimeScheduler.requestElevator(10, TextInputControlSkin.Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManagerWithDynamicScheduling(2);
        emWithDynamicScheduler.requestElevator(10, TextInputControlSkin.Direction.UP);
    }

}
