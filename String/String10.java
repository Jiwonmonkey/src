package String;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        boolean[] check = new boolean[26];
        int before = 0;

        for(int j = 0; j < n; j++) {
            for(int i = 0; i < s.length(); i++) {
                int now = s.charAt(i);

                if(before != now) {

                    if(!check[now - 'a']) {
                        check[now - 'a'] = true;
                        before = now;
                    }
                    else {
                        break;
                    }
                }
            }

            for(int k = 0; k < s.length(); k++) {
                if(check[k] == true) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}