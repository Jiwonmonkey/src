package BasicMath1;

import java.util.Scanner;

public class Math1_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int line = 0;
        int sum = 0;
        int start = 1;
        int top;
        int btm;

        while(x > sum) {
            line++;
            sum += line;
        }

        for(int i = 1; i < line; i++) {
            start = start + i;
        }

        if(line > 1) {
            if(line % 2 == 0) {
                top = 1;
                btm = line;

                while(start < x) {
                    top++;
                    btm--;
                    start++;
                }
                System.out.println(top + "/" + btm);
            }
            else {
                top = line;
                btm = 1;
                while(start < x) {
                    top--;
                    btm++;
                    start++;
                }
                System.out.println(top + "/" + btm);
            }
        }
        else {
            System.out.println(1 + "/" + 1);
        }
    }
}
