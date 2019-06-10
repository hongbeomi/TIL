package com.DesignPattern;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private static int SLEEPING = 2;
    private int state;

    public Light(){
        state = OFF;  //형광등의 초기 상태는 꺼져 있는 상태
    }
    public void on_button_pushed(){
        if(state == ON){ // 형광등이 켜져 있을 때 On 버튼을 누르면 취침등 상태로 전환됨
            System.out.println("취침등 상태");
            state = SLEEPING;
        }
        else if (state == SLEEPING){ // 형광등이 취침등 상태에 있는 경우
            System.out.println("Light On!"); // On 버튼을 누르면 켜진 상태로 전환됨
            state = ON;
        }
        else{  // 형광등이 꺼져 있을 때 On 버튼을 누르면 켜진 상태로 전환
            System.out.println("Light On");
            state = ON;
        }
    }
    public void off_button_pushed(){
        if(state == OFF){ //형광등이 꺼져 있을 때 Off 버튼을 누르면 상태 전환 없음
            System.out.println("반응 없음");
        }
        else if (state == SLEEPING){ // 형광등이 취침등 상태에 있는 경우
            System.out.println("Light Off!"); //Off버튼을 누르면 OFF로 전환됨
            state = OFF;
        }
        else{
            System.out.println("Light Off!");
            state = OFF;
        }
    }
}

