package step_05;

import java.util.Scanner;

public class N_11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        int result = 0;
        for (String s : str.split("")) {
            result += Integer.parseInt(s);
        }
        System.out.println(result);
    }
}
