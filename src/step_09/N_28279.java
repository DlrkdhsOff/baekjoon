package step_09;

import java.io.*;
import java.util.*;

public class N_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> q = new ArrayDeque<>();

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            switch (input[0]) {
                case 1:
                    q.offerFirst(input[1]);
                    break;
                case 2:
                    q.offerLast(input[1]);
                    break;
                case 3:
                    bw.write((q.isEmpty()?-1 : q.pollFirst()) + "\n");
                    break;
                case 4:
                    bw.write((q.isEmpty()?-1 : q.pollLast()) + "\n");
                    break;
                case 5:
                    bw.write(q.size() + "\n");
                    break;
                case 6:
                    bw.write((q.isEmpty() ? 1 : 0) + "\n");
                    break;
                case 7:
                    bw.write((q.isEmpty()?-1 : q.peekFirst()) + "\n");
                    break;
                case 8:
                    bw.write((q.isEmpty()?-1 : q.peekLast()) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
