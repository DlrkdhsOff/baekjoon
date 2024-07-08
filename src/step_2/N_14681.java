package step_2;

import java.util.Scanner;

public class N_14681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.nextLine();

        System.out.println(x > 0 ? y > 0 ? 1 : 4 : y < 0 ? 3 : 2);
    }
}
