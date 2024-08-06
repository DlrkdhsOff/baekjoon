package step_08;

import java.io.*;

public class N_2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        int[] money = {25, 10, 5, 1};

        for (int i = 0; i < loop; i++) {
            int pay = Integer.parseInt(br.readLine());
            int[] result = new int[4];

            for (int j = 0; j < money.length; j++) {
                while (pay >= money[j]) {
                    pay -= money[j];
                    result[j]++;
                }
            }

            for (int n : result) {
                bw.write(n + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
