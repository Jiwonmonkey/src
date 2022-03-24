package com.company;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int num, count = 0;
        boolean check;
        for(int i = 0; i < arr.length; i++) {
            num = input.nextInt();
            arr[i] = num % 42;
        }

        for(int i = 0; i < arr.length; i++) {
            check = false;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    check = true;
                    break;
                }
            }
            if(check == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
