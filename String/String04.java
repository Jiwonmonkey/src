package String;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i = 0; i < c; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
