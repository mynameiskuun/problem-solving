package datastructure2;

import java.io.*;
import java.util.Stack;

public class ReverseCalculate {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int varCnt = Integer.valueOf(br.readLine());
        Stack<Double> stack = new Stack<>();
        int[] intArr = new int[varCnt];

        String postFixString = br.readLine();

        for(int i=0; i<varCnt; i++) {
            intArr[i] = Integer.valueOf(br.readLine());
        }


        for(int i=0; i<postFixString.length(); i++) {
            char val = postFixString.toCharArray()[i];
            double result = 0;

            if(Character.isAlphabetic(val)) {
                int number = intArr[val - 'A'];
                stack.push(Double.valueOf(number));
            } else {
                double top = stack.pop();
                double nextVal = stack.pop();

                if(val == '*') {
                    result = nextVal * top;
                } else if(val == '+') {
                    result = nextVal + top;
                } else if(val == '-') {
                    result = nextVal - top;
                } else if(val == '/') {
                    result = nextVal / top;
                }
                stack.push(result);
            }
        }

        bw.write(String.format("%.2f", stack.pop()));
        bw.flush();
        bw.close();
        br.close();
    }
}
