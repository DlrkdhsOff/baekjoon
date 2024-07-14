package step_17;

import java.io.*;
import java.util.*;

public class N_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            long result = combination(M, N);

            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static long combination(int n, int r) {
        if (r > n / 2) {
            r = n - r;  // C(n, r) == C(n, n-r)
        }
        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}