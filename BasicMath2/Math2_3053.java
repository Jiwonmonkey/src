package BasicMath2;

import java.util.Scanner;

public class Math2_3053 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 반지름
        int r = sc.nextInt();

        // 유클리드 기하학에서의 원의 넓이
        double area1 = (Math.PI) * r * r;

        // 택시 기하학에서의 원의 넓이
        double area2 = 2 * r * r;

        System.out.println(String.format("%.6f", area1));
        System.out.println(String.format("%.6f", area2));
    }
}
