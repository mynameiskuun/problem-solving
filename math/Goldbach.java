package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 6588
public class Goldbach {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int MAX = 1000000;
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);

        // 에라토스테네스의 체
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while(true) {
            int targetNumber = Integer.valueOf(br.readLine());
            if(targetNumber == 0) {
                break;
            }

            boolean flag = false;
            for(int i=2; i<=targetNumber / 2; i++) {

                    if(isPrime[i] && isPrime[targetNumber - i]) {
                    System.out.println(targetNumber + " = " + i + " + " + (targetNumber - i));
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}