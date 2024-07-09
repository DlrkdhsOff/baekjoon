package step_05;

import java.util.Scanner;

public class N_1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] s = scan.nextLine().split(" ");
        if (s.length == 0) {
            System.out.println(0);
        } else {
            System.out.println(s[0].isEmpty() ? s.length - 1 : s.length);
        }
    }
}
