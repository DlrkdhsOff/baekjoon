package step_08;

import java.io.*;
import java.util.*;

public class N_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> key = new HashMap<>();
        Map<String, String> value = new HashMap<>();

        String str = br.readLine();
        StringTokenizer t = new StringTokenizer(str);

        int name = Integer.parseInt(t.nextToken());
        int p = Integer.parseInt(t.nextToken());


        List<String> list = new ArrayList<>();
        for (int i = 1; i <= name + p; i++) {
            if (i <= name) {
                String pokemon = br.readLine();
                key.put(pokemon, String.valueOf(i));
                value.put(String.valueOf(i), pokemon);
            } else {
                list.add(br.readLine());
            }
        }

        for (String s : list) {
            if (key.containsKey(s)) {
                bw.write(key.get(s) + "\n");
            } else if (value.containsKey(s)) {
                bw.write(value.get(s) + "\n");
            }
        }
        bw.flush();
    }
}
