package datastructure;

import java.io.*;

public class ReverseWords {

    /* StringBuilder 미사용 ver*/
    /*public static void main(String[] args) throws IOException {

        // 입력받을 라인 숫자를 최초에 입력받는다.
        // 입력받은 숫자만큼 문자열을 입력받는다.
        // 문자열의 단어들을 모두 뒤집어서 출력시킨다.
        // ex) I ate an apple. -> I eta na .elppa

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.valueOf(br.readLine());
        String[] answer = new String[cnt];

        for(int i=0; i<cnt; i++) {
            String sentence = br.readLine();
            String[] words = sentence.split(" ");
            for(int j=0; j<words.length; j++) {
                String word = words[j];
                char[] reversed = new char[word.length()];
                int index = 0;
                for(int k=word.length()-1; k>=0; k--) {
                    reversed[index] = word.charAt(k);
                    index++;
                }
                words[j] = String.valueOf(reversed);
                answer[i] = String.join(" ", words);
            }
        }

        for(String word : answer) {
            System.out.println(word);
        }
    }*/

    /*StringBuilder 사용 ver -> 메모리, 시간복잡도 측면에서 매우 우수*/
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.valueOf(br.readLine());
        String[] result = new String[cnt];

        for(int i=0; i<cnt; i++) {
            String sentence = br.readLine();
            String[] words = sentence.split(" ");
            String reversedSentence = "";
            for(int j=0; j<words.length; j++) {
                StringBuilder sb = new StringBuilder(words[j]);
                reversedSentence += sb.reverse() + " ";
            }
            result[i] = reversedSentence;
            bw.append(result[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
