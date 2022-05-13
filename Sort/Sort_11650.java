package Sort;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Sort_11650 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0 ; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(x[i] > x[j]) {
                    int temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;

                    temp = y[j];
                    y[j] = y[i];
                    y[i] = temp;
                }
                if(x[i] == x[j]) {
                    if(y[i] > y[j]) {

                        int temp = y[j];
                        y[j] = y[i];
                        y[i] = temp;
                    }
                }
            }
        }
    }

}
