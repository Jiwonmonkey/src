package BasicMath2;

import java.util.Scanner;

public class Math2_9020 {

    public static boolean[] prime;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 케이스 갯수

        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            prime = new boolean[N + 1];
            get_Prime();

            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= (prime.length - 1) / 2; j++) {
                if(!prime[j]) {
                    if(prime[N - j]) continue;
                    else {
                        if((N-j) <= min) min = N - j;
                    }
                }
            }
            System.out.println((N - min) + " " + min);
        }
    }
    public static void get_Prime() {

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {

            if(prime[i]) continue;

            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
