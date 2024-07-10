package step_07;

import java.io.*;
import java.util.Arrays;

public class N_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char[] c = s.toCharArray();

        Arrays.sort(c);
        for (int i = c.length - 1; i >= 0; i--) {
            bw.write(c[i]);
        }
        bw.flush();
    }
}
