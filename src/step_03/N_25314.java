package step_03;

import java.util.Scanner;

public class N_25314 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        for (int i = 0; i < (num / 4); i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
