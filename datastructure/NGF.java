package datastructure;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class NGF {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.valueOf(br.readLine());
        int[] input = new int[size];
        int[] repeatCnt = new int[1000001];
        int[] result = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<size; i++) {
            input[i] = Integer.valueOf(st.nextToken());
            repeatCnt[input[i]]++;
        }

        for(int i = 0; i < size; i++) {
            while(!stack.isEmpty() && repeatCnt[input[stack.peek()]] < repeatCnt[input[i]]) {
                result[stack.pop()] = input[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for(int val : result) {
            bw.write(val + " ");
        }

        bw.flush();
    }
}
