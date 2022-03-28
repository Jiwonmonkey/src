package BasicMath1;

import java.util.Scanner;

public class Math1_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int range = 2; //최소 범위값

        int n = sc.nextInt();

        if(n == 1) {
            System.out.println(1);
        }
        else {
            while(range <= n) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
