package step_02;

import java.util.Scanner;

public class N_1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        scan.nextLine();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
