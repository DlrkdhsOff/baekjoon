package step_06;

import java.util.Scanner;

public class N_10988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());

        if (sb.toString().contentEquals(sb.reverse())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
