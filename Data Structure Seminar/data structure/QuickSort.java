package com.homework;

public class QuickSort {
    public void quickSort(int[] list, int p, int r){
        int q;

        if(p < r){
            q = partition(list, p, r);
            quickSort(list, p, q-1);
            quickSort(list, q+1, r);
        }
    }

    public int partition(int [] list, int p, int r){
        int x = list[r];
        int i = p-1;

        for (int j = p ; j <= r-1 ; j++){
            if (list[j] <= x)
                list[++i] = list[j];
        }
        list[i+1] = list[r];
        return i+1;
    }
}
