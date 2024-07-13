package baekjoon;

import java.io.*;

public class PrintStar {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputCnt = Integer.parseInt(br.readLine());

        String star = "*";
        String blank = " ";

        for (int i = 1; i < inputCnt; i++) {
            for (int j = inputCnt; j > i; j--) {
                bw.write(blank);
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                bw.write(star);
            }
            bw.newLine();
        }
        for (int l = 1; l <= 2 * inputCnt - 1; l++) {
            bw.write(star);
        }
        bw.newLine();
        for (int i = inputCnt; i > 1; i--) {
            for (int j = inputCnt; j >= i; j--) {
                bw.write(blank);
            }
            for (int k = 2; k < 2 * i - 1; k++) {
                bw.write(star);
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
