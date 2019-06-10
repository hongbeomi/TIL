package com.DesignPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        for (String decoratorName:args){
            if(decoratorName.equalsIgnoreCase("Lane"))
                road = new LaneDecorator(road);
            if(decoratorName.equalsIgnoreCase("Traffic"))
                road = new TrafficDecorator(road);
            if(decoratorName.equalsIgnoreCase("Crossing"))
                road = new CrossingDecorator(road);
        }
        road.draw();
    }
}
