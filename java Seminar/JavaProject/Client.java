package com.homework.JavaProject;

public class Client {
    public static void main(String[] args) {
        Computer desktop = new Desktop("����ũž");
        Computer notebook = new Notebook("��Ʈ��");
        Computer tablet = new Tablet("�º�");

        desktop.setKeyboardStrategy(new NoTypingStrategy());
        desktop.setMouseStrategy(new NoCursorStrategy());
        desktop.setMonitorStrategy(new NoMonitoringStrategy());

        notebook.setKeyboardStrategy(new TypingStrategy());
        notebook.setMouseStrategy(new PadStrategy());
        notebook.setMonitorStrategy(new MonitoringStrategy());

        tablet.setKeyboardStrategy(new NoTypingStrategy());
        tablet.setMouseStrategy(new TouchingStrategy());
        tablet.setMonitorStrategy(new MonitoringStrategy());

        System.out.println("���� "+desktop.getName()+" �Դϴ�.");
        desktop.keyboard();
        desktop.mouse();
        desktop.monitor();

        System.out.println();

        System.out.println("���� "+notebook.getName()+" �Դϴ�.");
        notebook.keyboard();
        notebook.mouse();
        notebook.monitor();

        System.out.println();

        System.out.println("���� "+tablet.getName()+" �Դϴ�.");
        tablet.keyboard();
        tablet.mouse();
        tablet.monitor();
    }
}
