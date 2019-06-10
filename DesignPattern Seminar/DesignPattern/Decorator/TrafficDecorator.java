package com.DesignPattern.Decorator;

public class TrafficDecorator extends DisplayDecorator{
    public TrafficDecorator(Display decoratedDisplay){
        super(decoratedDisplay);
    }

    public void draw(){
        super.draw();
        drawTraffic();
    }

    private void drawTraffic(){
        System.out.println("\t교통량 표시");
    }
}
