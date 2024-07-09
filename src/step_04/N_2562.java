package step_04;

import java.io.*;

public class N_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        int i = 1;
        int[] arr = new int[2];
        while ((str = br.readLine()) != null) {
            if (arr[0] < Integer.parseInt(str)) {
                arr[0] = Integer.parseInt(str);
                arr[1] = i;
            }
            i++;
        }
        bw.write(arr[0] + "\n");
        bw.write(arr[1] + "\n");
        bw.flush();
    }
}
