package step_25;

import java.io.*;
import java.util.*;

public class N_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int meeting = Integer.parseInt(br.readLine());

        int currentTime = 0;
        int[][] meet = new int[meeting][2];

        for (int i = 0; i < meeting; i++) {
            int[] arr = new int[2];

            String[] input = br.readLine().split(" ");
            arr[0] = Integer.parseInt(input[0]);
            arr[1] = Integer.parseInt(input[1]);

            meet[i] = arr;
        }

        Arrays.sort(meet, (x1, x2) -> {
            if (x1[1] == x2[1]) {
                return x1[0] - x2[0];
            }
            return x1[1] - x2[1];
        });

        int result = 0;
        for (int[] arr : meet) {
            if (currentTime <= arr[0]) {
                currentTime = arr[1];
                result++;
            }
        }
        bw.write(result + "\n");
        bw.flush();
    }
}