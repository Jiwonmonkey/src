package com.company;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int mul = a * b * c;
        int[] arr = new int[9];
        int count = 0, num;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = mul % 10;
            if(mul != 0) {
                mul = mul / 10;
                count++;
            }
        }
        for(int i = 0; i < 10; i++) {
            num = 0;
            for(int j = 0; j < count; j++) {
                if(arr[j] == i) {
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
