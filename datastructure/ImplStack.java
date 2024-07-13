package datastructure;

import java.io.*;
import java.util.ArrayList;

public class ImplStack {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ImplStack methods = new ImplStack();
        int executeCount = Integer.parseInt(br.readLine());

        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < executeCount; i++) {

            String command = br.readLine();
            methods.execute(command, stack);
        }
    }

    public void execute(String input, ArrayList<Integer> stack) {

        String[] inputArray = input.split(" ");
        String command = inputArray[0];

        switch (command) {
            case "push":
                int value = Integer.parseInt(inputArray[1]);
                push(stack, value);
                break;
            case "pop":
                pop(stack);
                break;
            case "size":
                size(stack);
                break;
            case "empty":
                empty(stack);
                break;
            case "top":
                top(stack);
                break;
        }
    }

    private void push(ArrayList<Integer> stack, int value) {
        stack.add(value);
    }

    private void pop(ArrayList<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("-1");
        } else {
            int topElement = stack.remove(stack.size() - 1);
            System.out.println(topElement);
        }
    }

    private void size(ArrayList<Integer> stack) {
        System.out.println(stack.size());
    }

    private void empty(ArrayList<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private void top(ArrayList<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(stack.get(stack.size() - 1));
        }
    }
}