package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSalesAmount {

    public static void main(String[] args) throws IOException {

        // N일 동안의 매출기록이 주어졌을때, 연속된 M일간 매출의 최대 합계를 구하라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int days = Integer.valueOf(input.split(" ")[0]);
        int dayRange = Integer.valueOf(input.split(" ")[1]);

        String daySales = br.readLine();
        String[] tempArr = daySales.split(" ");
        int[] daySalesArr = new int[tempArr.length];

        for (int i=0; i<tempArr.length; i++) {
            daySalesArr[i] = Integer.valueOf(tempArr[i]);
        }
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < dayRange; i++) {
            answer += daySalesArr[i];
        }

        sum = answer;
        int j = dayRange;
        for (int i = j; i < days; i++) {
            sum += (daySalesArr[i] - daySalesArr[i - j]);
            answer = Math.max(sum, answer);
        }

        System.out.println(answer);
    }
}
