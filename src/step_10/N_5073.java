package step_10;

import java.io.*;
import java.util.*;

public class N_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            Arrays.sort(arr);
            bw.write(func(arr) + "\n");
        }
        bw.flush();
    }

    public static String func(int[] arr) {
        if (arr[2] >= arr[0] + arr[1]) {
            return ("Invalid");
        }

        if (arr[0] == arr[1] && arr[0] == arr[2]) {
            return("Equilateral");
        } else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
                return("Isosceles");
        } else {
            return("Scalene");
        }
    }
}
