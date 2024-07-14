package step_17;

import java.io.*;

public class N_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(fact(n, 1) + "\n");
        bw.flush();
    }

    public static int fact(int n, int result) {
        if (n < 1) {
            return result;
        }

        return fact(n - 1, result * n);
    }
}
