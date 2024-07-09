package step_04;

import java.util.*;

public class N_5597 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);

        int i = 1;
        while (i <= 30) {
            if (!list.contains(i)) {
                System.out.println(i);
            }
            i++;
        }

        scan.close();
    }
}
