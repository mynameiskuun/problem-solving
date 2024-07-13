package datastructure;

import java.io.*;
import java.util.LinkedList;

public class QueueImpl {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lineCnt = Integer.valueOf(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i=0; i<lineCnt; i++) {
            String input = br.readLine();

            if(input.contains("push")) {
                queue.push(Integer.valueOf(input.split(" ")[1]));
            } else {
                int printVal = 0;

                switch(input) {
                    case "pop" :
                        printVal = queue.isEmpty() ? -1 : queue.removeLast();
                        break;
                    case "size" :
                        printVal = queue.size();
                        break;
                    case "empty" :
                        printVal = queue.isEmpty() ? 1 : 0;
                        break;
                    case "front" :
                        printVal = queue.isEmpty() ? -1 : queue.getLast();
                        break;
                    case "back" :
                        printVal = queue.isEmpty() ? -1 : queue.getFirst();
                        break;
                }
                bw.append(String.valueOf(printVal));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
