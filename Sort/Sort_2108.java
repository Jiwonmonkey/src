package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("정렬 arr : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println();
        // 산술 평균
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("1. 산술 평균 : " + (sum / n));


        // 중앙값
        int medium = n / 2;
        System.out.println("2. 중앙값 : " + arr[medium]);


        // 최빈값
        boolean[] count = new boolean[10000];
        int num = 1;
        for(int i = 0; i < arr.length; i++) {
            if(!count[i]) {

            }
        }

    }
}
