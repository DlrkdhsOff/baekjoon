package step_16;

import java.util.*;

public class N_11866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("<");
        Queue<Integer> q = new LinkedList<>();

        int nums = scan.nextInt();
        int skip = scan.nextInt();

        for (int i = 1; i <= nums; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {

            for (int i = 0; i < skip -1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");

        System.out.println(sb);
    }
}
