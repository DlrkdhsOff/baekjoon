package step_16;
import java.io.*;
import java.util.*;

public class N_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<List<Integer>> q = new ArrayDeque<>();

        int balloon = Integer.parseInt(br.readLine());
        String[] index = br.readLine().split(" ");

        for (int i = 0; i < balloon; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i + 1); // 풍선 번호
            list.add(Integer.parseInt(index[i])); // 종이에 적힌 이동 수
            q.offerLast(list);
        }

         while (q.size() > 1) {
            List<Integer> list = q.pollFirst();
            bw.write(list.get(0) + " ");
            int move = list.get(1);

            if (move > 0) {
                // 양수 이동: 정방향 이동 (move - 1) 번만큼
                for (int j = 1; j < move; j++) {
                    q.addLast(q.pollFirst());
                }
            } else {
                // 음수 이동: 역방향 이동 |move| 번만큼
                for (int j = 0; j < -move; j++) {
                    q.addFirst(q.pollLast());
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
