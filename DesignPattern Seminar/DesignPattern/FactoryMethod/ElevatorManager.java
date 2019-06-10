package com.DesignPattern.FactoryMethod;

import javafx.scene.control.skin.TextInputControlSkin;
import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorManager {

    private List<ElevatorController> controllers;

    public ElevatorManager(final int controllerCount){
        controllers = new ArrayList<>(controllerCount);
        for(int i = 0 ; i < controllerCount ; i++){
            ElevatorController controller = new ElevatorController(i+1);
            controllers.add(controller);
        }
    }

    protected abstract ElevatorScheduler getScheduler();

    void requestElevator(final int destination, final TextInputControlSkin.Direction direction){
        ElevatorScheduler scheduler = getScheduler();
        System.out.println(scheduler);
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }

}
