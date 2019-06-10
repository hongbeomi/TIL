package com.DesignPattern.FactoryMethod;

public class ElevatorManagerWithThroughputScheduling extends ElevatorManager{

    public ElevatorManagerWithThroughputScheduling(final int controllerCount){
        super(controllerCount);
    }

    protected ElevatorScheduler getScheduler(){
        ElevatorScheduler scheduler = ThroughputScheduler.getInstance();
        return scheduler;
    }

}
