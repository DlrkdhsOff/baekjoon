package step_03;

import java.util.Scanner;

public class N_10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(scan.nextInt() + scan.nextInt());
        }
        scan.close();
    }
}
