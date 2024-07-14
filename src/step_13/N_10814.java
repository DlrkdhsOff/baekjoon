package step_13;

import java.util.*;

public class N_10814 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();

        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scan.nextLine().split(" "));
        }

        list.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
                    return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
                } else {
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                }
            }
        });

        for (String[] s : list) {
            System.out.println(s[0] + " " + s[1]);
        }
    }
}
