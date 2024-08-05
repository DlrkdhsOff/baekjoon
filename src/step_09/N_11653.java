package step_09;

import java.io.*;

public class N_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                sb.append(i).append("\n");
                num /= i;
            }
        }

        if (num != 1) {
            sb.append(num);
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
