package step_07;

import java.util.Scanner;

public class N_2566 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = Integer.MIN_VALUE;
        String index = "";


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int data = scan.nextInt();
                if (result < data) {
                    result = data;
                    index = i + " " + j;
                }
            }
        }

        System.out.println(result);
        System.out.println(index);
    }
}
