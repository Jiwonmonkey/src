package Recursion;
import java.util.Scanner;

public class Re_10872 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fac = Factorial(n);

        System.out.println(fac);

    }

    public static int Factorial(int n){
        if(n == 0) {
            return 1;
        }
        else {
            return n * Factorial(n-1);
        }

    }
}
