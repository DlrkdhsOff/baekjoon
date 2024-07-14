package step_17;

import java.io.*;

public class N_15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = n * (n - 1);

        bw.write(result + "\n");
        bw.flush();
    }
}
