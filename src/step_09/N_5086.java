package step_09;

import java.io.*;

public class N_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] input = br.readLine().split(" ");

            if (input[0].equals("0") && input[1].equals("0")) {
                break;
            }

            bw.write(func(input) + "\n");
        }
        bw.flush();
    }

    public static String func(String[] input) {
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (b % a == 0) {
            return "factor";
        } else if (a % b == 0) {
            return "multiple";
        } else {
            return "neither";
        }
    }
}
