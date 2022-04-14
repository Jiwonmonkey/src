package BasicMath2;

import java.util.Scanner;

public class Math1_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean check;
        int count = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            check = isPrime(arr[i]);
            if(check == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n != 1 && n != 0) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        else {
            return false;
        }
        return true;
    }
}
