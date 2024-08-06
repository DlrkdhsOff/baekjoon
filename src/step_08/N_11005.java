package step_08;

import java.util.Scanner;

public class N_11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scan.nextInt();
        int B = scan.nextInt();
        scan.nextLine();

        while (N > 0) {
            int num = N % B;

            char digit;
            if (num < 10) {
                digit = (char) (num + '0');
            } else {
                digit = (char) ('A' + (num - 10));
            }
            sb.append(digit);
            N /= B;

        }

        System.out.println(sb.toString());
    }
}
