package com.company;


import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int a;
        for(int i = 0; i < n; i++){
            a = input.nextInt();
            if(x > a) {
                System.out.print(a + " ");
            }
        }
    }
}
