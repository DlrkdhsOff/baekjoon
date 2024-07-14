package step_14;

import java.io.*;
import java.util.*;

public class N_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String index = br.readLine();
        StringTokenizer t = new StringTokenizer(index);

        int n = Integer.parseInt(t.nextToken());
        int m = Integer.parseInt(t.nextToken());

        int count = 0;
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                String name = br.readLine();
                set.add(name);
            } else {
                String name = br.readLine();
                if (set.contains(name)) {
                    list.add(name);
                    count++;
                }
            }
        }
        Collections.sort(list);
        bw.write(count + "\n");

        for (String name : list) {
            bw.write(name + "\n");
        }
        bw.flush();
    }
}
