package step_16;

import java.io.*;
import java.util.*;

public class N_18258 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<String> q = new LinkedList<>();

        int loop = Integer.parseInt(br.readLine());
        String lastPut = "";

        for (int i = 0; i < loop; i++) {
            String[] order = br.readLine().split(" ");

            switch (order[0]) {
                case "push" :
                    q.offer(order[1]);
                    lastPut = order[1];
                    break;
                case "pop" :
                    bw.write((q.isEmpty()? -1 : q.poll()) + "\n");
                    break;
                case "size" :
                    bw.write(q.size() + "\n");
                    break;
                case "empty" :
                    bw.write((q.isEmpty()? 1 : 0 )+ "\n");
                    break;
                case "front" :
                    bw.write((q.isEmpty()? -1 : q.peek()) + "\n");
                    break;
                case "back" :
                    bw.write((q.isEmpty()? -1 : lastPut) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
