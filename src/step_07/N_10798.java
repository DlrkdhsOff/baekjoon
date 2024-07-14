package step_07;

import java.util.*;

public class N_10798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<List<String>> str = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String[] data = scan.nextLine().split("");
            List<String> list = new ArrayList<>(Arrays.asList(data));
            str.add(list);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < str.get(j).size()) {
                    result.append(str.get(j).get(i));
                }
            }
        }

        System.out.print(result.toString());
    }
}
