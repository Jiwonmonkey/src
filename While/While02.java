package While;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;

        while(input.hasNextInt()){
            A = input.nextInt();
            B = input.nextInt();

            System.out.println(A + B);
        }
    }
}
