package step_07;

import java.util.*;

public class N_1181 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();

        Set<String> wordsSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String word = scan.nextLine();
            wordsSet.add(word);
        }

        List<String> list = new ArrayList<>(wordsSet);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (String word : list) {
            System.out.println(word);
        }

    }
}
