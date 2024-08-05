package step_09;

import java.io.*;

public class N_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int result = 0;
        for (String str : input) {
            if (isPrime(Integer.parseInt(str))) {
                result++;
            }
        }

        bw.write(result + "\n");
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
