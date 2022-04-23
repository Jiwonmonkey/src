package BasicMath2;

import java.util.Scanner;

public class Math2_1002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            // 두 원의 중심 사이의 거리
            int d = (int)(Math.sqrt(Math.pow((x2 - x1), 2) +  Math.pow((y2 - y1), 2)));

            // 교점이 두개일때
            if ((r1 + r2) > d) {
                System.out.println(2);
            }
            // 교점이 하나 일때
            // 외접이거나, 내접일때
            else if ((r1 + r2) == d || Math.abs(r2 - r1) == d) {
                System.out.println(1);
            }
            else if ((r1 + r2) < d || Math.abs(r2 - r1) > d) {
                System.out.println(0);
            }
            // 교점이 무한개일때
            // 원이 완전히 겹칠 때
            else if(x1 == x2 && y1 == y2 && r1 == r2){
                System.out.println(-1);
            }
        }
    }
}
