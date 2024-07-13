package datastructure;

import java.io.*;
import java.util.*;

public class NGE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.valueOf(br.readLine());
        int[] numbers = new int[size];
        int[] result = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<size; i++) {
            numbers[i] = Integer.valueOf(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<size; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                result[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int val : result) {
            bw.write(val + " ");
        }
        bw.flush();
    }
}
