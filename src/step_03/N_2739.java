package step_03;

import java.util.Scanner;

public class N_2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}
