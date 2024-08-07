package step_10;

import java.io.*;

public class N_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long num = Long.parseLong(br.readLine());

        bw.write(num * 4 + "\n");
        bw.flush();
    }
}
