package com.homework.JavaProject;

public class NoMonitoringStrategy implements MonitorStrategy {

    public void monitor(){
        System.out.println("화면이 없어서 모니터링을 할 수 없습니다.");
    }

}
