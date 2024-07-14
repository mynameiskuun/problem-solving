package datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // A ~ Z : 65 ~ 90
        // a ~ z : 97 ~ 122

        String input = br.readLine();

        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);

            if('A' <= c && c <= 'Z') {
                c = (char) ((c - 'A' + 13) % 26 + 'A');
            } else if ('a' <= c && c <= 'z') {
                c = (char) ((c - 'a' + 13) % 26 + 'a');
            }

            sb.append(c);
        }
        System.out.println(sb);
    }
}
