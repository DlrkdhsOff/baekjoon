package step_13;

import java.io.*;
import java.util.*;

public class N_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        int[] clone = new int[n];

        for (int i = 0; i < n; i++) {
            clone[i] = Integer.parseInt(data[i]);
        }
        Arrays.sort(clone);

        int index = 0;
        for (int s : clone) {
            if (map.containsKey(s)) {
                continue;
            } else {
                map.put(s, index);
            }
            index++;
        }

        for (String s : data) {
            bw.write(map.get(Integer.parseInt(s)) + " ");
        }
        bw.flush();
    }
}
