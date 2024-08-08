package step_10;

import java.io.*;

public class N_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == 60 && b == 60 && c == 60) {
            bw.write("Equilateral\n");
        } else if (a + b + c == 180) {
            if (a == b || a == c || b == c) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
        } else {
            bw.write("Error\n");
        }
        bw.flush();
    }
}