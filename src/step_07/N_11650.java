package step_07;

import java.io.*;
import java.util.*;

public class N_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int each = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < each; i++) {
            int[] arr = new int[2];
            String s = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(s);

            arr[0] = Integer.parseInt(tokenizer.nextToken());
            arr[1] = Integer.parseInt(tokenizer.nextToken());
            list.add(arr);
        }

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }
            }
        });

        for (int[] a : list) {
            bw.write(a[0] + " " + a[1] + "\n");
        }
        bw.flush();
    }
}