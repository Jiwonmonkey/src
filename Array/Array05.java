package com.company;

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] grade = new int[n];
        int max = 0;
        int sum = 0;
        double average = 0.0;

        for(int i = 0; i < grade.length; i++) {
            grade[i] = input.nextInt();
            if (max <= grade[i]) {
                max = grade[i];
            }
            sum += grade[i];
        }
        average = (100.0 * sum / max) / n;
        System.out.println(average);

    }
}
