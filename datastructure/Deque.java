package datastructure;

import java.io.*;
import java.util.LinkedList;

public class Deque {

    public static void main(String[] main) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCount = Integer.valueOf(br.readLine());

        LinkedList<Integer> deque = new LinkedList<>();

        for(int i=0; i<loopCount; i++) {
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            int resultVal = 0;

            switch(command) {
                case "push_front" :
                    deque.addFirst(Integer.valueOf(inputArray[1]));
                    break;
                case "push_back" :
                    deque.addLast(Integer.valueOf(inputArray[1]));
                    break;
                case "pop_front" :
                    if(deque.isEmpty()) {
                        bw.append("-1");
                    } else {
                        resultVal = deque.removeFirst();
                        bw.append(String.valueOf(resultVal));
                    }
                    bw.newLine();
                    break;
                case "pop_back" :
                    if (deque.isEmpty()) {
                        bw.append("-1");
                    } else {
                        resultVal = deque.removeLast();
                        bw.append(String.valueOf(resultVal));
                    }
                    bw.newLine();
                    break;
                case "size" :
                    bw.append(String.valueOf(deque.size()));
                    bw.newLine();
                    break;
                case "empty" :
                    resultVal = deque.isEmpty() ? 1 : 0;
                    bw.append(String.valueOf(resultVal));
                    bw.newLine();
                    break;
                case "front" :
                    resultVal = deque.isEmpty() ? -1 : deque.peekFirst();
                    bw.append(String.valueOf(resultVal));
                    bw.newLine();
                    break;
                case "back" :
                    resultVal = deque.isEmpty() ? -1 : deque.peekLast();
                    bw.append(String.valueOf(resultVal));
                    bw.newLine();
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
