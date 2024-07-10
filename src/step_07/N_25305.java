package step_07;

import java.util.*;

public class N_25305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int each = scan.nextInt();
        int n = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < each; i++) {
            list.add(scan.nextInt());
        }

        Collections.sort(list);
        System.out.println(list.get(list.size() - n));
    }
}
