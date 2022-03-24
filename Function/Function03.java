package Function;

import java.util.Scanner;

public class Function03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = one(num);
        System.out.println(n);
    }
    public static int one(int num){
        if(num < 100) {
            return num;
        }
        else {
            int count = 99;
            for(int i = 100; i <= num; i++) {
                int first = i / 100;
                int sec = (i / 10) % 10;
                int last = i % 10;

                if((first - sec) == (sec - last)){
                    count++;
                }
            }
            return count;
        }
    }
}
