package step_04;

import java.util.*;

public class N_3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(scan.nextInt());
        }

        for (int i : list) {
            set.add(i % 42);
        }

        System.out.println(set.size());
    }
}
