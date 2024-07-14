package datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PrefixArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String[] prefixArr = new String[input.length()];

        for(int i=0; i < input.length(); i++) {
            prefixArr[i] = input.substring(i);
        }

        Arrays.sort(prefixArr, Comparator.naturalOrder());

        for(String val : prefixArr) {
            sb.append(val);
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
