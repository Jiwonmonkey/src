package BasicMath2;

import java.io.IOException;
import java.util.Scanner;

public class Math2_1929 {
    public static boolean[] prime;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();

        prime = new boolean[N + 1];

        getPrime();

        for(int i = M; i < prime.length; i++) {
            if(!prime[i]) {System.out.println(i);}
        }

    }
    public static void getPrime(){

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {

            if(prime[i]) {continue;}

            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
