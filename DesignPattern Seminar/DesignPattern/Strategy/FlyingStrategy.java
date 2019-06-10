package com.DesignPattern.Strategy;

public class FlyingStrategy implements MovingStrategy{
    public void move(){
        System.out.println("I can fly");
    }
}