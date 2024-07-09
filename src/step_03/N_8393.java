package step_03;

import java.util.Scanner;

public class N_8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int each = scan.nextInt();
        scan.close();
        int num = 0;

        for (int i = 1; i <= each; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
