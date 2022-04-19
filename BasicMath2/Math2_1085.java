package BasicMath2;

import java.util.Scanner;

public class Math2_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int w = sc.nextInt();
        int h = sc.nextInt();

        int t1 = w - x;
        int t2 = h - y;
        int t3 = Math.min(x, y);

        int min = Math.min(Math.min(t1, t2), t3);
        System.out.println(min);
    }
}
