package datastructure2;

import java.io.*;
import java.util.Stack;

public class PostFixExpression {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String postFixString = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (char val : postFixString.toCharArray()) {
            if('A' <= val && val <= 'Z') {
                bw.write(val);
            } else if(val == '(') {
                stack.push(val);
            } else if(val == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    bw.write(stack.pop());
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(val)) {
                    bw.write(stack.pop());
                }
                stack.push(val);
            }
        }

        while(!stack.isEmpty()) {
            bw.write(stack.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int priority(char var) {
        if(var == '(') {
            return 0;
        } else if(var == '+' || var == '-') {
            return 1;
        } else {
            return 2;
        }
    }
}
