package String;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        n1 = ((n1 % 10) * 100) + (((n1 % 100) / 10) * 10) + (n1 / 100);
        n2 = ((n2 % 10) * 100) + (((n2 % 100) / 10) * 10) + (n2 / 100);

        System.out.println(n1 > n2 ? n1 : n2);

        n1 = Integer.parseInt(new StringBuilder().append(n1).reverse().toString());
        n2 = Integer.parseInt(new StringBuilder().append(n2).reverse().toString());

    }
}
