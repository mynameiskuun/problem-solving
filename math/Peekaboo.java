package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Peekaboo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int numOfBro = Integer.valueOf(st.nextToken());
        int currIdx = Integer.valueOf(st.nextToken());
        int[] absArr = new int[numOfBro];

        String broIdxs = br.readLine();
        st = new StringTokenizer(broIdxs);

        for(int i=0; i<numOfBro; i++) {
            int broCurrIdx = Integer.valueOf(st.nextToken());
            int abs = Math.abs(currIdx - broCurrIdx);
            absArr[i] = abs;
        }

        int lcm = absArr[0];
        for (int i = 0; i < absArr.length; i++) {
            lcm = getLcm(Math.max(lcm, absArr[i]), Math.min(lcm, absArr[i]));
        }
        System.out.println(lcm);
    }

    static int getLcm(int max, int min) {
        if(min == 0) {
            return max;
        }
        return getLcm(min, max % min);
    }
    // 17087
}
