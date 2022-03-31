package BasicMath1;

import java.io.*;
import java.util.StringTokenizer;

public class Math1_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int move = a - b; // 하루 이동 거리
        int days = v / move;

        if(v % move != 0) {
            days++;
        }

        System.out.println(days);
    }
}
