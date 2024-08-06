package step_08;

import java.io.*;

public class N_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int day = Integer.parseInt(input[0]);
        int night = Integer.parseInt(input[1]);
        int length = Integer.parseInt(input[2]);

        int result = (int)Math.ceil((double)(length - day) / (day - night)) + 1;

        bw.write(result + "\n");
        bw.flush();
    }
}
