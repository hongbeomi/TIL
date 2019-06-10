package com.homework;
import java.util.*;

public class DFS {

    static int N, S;
    static int[] array;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();

        array = new int[N];

        for(int i = 0 ; i < N; i++){
            array[i] = sc.nextInt();
        }

        subset(0,0);

        if (S == 0){
            count -= 1;
        }
        System.out.println(count);
    }

    static void subset(int index, int sum) {
        if (index == N) {
            if (sum == S) {
                count++;
            }
            return;
        }
        subset(index + 1, sum + array[index]);
        subset(index + 1, sum);

    }
}