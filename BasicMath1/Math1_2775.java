package BasicMath1;

import java.util.Scanner;

public class Math1_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int k = sc.nextInt(); //층
            int n = sc.nextInt(); //호
            System.out.println(sum(k, n));
       }
    }

    public static int sum(int k, int n) {
        if(n == 0) {
            return 0;
        }
        else if(k == 0){
            return n;
        }
        else {
            return sum(k, n - 1) + sum(k - 1, n);
        }
    }
}
