package Sort;

import java.util.Scanner;

public class Sort_2108 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 10000;

        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            sum += value;
            arr[i + 4000]++;

            if(max < value) {
                max = value;
            }
            if(min > value) {
                min = value;
            }
        }

        int count = 0; // 중앙값 빈도 누적수
        int mode_max = 0; // 최빈값 최댓값
        boolean flag = false; // 최빈값이 이전에 한번만 출연했을 경우 true, 아닐 경우 false
        for(int i = min + 4000; i <= max + 4000; i++) {
            if(arr[i] > 0) {

                // 중앙값 찾기
                if(count < (n + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                // 최빈값 찾기
                if(mode_max < arr[i]) {
                    mode_max = arr[i];
                    flag = true;
                }
                else if(mode_max == arr[i] && flag) {
                    mode_max = arr[i];
                    flag = false;
                }
            }
        }

        System.out.println((int)Math.round((double)sum / n));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
