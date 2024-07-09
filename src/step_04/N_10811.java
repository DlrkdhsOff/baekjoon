package step_04;

import java.util.*;

public class N_10811 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            int start = scan.nextInt() - 1;
            int end = scan.nextInt();
            List<Integer> sublist = list.subList(start, end);
            Collections.reverse(sublist);
        }

        for (int i : list) {
            System.out.printf("%d ", i);
        }
        scan.close();
    }
}