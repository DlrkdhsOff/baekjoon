import java.util.*;

public class N_2164 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            q.poll();
            q.offer(q.poll());
        }

        System.out.println(q.poll());
    }
}
