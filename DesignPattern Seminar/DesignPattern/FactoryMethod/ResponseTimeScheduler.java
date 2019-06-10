package com.DesignPattern.FactoryMethod;

import javafx.scene.control.skin.TextInputControlSkin;

public class ResponseTimeScheduler implements ElevatorScheduler{

    private static ElevatorScheduler scheduler;
    private ResponseTimeScheduler() {}

    public static ElevatorScheduler getInstance(){
        if(scheduler == null)
            scheduler = new ResponseTimeScheduler();
        return scheduler;
    }

    public int selectElevator(final ElevatorManager manager,final int destination,final TextInputControlSkin.Direction direction){
        return 1;
    }

}
