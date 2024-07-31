package step_06;

import java.util.Scanner;

public class N_2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = {
                "c=", "c-", "dz=", "d-",
                "lj", "nj", "s=", "z="
        };

        String str = scan.nextLine();

        int count = 0;
        for (String s : arr) {
            while (str.contains(s)) {
                str = str.replaceFirst(s, "0");
            }
        }

        System.out.println(str.length());
    }
}