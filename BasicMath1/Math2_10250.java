package BasicMath1;

import java.util.Scanner;

public class Math2_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int H = sc.nextInt(); // 세로
            int W = sc.nextInt(); // 가로
            int N = sc.nextInt(); // n 번째 사람

            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));
            }
            else {
                System.out.println((N % H) * 100 + ((N / H) + 1));
            }
        }
    }
}
