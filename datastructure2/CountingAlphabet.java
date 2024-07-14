package datastructure2;

import java.io.*;

public class CountingAlphabet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int[] cntArr = new int[26];

        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            cntArr[c - 'a']++;
        }

        for(int i=0; i<cntArr.length; i++) {
            sb.append(cntArr[i] + " ");
        }

        System.out.println(sb);
        br.close();
    }
}
