package BasicMath2;

import java.util.Scanner;

public class Math2_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int X = -1;
        int Y = -1;
        if (x[0] == x[1]) X = x[2];
        else {
            if (x[1] == x[2]) X = x[0];
            else X = x[1];
        }

        if (y[0] == y[1]) Y = y[2];
        else {
            if (y[1] == y[2]) Y = y[0];
            else Y = y[1];
        }

        System.out.println(X + " " + Y);
    }
}
