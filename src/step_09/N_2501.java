package step_09;

import java.io.*;
import java.util.*;

public class N_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> measure = new ArrayList<>();

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                measure.add(i);
            }
        }

        if (measure.size() < b) {
            bw.write("0\n");
        } else {
            bw.write(measure.get(b - 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}