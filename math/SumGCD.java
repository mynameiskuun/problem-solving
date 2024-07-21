package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 9613
public class SumGCD {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cntTest = Integer.valueOf(br.readLine());

        for (int i = 0; i < cntTest; i++) {
            long sumGcd = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int testCaseNumCnt = Integer.valueOf(st.nextToken());

            int[] arr = new int[testCaseNumCnt];
            for(int j=0; j<testCaseNumCnt; j++) {
                arr[j] = Integer.valueOf(st.nextToken());
            }

            for(int j=0; j<testCaseNumCnt; j++) {
                for(int k=j+1; k<testCaseNumCnt; k++) {
                    sumGcd += getGcd(Math.max(arr[j], arr[k]), Math.min(arr[j], arr[k]));
                }
            }
            sb.append(sumGcd+"\n");
        }
        System.out.println(sb);
    }

    static int getGcd(int max, int min) {

        if(min == 0) {
            return max;
        }
        return getGcd(min, max % min);
    }
}
