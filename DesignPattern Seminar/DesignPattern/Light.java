package com.DesignPattern;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private static int SLEEPING = 2;
    private int state;

    public Light(){
        state = OFF;  //�������� �ʱ� ���´� ���� �ִ� ����
    }
    public void on_button_pushed(){
        if(state == ON){ // �������� ���� ���� �� On ��ư�� ������ ��ħ�� ���·� ��ȯ��
            System.out.println("��ħ�� ����");
            state = SLEEPING;
        }
        else if (state == SLEEPING){ // �������� ��ħ�� ���¿� �ִ� ���
            System.out.println("Light On!"); // On ��ư�� ������ ���� ���·� ��ȯ��
            state = ON;
        }
        else{  // �������� ���� ���� �� On ��ư�� ������ ���� ���·� ��ȯ
            System.out.println("Light On");
            state = ON;
        }
    }
    public void off_button_pushed(){
        if(state == OFF){ //�������� ���� ���� �� Off ��ư�� ������ ���� ��ȯ ����
            System.out.println("���� ����");
        }
        else if (state == SLEEPING){ // �������� ��ħ�� ���¿� �ִ� ���
            System.out.println("Light Off!"); //Off��ư�� ������ OFF�� ��ȯ��
            state = OFF;
        }
        else{
            System.out.println("Light Off!");
            state = OFF;
        }
    }
}

