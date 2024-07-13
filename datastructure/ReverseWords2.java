package datastructure;

import java.io.*;
import java.util.Stack;

public class ReverseWords2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        String input = br.readLine();
        boolean isTag = false;

        // 태그 아닌 문자 어떻게 단어별로 순서 보존하면서 뒤집기만 할것인가
        // 태그가 아닐때, 일반 문자열은 공백이 나올때까지 stack에 적재.
        // 공백을 만났을때, tag가 아니라면 stack 값 pop 하여 적재.
        for (char c : input.toCharArray()) {
            if(c == '<') {
                isTag = true;
                if(!stack.isEmpty()) {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }
                sb.append(c);
            } else if (c == '>') {
                isTag = false;
                sb.append(c);
            } else if (c == ' ') {
                if(isTag) {
                    sb.append(c);
                } else {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(c);
                }
            } else {
                if(isTag) {
                    sb.append(c);
                } else {
                    stack.push(c);
                }
            }
        }

        if(!stack.isEmpty()) {
            while(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
        }

        System.out.println(sb);
    }
}
