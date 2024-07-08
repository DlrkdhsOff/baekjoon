package step_01;

import java.util.Scanner;

public class N_2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        scan.nextLine();
        StringBuilder sb = new StringBuilder(scan.nextLine());
        sb.reverse();

        for (String num : sb.toString().split("")) {
            System.out.println(a * Integer.parseInt(num));
        }

        System.out.println(a * Integer.parseInt(sb.reverse().toString()));
    }
}
