package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class For07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        int A;
        int B;

        for(int i = 1; i <= num; i++){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A+B) + "\n");
        }
        bw.close();
    }
}
