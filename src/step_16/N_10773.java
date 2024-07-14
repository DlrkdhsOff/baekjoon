package step_16;

import java.io.*;
import java.util.*;

public class N_10773 {
    public static void main(String[] args) throws IOException{
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            int item = Integer.parseInt(br.readLine());

            if (item == 0) {
                stack.pop();
            } else {
                stack.push(item);
            }
        }

        if (stack.isEmpty()) {
            bw.write('0');
        } else {
            int result = 0;
            while (!stack.isEmpty()) {
                result += stack.pop();
            }
            bw.write(String.valueOf(result));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
