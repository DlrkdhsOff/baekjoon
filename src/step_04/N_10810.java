package step_04;

import java.io.*;

public class N_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = br.readLine().split(" ");
        String[] arr = new String[Integer.parseInt(data[0])];

        for (int i = 0; i < Integer.parseInt(data[1]); i++) {
            String[] n = br.readLine().split(" ");
            for (int j = Integer.parseInt(n[0]) - 1; j < Integer.parseInt(n[1]); j++) {
                arr[j] = n[2];
            }
        }

        for (String n : arr) {
            if (n == null) {
                bw.write("0 ");
            }else {
                bw.write(n + " ");
            }
        }
        bw.flush();
    }
}
