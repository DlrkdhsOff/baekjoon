package step_08;

import java.io.*;

public class N_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        if (N == 1) {
            bw.write("1\n");
        } else {
            long layer = 1;
            long count = 1;

            while (true) {
                layer += 6 * count;
                count++;

                if (N <= layer) {
                    bw.write(count + "\n");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
