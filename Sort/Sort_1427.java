package Sort;

import java.util.Scanner;

public class Sort_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] arr = new int[10];

        for(int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            arr[i] = ch - 48;
        }

        for(int i = 0; i < n.length(); i++) {
            for(int j = i + 1; j < n.length(); j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print(arr[i]);
        }


    }
}
