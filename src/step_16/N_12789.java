package step_16;

import java.util.*;

public class N_12789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            queue.offer(scan.nextInt());
        }

        int current = 1;
        while (!queue.isEmpty() || !stack.isEmpty()) {
            if (!queue.isEmpty() && queue.peek() == current) {
                queue.poll();
                current++;
            } else if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
                current++;
            } else if (!queue.isEmpty()) {
                stack.push(queue.poll());
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
