package baekjoon;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatianWord {

    public static void main(String[] args) throws IOException {

        String[] croatianWords = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String targetWord = br.readLine();

        // 크로아티아 알파벳 개수 세기
        for (String croatianAlphabet : croatianWords) {
            targetWord = targetWord.replace(croatianAlphabet, "*");
        }

        // 결과 출력 (크로아티아 알파벳을 *로 치환했기 때문에 길이 그대로 세면 된다)
        System.out.println(targetWord);
        System.out.println("substring : " + targetWord.substring(0,1));
        System.out.println(targetWord.length());
    }
}
