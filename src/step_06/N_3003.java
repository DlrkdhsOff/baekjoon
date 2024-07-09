package step_06;

import java.util.Scanner;

public class N_3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int c : chess) {
            System.out.println(c - scan.nextInt());
        }
        scan.close();
    }
}
