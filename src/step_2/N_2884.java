package step_2;

import java.util.Scanner;

public class N_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int min = scan.nextInt();
        scan.nextLine();

        if (min >= 45) {
            System.out.printf("%d %d" , hour, min - 45);
        } else {
            if (hour == 0) {
                System.out.printf("%d %d" , 23, min += (60 - 45));
            } else {
                System.out.printf("%d %d" , hour -= 1, min += (60 - 45));
            }

        }
    }
}
