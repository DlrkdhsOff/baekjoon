package step_04;

import java.util.*;

public class N_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int each = scan.nextInt();

        for (int i = 0; i < each; i++) {
            list.add(scan.nextInt());
        }

        Collections.sort(list);
        int max = list.get(each - 1);
        double total = 0;

        for (int i : list) {
            total += ((double) i / max) * 100;
        }



        System.out.println(total/each);
    }
}
