package step_14;

import java.io.*;
import java.util.*;

public class N_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        String[] card = br.readLine().split(" ");

        for (String s : card) {
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        String[] hold = br.readLine().split(" ");

        for (String s : hold) {
            if (map.containsKey(s)) {
                bw.write(map.get(s) + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
    }
}
