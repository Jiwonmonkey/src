package com.company;

import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arr = new String[n+1];
        int count;
        int sum;

        for(int i = 0 ; i < n; i++) {
            arr[i] = input.next();
            sum = 0;
            count = 0;
            for(int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O'){
                    count++;
                }
                else if(arr[i].charAt(j) == 'X'){
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}
