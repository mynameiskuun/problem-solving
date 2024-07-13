package datastructure;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class JosephusProblem {

    public static void main(String[] main) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // <7,3>

        // [1,2,3,4,5,6,7]
        // [3,4,5,6,7,1,2] - 3
        // [4,5,6,7,1,2]
        // [6,7,1,2,4,5] - 6
        // [7,1,2,4,5]
        // [2,4,5,7,1] - 2
        // [4,5,7,1]
        // [7,1,4,5] - 7
        // [1,4,5]
        // [5,1,4] - 5
        // [1,4] - 1
        // [4] - 4
        // []
        // [3,6,2,7,5,1,4]

        String input = br.readLine();

        int size = Integer.valueOf(input.split(" ")[0]);
        int target = Integer.valueOf(input.split(" ")[1]);

        // enqueue : queue에 값 삽입. dequeue : queue로부터 값 추출
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> resultList = new ArrayList<>();

        for(int i=1; i<=size; i++) {
            queue.offer(i);
        }

        // target번째 값 전까지 값을 poll, offer -> 이후 target번째 값 remove();
        // queue의 사이즈가 target보다 작다면, target / size = remainder(나머지)에 해당하는 값을 추출.

        while(!queue.isEmpty()) {
            int loopCount = target % queue.size();

            if(loopCount == 0) {
                loopCount = queue.size();
            }

            for(int i=0; i<loopCount - 1; i++) {
                queue.offer(queue.poll());
            }

            resultList.add(queue.remove());
        }

        String result = resultList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "<", ">"));

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
