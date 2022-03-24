package While;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int a, b;
        int n = input.nextInt();
        int num = n;

        while(true) {
            a = n / 10;
            b = n % 10;

            n = (b * 10) + ((a + b) % 10);
            count++;
            if(n == num) {
                break;
            }
        }
        System.out.println(count);
    }
}
