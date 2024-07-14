package datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InspectString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while((str = br.readLine()) != null) {
            int lowerCase = 0;
            int upperCase = 0;
            int numbers = 0;
            int blank = 0;

            for (char c : str.toCharArray()) {
                if(Character.isUpperCase(c)) {
                    upperCase++;
                } else if(Character.isLowerCase(c)) {
                    lowerCase++;
                } else if(Character.isDigit(c)) {
                    numbers++;
                } else if(c == ' ') {
                    blank++;
                }
            }

            System.out.println(lowerCase + " " + upperCase + " " + numbers + " " + blank);
        }
    }
}
