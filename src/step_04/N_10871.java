package step_04;

import java.io.*;

public class N_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = br.readLine().split(" ");
        String[] arr = br.readLine().split(" ");
        for (String n : arr) {
            if (Integer.parseInt(n) < Integer.parseInt(data[1])) {
                bw.write(n + " ");
            }
        }
        bw.flush();
    }
}
