package com.homework;

public class InsertionSort {
    public void insertionSort(int [] list){
        int tmp;
        for (int i = 0 ; i < list.length ; i++){
            tmp = list[i];
            int j;

            for (j = i-1 ; j >= 0 && tmp < list[j] ; j--){
                list[j+1] = list[j];
            }
            list[j+1] = tmp;
        }
    }
}
