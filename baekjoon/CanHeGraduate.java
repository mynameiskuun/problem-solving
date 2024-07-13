package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CanHeGraduate {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Double> creditMap = new HashMap<>();

        creditMap.put("A+", 4.5);
        creditMap.put("A0", 4.0);
        creditMap.put("B+", 3.5);
        creditMap.put("B0", 3.0);
        creditMap.put("C+", 2.5);
        creditMap.put("C0", 2.0);
        creditMap.put("D+", 1.5);
        creditMap.put("D0", 1.0);
        creditMap.put("F", 0.0);

        // 입력 받음. 학과명 / 학점 / 등급

        double totalCredit = 0; // 학점 총점
        double calculatedCredit = 0; // 계산 학점

        for(int i=0; i<20; i++) {
            double changedCredit = 0.0;
            String creditResult = br.readLine();

            // 전공평점이 3.3 이상이면 졸업 가능.
            // 전공평점 = (학점 * 등급) / 학점 총점

            String[] creditDetail = creditResult.split(" ");

            String subjectName = creditDetail[0];
            double subjectCredit = Double.valueOf(creditDetail[1]);
            String subjectGrade = creditDetail[2];

            if(subjectGrade.equals("P")) {
                continue;
            }

            changedCredit = creditMap.get(subjectGrade);
            calculatedCredit += subjectCredit * changedCredit;
            totalCredit += subjectCredit;
        }


        double result = calculatedCredit / totalCredit ;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

}
