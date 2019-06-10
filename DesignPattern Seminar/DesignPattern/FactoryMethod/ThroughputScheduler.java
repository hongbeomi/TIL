package com.DesignPattern.FactoryMethod;

import javafx.scene.control.skin.TextInputControlSkin;

public class ThroughputScheduler implements ElevatorScheduler{

    private static ElevatorScheduler scheduler;
    private ThroughputScheduler() {}

    public static ElevatorScheduler getInstance(){
        if(scheduler == null)
            scheduler = new ThroughputScheduler();
        return scheduler;
    }

    public int selectElevator(final ElevatorManager manager,final int destination,final TextInputControlSkin.Direction direction){
        return 0; //임의로 선택함
    }

}
