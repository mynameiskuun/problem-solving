package datastructure2;

import java.io.*;

public class SearchAlphabet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int[] cntArr = new int[26];

        for(int i=0; i<cntArr.length; i++) {
            cntArr[i] = -1;
        }

        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            int alphabetIndex = c - 'a';

            if(cntArr[alphabetIndex] == -1) {
                cntArr[alphabetIndex] = i;
            }
        }

        for(int cnt : cntArr) {
            sb.append(cnt + " ");
        }

        System.out.println(sb);
    }
}
