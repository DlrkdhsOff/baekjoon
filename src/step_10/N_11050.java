package step_10;

import java.io.*;
import java.util.StringTokenizer;

public class N_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer t = new StringTokenizer(s);
        int[] C = new int[2];
        C[0] = Integer.parseInt(t.nextToken());
        C[1] = Integer.parseInt(t.nextToken());

        int N = fact(C[0], 1);
        int K = fact(C[1], 1);
        int M = fact(C[0] - C[1], 1);

        int result = N / (K * M);

        bw.write(result + "\n");
        bw.flush();
    }

    public static int fact(int n, int result) {
        if (n < 1) {
            return result;
        }
        return fact(n - 1, result * n);
    }
}
