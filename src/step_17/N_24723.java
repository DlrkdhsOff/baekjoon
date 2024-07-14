package step_17;

import java.io.*;

public class N_24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = (int)Math.pow(2, n);

        bw.write(result + "\n");
        bw.flush();
    }
}
