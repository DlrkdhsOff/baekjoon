package step_13;

import java.io.*;
import java.util.Arrays;

public class N_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        int[] arr = new int[loop];

        for (int i = 0; i < loop; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int num : arr) {
            bw.write(num + "\n");
        }
        bw.flush();
    }
}
