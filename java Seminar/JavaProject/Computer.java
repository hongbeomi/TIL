package com.homework.JavaProject;

public class Computer {

    private String name;
    private KeyboardStrategy keyboardStrategy;
    private MouseStrategy mouseStrategy;
    private MonitorStrategy monitorStrategy;

    public Computer(final String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void monitor(){
        monitorStrategy.monitor();
    }

    public void keyboard(){
        keyboardStrategy.keyboard();
    }

    public void mouse(){
        mouseStrategy.mouse();
    }

    public void setKeyboardStrategy(final KeyboardStrategy keyboardStrategy){
        this.keyboardStrategy = keyboardStrategy;
    }

    public void setMouseStrategy(final MouseStrategy mouseStrategy){
        this.mouseStrategy = mouseStrategy;
    }

    public void setMonitorStrategy(final MonitorStrategy monitorStrategy){
        this.monitorStrategy = monitorStrategy;
    }
}

