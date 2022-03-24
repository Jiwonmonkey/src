package com.company;

import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c = input.nextInt();

        for(int i = 0; i < c; i++) {

            int n = input.nextInt();
            int[] arr = new int[n];
            double average = 0.0;

            for(int j = 0; j < n; j++) {
                arr[j] = input.nextInt();
                average += arr[j];
            }
            double cnt = 0.0;

            for(int k = 0; k < n; k++) {
                if(arr[k] > (average / n)) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
    }
}
