package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math2_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int small = 2;
        while(N != 1) {
            if(N % small != 0) {
                small++;
            }
            else {
                N /= small;
                System.out.println(small);
            }
        }
    }
}
