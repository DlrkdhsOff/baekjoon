package step_04;

import java.io.*;

public class N_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = br.readLine().split(" ");
        String[] arr = new String[Integer.parseInt(data[0])];
        for (int i = 1; i <= Integer.parseInt(data[0]); i++) {
            arr[i - 1] = String.valueOf(i);
        }

        for (int i = 0; i < Integer.parseInt(data[1]); i++) {
            String s = "";
            String[] n = br.readLine().split(" ");
            s = arr[Integer.parseInt(n[0]) - 1];
            arr[Integer.parseInt(n[0]) - 1] = arr[Integer.parseInt(n[1]) - 1];
            arr[Integer.parseInt(n[1]) - 1] = s;
        }

        for (String n : arr) {
            bw.write(n + " ");
        }
        bw.flush();
    }
}
