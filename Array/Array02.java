package com.company;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[9];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
