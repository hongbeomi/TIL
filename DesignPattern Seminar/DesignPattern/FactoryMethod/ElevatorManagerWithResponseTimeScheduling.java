package com.DesignPattern.FactoryMethod;

public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager {

    public ElevatorManagerWithResponseTimeScheduling(final int controllerCount){
        super(controllerCount);
    }

    protected ElevatorScheduler getScheduler(){
        ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance();
        return scheduler;
    }
}
