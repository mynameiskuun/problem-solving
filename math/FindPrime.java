package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrime {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int a = Integer.valueOf(input.split(" ")[0]);
        int b = Integer.valueOf(input.split(" ")[1]);

        int[] numArray = new int[b+1];

        numArray[0] = 1;
        numArray[1] = 1;

        for(int i=2; i<=Math.sqrt(b); i++) {
            if(numArray[i] == 1) {
                continue;
            }
            for(int j = i * i; j <= b; j += i) {
                numArray[j] = 1;
            }
        }

        for(int i=a; i<=b; i++) {
            if(numArray[i] != 1) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
