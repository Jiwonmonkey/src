package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math1_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int up = Integer.parseInt(st.nextToken());
        int dowm = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int days = (length - dowm) / (up - dowm);
        if((length - dowm) % (up - dowm) != 0) {
            days += 1;
        }
        System.out.println(days);
    }
}
