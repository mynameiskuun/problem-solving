package datastructure;

import java.io.*;
import java.util.Stack;

public class Sequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        boolean possible = true;
        int currVal = 1;
        int index = 0;

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        while (index < count) {
            if (!stack.isEmpty() && stack.peek() == array[index]) {
                stack.pop();
                result.append("-\n");
                index++;
            } else if (currVal <= count) {
                stack.push(currVal++);
                result.append("+\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            bw.write(result.toString());
        } else {
            bw.write("NO\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
