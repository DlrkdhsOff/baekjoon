package step_09;

import java.io.*;
import java.util.*;

public class N_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int input = Integer.parseInt(br.readLine());

            if (input == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();
            int result = 0;
            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    list.add(i);
                    result += i;
                }
            }

            StringBuilder sb = new StringBuilder();
            if (result == input) {
                sb.append(input).append(" = ");
                for (int i : list) {
                    sb.append(i).append(" + ");
                }
                sb.setLength(sb.length() - 3);
                bw.write(sb.toString() + "\n");
            } else {
                sb.append(input).append(" is NOT perfect.\n");
                bw.write(sb.toString());
            }
        }
        bw.flush();
    }
}