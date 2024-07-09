package step_02;

import java.util.Scanner;

public class N_2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        scan.nextLine();

        if (a == b && a == c) {
            System.out.println(10000 + (a * 1000));
        }else if (a == b || a == c || b == c){
            int num = a == b ? a : c;
            System.out.println(1000 + (num * 100));
        } else {
            int max = Math.max(Math.max(a, b), c);
            System.out.println(max * 100);
        }
    }
}
