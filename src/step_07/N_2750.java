package step_07;

import java.util.*;

public class N_2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int loop = scan.nextInt();


        for (int i = 0; i < loop; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);

        for (int num : list) {
            System.out.println(num);
        }
    }
}
