package step_05;

import java.util.Scanner;

public class N_2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder a = new StringBuilder(scan.next()).reverse();
        StringBuilder b = new StringBuilder(scan.next()).reverse();
        scan.nextLine();

        System.out.println(Math.max(Integer.parseInt(a.toString()), Integer.parseInt(b.toString())));
    }
}
