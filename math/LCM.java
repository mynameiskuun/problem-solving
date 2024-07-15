package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int resultCnt = Integer.valueOf(br.readLine());

        for(int i=0; i<resultCnt; i++) {
            String input = br.readLine();
            int a = Integer.valueOf(input.split(" ")[0]);
            int b = Integer.valueOf(input.split(" ")[1]);

            sb.append(getLcm(Math.max(a,b), Math.min(a,b)));
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static int getGcd(int a, int b) {

        if(b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }

    static int getLcm(int a, int b) {
        return (a * b) / getGcd(a, b);
    }
}
