package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10872
public class Factorial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.valueOf(br.readLine());
        int answer = 0;
        // 맨 뒷자리가 0이 되는 경우는 5의 배수가 곱해졌을때

        for(int i=5; i<=input; i *= 5) {
            answer += input / i;
        }

        System.out.println(answer);
    }
}
