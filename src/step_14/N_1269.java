package step_14;

import java.io.*;
import java.util.*;

public class N_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String index = br.readLine();

        Set<String> A = new HashSet<>(Arrays.asList(br.readLine().split(" ")));
        Set<String> B = new HashSet<>(Arrays.asList(br.readLine().split(" ")));

        int count = 0;
        for (String s : A) {
            if (!B.contains(s)) {
                count++;
            }
        }
        for (String s : B) {
            if (!A.contains(s)) {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }
}
