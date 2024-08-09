package step_25;

import java.io.*;
import java.util.Arrays;

public class N_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people = Integer.parseInt(br.readLine());
        int[] time = new int[people];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < people; i++) {
            time[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(time);

        int total = 0;
        int num = 0;
        for (int t : time) {
            total += (num += t);
        }

        bw.write(total + "\n");
        bw.flush();
    }
}
