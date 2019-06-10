package com.homework;

public class MergeSort {
    public void mergeSort(int[] list){
        int n = list.length;

        if(n == 1)
            return;

        int[] list1 = new int[n/2];
        int[] list2 = new int[n - n/2];

        for (int i = 0 ; i < n/2 ; i++){
            list1[i] = list[i];
        }

        for (int i = 0 ; i < n - n/2 ; i++){
            list2[i] = list[i + n/2];
        }

        mergeSort(list1);
        mergeSort(list2);
        merge(list1, list2, list);
    }

    public void merge(int[] list1, int[] list2, int[] list) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (a < list1.length) {
            if (b < list2.length) {
                if (list1[a] < list2[b]) {
                    list[c] = list1[a];
                    a++;
                } else {
                    list[c] = list2[b];
                    b++;
                }
                c++;
            } else {
                while (a < list1.length) {
                    list[c] = list1[a];
                    a++;
                    c++;
                }
            }
        }
        while (b < list2.length) {
            list[c] = list2[b];
            b++;
            c++;
        }
    }
}
