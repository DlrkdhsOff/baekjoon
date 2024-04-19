import java.util.*;

public class N_1021 {
    public static void main(String[] args) {

        int n = 10;
        int m = 3;
        int[] arr = {2, 5, 9};

        int count = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        for (int i = 0; i < m; i++) {
            int index = 0;

            for (int j = 0; j < deque.size(); j++) {
                if (deque.toArray()[j].equals(arr[i])) {
                    index = j;
                    break;
                }
            }

            int left = index;
            int right = deque.size() - index;

            if (left < right) {
                for (int j = 0; j < left; j++) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            }else{
                for (int j = 0; j < right; j++) {
                    deque.offerLast(deque.peekLast());
                    count++;
                }
            }

        }
        System.out.println(count);
    }

}
