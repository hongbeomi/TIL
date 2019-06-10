package com.homework;


public class Main{
    public static void main(String[] args) {

        int [] list = {3,1,4,6,5,9,2};

        int pivot = 6;

        QuickSort quick = new QuickSort();

        for (int i : list) {
            System.out.print(i);
        }

        System.out.println();

        quick.quickSort(list,pivot,list.length-1);

        for (int i : list) {
            System.out.print(i);
        }

    }
}
