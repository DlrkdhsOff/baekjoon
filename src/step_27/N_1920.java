package step_27;

import java.io.*;
import java.util.*;

public class N_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int[] x1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int B = Integer.parseInt(br.readLine());
        int[] x2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(x1);

        for (int s : x2) {
            if (binarySearch(x1, s)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
    }

    public static boolean binarySearch(int[] x, int target) {
        int left = 0;
        int right = x.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == x[mid]) {
                return true;
            } else if (target < x[mid]) {
                right = mid - 1;
            } else if (x[mid] < target) {
                left = mid + 1;
            }
        }
        return false;
    }
}