package step_05;

import java.util.Scanner;

public class N_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int index = 0;

        for (int i = 97; i <= 122; i++) {
            if (s.contains(String.valueOf((char) i))) {
                System.out.printf("%d ", s.indexOf((char) i));
            } else {
                System.out.printf("%d ", -1);
            }
        }

    }
}
// a = 97
// z = 122