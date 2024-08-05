package step_09;

import java.io.*;
import java.util.*;

public class N_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            bw.write("-1\n");
        } else {
            int total = 0;
            for (int i : list) {
                total += i;
            }
            bw.write(total + "\n");
            bw.write(list.get(0) + "\n");
        }
        bw.flush();
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
