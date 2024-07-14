package datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourNumbers {

    public static void main(String[] args) throws IOException {

        // 제약조건 : 1 <= A,B,C,D <= 1,000,000
        // int 허용범위 : -2,147,483,648  < int <  2,147,483,647
        // long 허용범위 :-9,223,372,036,854,775,808 < long < 9,223,372,036,854,775,807

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] inputArr = input.split(" ");

        long a = Long.valueOf(inputArr[0] + inputArr[1]);
        long b = Long.valueOf(inputArr[2] + inputArr[3]);

        System.out.println(a + b);
    }
}
