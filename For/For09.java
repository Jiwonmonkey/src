package com.company;

import java.util.Scanner;

public class For09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num; j > i; j--){
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
