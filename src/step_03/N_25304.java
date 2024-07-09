package step_03;

import java.util.Scanner;

public class N_25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();
        int each = scan.nextInt();
        int result = 0;

        for (int i = 0; i < each; i++) {
            result += scan.nextInt() * scan.nextInt();
        }

        if (total == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
