package com.DesignPattern.Strategy;

public class MissileStrategy implements AttackStrategy{
    public void attack(){
        System.out.println("I have Missile and can attack with it");
    }
}
