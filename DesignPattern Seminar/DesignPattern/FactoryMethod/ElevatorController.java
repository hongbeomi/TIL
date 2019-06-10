package com.DesignPattern.FactoryMethod;

public class ElevatorController {
    private int id;
    private int curFloor;

    public ElevatorController(final int id){
        this.id = id;
        curFloor = 1;
    }

    public void gotoFloor(final int destination) {
        System.out.println("Elevator [" + id + "] Floor: " + curFloor);
        curFloor = destination;
        System.out.println(" ==> "+curFloor);
    }
}
