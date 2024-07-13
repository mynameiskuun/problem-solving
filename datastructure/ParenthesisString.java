package datastructure;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class ParenthesisString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.valueOf(br.readLine());

        outer : for(int i=0; i<cnt; i++) {
            String sentence = br.readLine();
            Stack<String> stack = new Stack<>();

            for(int j=0; j<sentence.length(); j++) {
                char str = sentence.charAt(j);
                if(str == '(') {
                    stack.push("(");
                } else if(str == ')') {
                    try {
                        stack.pop();
                    } catch(EmptyStackException e) {
                        bw.append("NO");
                        bw.newLine();
                        continue outer;
                    }
                }
            }
            if(stack.empty()) {
                bw.append("YES");
            } else {
                bw.append("NO");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
