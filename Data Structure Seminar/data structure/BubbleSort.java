package com.homework;

public class BubbleSort {
    public void bubbleSort(int [] list){
        int tmp;

        for(int i = list.length-1 ; i>0 ; i--){

            for (int j = 0 ; j < i ; j++){

                if(list[j] > list[j+1]){
                    tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                }
            }
        }
    }
}
