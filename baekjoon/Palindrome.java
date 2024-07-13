package baekjoon;

import java.io.*;

public class Palindrome {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 단어를 거꾸로 나열하여 비교.
        // 같다면 팰린드롬, 다르다면 팰린드롬 x

        String targetWord = br.readLine();
        int flag = 1;

        for(int i=0; i<targetWord.length()/2; i++) {
            if(targetWord.charAt(i) != targetWord.charAt(targetWord.length()-(1+i))) {
                flag = 0;
            }
        }

        bw.write(String.valueOf(flag));
        bw.flush();
        bw.close();
    }
}
