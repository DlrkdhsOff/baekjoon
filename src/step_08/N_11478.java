package step_08;

import java.io.*;
import java.util.*;

public class N_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        String S = br.readLine();

        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String substring = S.substring(i, j);
                set.add(substring);
            }
        }
        bw.write(set.size() + "\n");
        bw.flush();
    }
}
