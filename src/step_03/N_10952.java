package step_03;

import java.io.*;

public class N_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] arr = br.readLine().split(" ");
            if (Integer.parseInt(arr[0]) == 0 && Integer.parseInt(arr[1]) == 0) {
                break;
            }

            bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
        }
        bw.flush();
    }
}
