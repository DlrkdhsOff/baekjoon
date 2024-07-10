package step_08;

import java.io.*;
import java.util.*;

public class N_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>(Arrays.asList(br.readLine().split(" ")));

        int m = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        for (String str : arr) {
            if (set.contains(str)) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();

    }
}
