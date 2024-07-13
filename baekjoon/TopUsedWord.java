package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TopUsedWord {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String targetWord = br.readLine();
        int maxVal = 0;
        char maxWord = ' ';
        boolean isMaxValMoreThanOne = false;

        // 타겟 단어 입력은 영대소문 입력받지만, 대소문자 구별은 x. 모두 소문자 처리해서 판단

        targetWord = targetWord.toLowerCase();
        Map<Character, Integer> countMap = new HashMap<>();

        for(int i=0; i<targetWord.length(); i++) {
            if(countMap.containsKey(targetWord.charAt(i))) {
                int countVal = countMap.get(targetWord.charAt(i));
                countMap.put(targetWord.charAt(i), countVal + 1);
            } else {
                countMap.put(targetWord.charAt(i), 1);
            }
        }

        for(Character key : countMap.keySet()) {
            if(maxVal < countMap.get(key)) {
                maxVal = countMap.get(key);
                maxWord = key;
            }
        }

        int count = 0;

        for(int value : countMap.values()) {
            if(maxVal == value) {
                count++;
            }
            if(count > 1) {
                isMaxValMoreThanOne = true;
            }
        }

        System.out.println(isMaxValMoreThanOne ? "?" : String.valueOf(maxWord).toUpperCase());
    }
}
