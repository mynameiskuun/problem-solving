package datastructure;

import java.io.*;
import java.util.Enumeration;
import java.util.Stack;
import java.util.StringTokenizer;

public class Editor {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int count = Integer.valueOf(br.readLine());

        // L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
        // D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
        // B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
        // 삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
        // P $	$라는 문자를 커서 왼쪽에 추가함

        Stack<Character> ls = new Stack<>();
        Stack<Character> rs = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            ls.push(str.charAt(i));
        }

        for(int i=0; i<count; i++) {

            String command = br.readLine();

            switch(command.charAt(0)) {
                case 'L' :
                    if(!ls.isEmpty()) {
                        rs.push(ls.pop());
                    }
                    break;
                case 'D' :
                    if (!rs.isEmpty()) {
                        ls.push(rs.pop());
                    }
                    break;
                case 'B' :
                    if (!ls.isEmpty()) {
                        ls.pop();
                    }
                    break;
                case 'P' :
                    ls.push(command.charAt(2));
                    break;
            }
        }

        while(!rs.isEmpty()) {
            ls.push(rs.pop());
        }

        for (int i=0; i < ls.size(); i++) {
            bw.write(ls.get(i));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
