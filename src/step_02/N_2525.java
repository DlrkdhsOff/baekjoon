package step_02;

import java.util.*;

public class N_2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();
        int end = scan.nextInt();
        scan.nextLine();

        hour += (min + end) / 60;
        min = (min + end) % 60;

        if (hour >= 24) {
            hour -= 24;
        }

        System.out.printf("%d %d", hour, min);
    }
}
