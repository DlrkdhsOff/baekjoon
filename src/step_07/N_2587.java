package step_07;

import java.util.*;

public class N_2587 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            list.add(n);
            total += n;
        }

        Collections.sort(list);;

        System.out.println(total / 5);
        System.out.println(list.get(2));
    }
}
