package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoPointerArray2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrSize = Integer.valueOf(br.readLine());
        int[] arr = new int[arrSize];
        String arrValues = br.readLine();
        StringTokenizer st = new StringTokenizer(arrValues);

        for (int i = 0; i < arrSize; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        int arrSize2 = Integer.valueOf(br.readLine());
        int[] arr2 = new int[arrSize2];
        String arrValues2 = br.readLine();
        st = new StringTokenizer(arrValues2);

        for (int i = 0; i < arrSize2; i++) {
            arr2[i] = Integer.valueOf(st.nextToken());
        }

        // sort
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int[] arr3 = new int[arrSize + arrSize2];

        int p1 = 0, p2 = 0, i = 0;
        while (p1 < arrSize && p2 < arrSize2) {
            if(arr[p1] > arr2[p2]) {
                p2++;
            } else if(arr[p1] < arr2[p2]) {
                p1++;
            } else if(arr[p1] == arr2[p2]) {
                arr3[i++] = arr[p1];
                p1++; p2++;
            }
        }

        for (int j = 0; j < arr3.length; j++) {
            if(arr3[j] == 0) {
                break;
            }
            System.out.print(arr3[j] + " ");
        }
    }
}
