package BasicMath2;

import java.util.Scanner;

public class GetPrime_Algorithm {
    public static boolean[] prime; // 소수를 체크할 배열
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        getPrime(N);

        for(int i = 0; i < prime.length; i++) {
            // 값이 false인 prime의 index를 출력해라!
            if(!prime[i]) { System.out.println(i); }
        }
    }
    // 에라토스테네스의 체 알고리즘
    /*
    k = 2 부터 squt(N)이하까지 반복하여
    자연수들 중 k를 제외한 k의 배수를 제외하면 소수를 구할 수 있다는 알고리즘
     */
    public static void getPrime(int N) {

        prime = new boolean[N + 1];

        if(N < 2) { return; }

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(N); i++) {
            if(prime[i]) {continue;} // true인 배열은 skip함

            // i의 배수를 제외함
            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}