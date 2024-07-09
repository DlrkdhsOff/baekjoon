package step_06;

import java.util.*;

public class N_1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Map<String, Integer> map = new HashMap<>();

        for (String s : str.split("")) {
            String upper = s.toUpperCase();
            if (map.containsKey(upper)) {
                map.put(upper, map.get(upper) + 1);
            } else {
                map.put(upper, 1);
            }
        }

        int maxCount = 0;
        String key = null;
        boolean check = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                key = entry.getKey();
                check = false;
            } else if (entry.getValue() == maxCount) {
                key = "?";
                check = true;
            }
        }
        System.out.println(key);

    }
}