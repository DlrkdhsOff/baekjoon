package step_08;

import java.io.*;
import java.util.*;

public class N_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (map.containsKey(s[0]) && s[1].equals("leave")) {
                map.remove(s[0]);
            }
            map.put(s[0], s[1]);
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals("enter")) {
                list.add((String) entry.getKey());
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
    }
}
