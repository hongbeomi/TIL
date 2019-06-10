package com.homework.JavaProject;

public class Client {
    public static void main(String[] args) {
        Computer desktop = new Desktop("데스크탑");
        Computer notebook = new Notebook("노트북");
        Computer tablet = new Tablet("태블릿");

        desktop.setKeyboardStrategy(new NoTypingStrategy());
        desktop.setMouseStrategy(new NoCursorStrategy());
        desktop.setMonitorStrategy(new NoMonitoringStrategy());

        notebook.setKeyboardStrategy(new TypingStrategy());
        notebook.setMouseStrategy(new PadStrategy());
        notebook.setMonitorStrategy(new MonitoringStrategy());

        tablet.setKeyboardStrategy(new NoTypingStrategy());
        tablet.setMouseStrategy(new TouchingStrategy());
        tablet.setMonitorStrategy(new MonitoringStrategy());

        System.out.println("저는 "+desktop.getName()+" 입니다.");
        desktop.keyboard();
        desktop.mouse();
        desktop.monitor();

        System.out.println();

        System.out.println("저는 "+notebook.getName()+" 입니다.");
        notebook.keyboard();
        notebook.mouse();
        notebook.monitor();

        System.out.println();

        System.out.println("저는 "+tablet.getName()+" 입니다.");
        tablet.keyboard();
        tablet.mouse();
        tablet.monitor();
    }
}
