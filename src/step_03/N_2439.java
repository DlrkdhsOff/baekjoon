package step_03;

import java.io.*;

public class N_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int each = Integer.parseInt(br.readLine());

        for (int i = 1; i <= each; i++) {
            for (int j = each; j >= 1 ; j--) {
                if (j > i) {
                    bw.write(" ");
                }else{
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
