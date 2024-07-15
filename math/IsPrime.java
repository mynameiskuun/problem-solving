package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberCnt = Integer.valueOf(br.readLine());
        String input = br.readLine();
        String[] numberArr = input.split(" ");

        int answer = 0;

        outer : for(int i=0; i<numberCnt; i++) {
            int number = Integer.valueOf(numberArr[i]);
            if(number == 1) {
                continue;
            } else if (number == 2) {
                answer++;
                continue;
            }
            for(int j=2; j<number; j++) {
                if(number % j == 0) {
                    continue outer;
                }
            }
            answer++;
        }

        System.out.println(answer);
    }
}
