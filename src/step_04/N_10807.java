package step_04;

import java.io.*;

public class N_10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int each = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        String v = br.readLine();

        int result = 0;
        for (String n : arr) {
            if (n.equals(v)) {
                result++;
            }
        }
        bw.write(result + "\n");
        bw.flush();
    }
}