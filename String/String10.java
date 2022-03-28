package String;

import java.util.Scanner;

public class String10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(check()) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        int prev = 0;
        boolean[] check = new boolean[26];

        String s = sc.next();
        for (int j = 0; j < s.length(); j++) {
            int now = s.charAt(j);

            if (prev != now) {
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}