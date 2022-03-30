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

        //몇번째 라인에 속하는지 찾는 코드
        while(x > sum) {
            line++;
            sum += line;
        }

        //그 라인의 첫번째 자리(index)를 찾는 코드
        for(int i = 1; i < line; i++) {
            start = start + i;
        }

        //line이 1보다 클 때
        if(line > 1) {
            //짝수는 분모가 라인으로 분자가 1로 시작
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
            //홀수는 그 반대로 시작함
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
        // 1일 때 항상 1 / 1 임
        else {
            System.out.println(1 + "/" + 1);
        }
    }
}
