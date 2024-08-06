package step_08;

import java.util.Scanner;

public class N_2745 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.next();
        int B = scan.nextInt();

        int result = 0;

        int length = N.length();

        for (int i = 0; i < length; i++) {
            char ch = N.charAt(i);
            int digitValue;

            if ('0' <= ch && ch <= '9') {
                digitValue = ch - '0';
            } else {
                digitValue = ch - 'A' + 10;
            }

            result = result * B + digitValue;
        }

        System.out.println(result);
    }
}
