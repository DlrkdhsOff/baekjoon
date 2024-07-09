package step_03;

import java.io.*;

public class N_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(" ");

            bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
        }
        bw.flush();
    }
}
