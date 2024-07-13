package datastructure;

import java.io.*;
import java.util.Stack;

public class IronPipe {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 레이저로 판명된 순간 현재 파이프 갯수만큼 answer++, pipeCnt - 1
        // 닫는 소괄호가 연속으로 나온다면 파이프가 끝난것을 의미. answer + 1

        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        int pipeCnt = 0;

        for(char c : input.toCharArray()) {
            if(c == '(') {
                pipeCnt++;
            } else if(c == ')') {
                if(stack.peek() == '(') {
                    --pipeCnt;
                    answer += pipeCnt;
                } else {
                    pipeCnt--;
                    answer += 1;
                }
            }
            stack.push(c);
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
