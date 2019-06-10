package com.DesignPattern.FactoryMethod;

import java.util.Calendar;

public class ElevatorManagerWithDynamicScheduling extends ElevatorManager {

    public ElevatorManagerWithDynamicScheduling(final int controllerCount){
        super(controllerCount);
    }

    protected ElevatorScheduler getScheduler(){
        ElevatorScheduler scheduler = null;
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hour < 12)
            scheduler = ResponseTimeScheduler.getInstance();
        else
            scheduler = ThroughputScheduler.getInstance();

        return scheduler;
    }
}
