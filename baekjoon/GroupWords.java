package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupWords {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputWordsCount = Integer.parseInt(br.readLine());

        int answer = 0;
        String[] targetWords = new String[inputWordsCount];

        for(int i=0; i<inputWordsCount; i++) {
            String word = br.readLine();

            if(validateGroupWord(word)) {
                answer++;
            }
            targetWords[i] = br.readLine();
        }

        System.out.println(answer);
    }

    private static boolean validateGroupWord(String targetWord) {

        boolean result = true;
        boolean flag = true;
        Map<Character, Integer> validateMap = new HashMap<>();

        // charArray 처리 -> 한글자씩 validate -> group 단어 테스트
        // 테스트

        for(int i=0; i<targetWord.length(); i++) {
            int cnt = 1;
            while(flag) {
                if(validateMap.containsKey(targetWord.charAt(i))) {
                    result = false;
                    flag = false;
                } else {
                    if(targetWord.charAt(i) == targetWord.charAt(i + 1)) {
                        cnt += cnt + 1;
                        validateMap.put(targetWord.charAt(i), cnt); // 같은 단어 나올 시
                    } else {
                        targetWord = targetWord.substring(0, cnt);
                        flag = false;
                    }
                }
            }
        }
        if(flag) {
            result = false;
        }
        return result;
    }
}
