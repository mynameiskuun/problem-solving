package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDLCM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());

        int gcd = getGcd(Math.max(a,b), Math.min(a,b));
        int lcm = getLcm(Math.max(a,b), Math.min(a,b));

        System.out.println(gcd);
        System.out.println(lcm);
    }

    static int getGcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }

    static int getLcm(int a, int b) {
        return a * b / getGcd(a, b);
    }
}
