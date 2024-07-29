package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousPartialArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int arraySize = Integer.valueOf(input.split(" ")[0]);
        int targetNumber = Integer.valueOf(input.split(" ")[1]);

        String numberSequence = br.readLine();
        StringTokenizer st = new StringTokenizer(numberSequence);
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = Integer.valueOf(st.nextToken());
        }

        int cnt = 0;
        int endPoint = 0;
        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            while(sum < targetNumber && endPoint < arraySize) {
                sum += array[endPoint++];
            }
            if (sum == targetNumber) {
                cnt++;
            }
            sum -= array[i];
        }
        System.out.println(cnt);
    }

}
