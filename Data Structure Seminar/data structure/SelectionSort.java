package com.homework;

public class SelectionSort {

    public void selectionSort(int[] list){
        int min, tmp;

        for(int i = 0 ; i < list.length ; i++){
            min = i;

            for (int j = 0 ; j < list.length ; j++) {
                if (list[j] > list[min]){
                    min = j;
                }

                tmp = list[i];
                list[i] = list[min];
                list[min] = tmp;
            }
        }
    }

}
