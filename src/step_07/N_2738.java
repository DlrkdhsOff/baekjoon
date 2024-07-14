package step_07;

import java.util.Scanner;

public class N_2738 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int c = scan.nextInt();

        int[][] A = init(r, c, scan);
        int[][] B = init(r, c, scan);

        int[][] result = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int[] b : result) {
            for (int data : b) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }

    public static int[][] init(int r, int c, Scanner scan) {
        int[][] data = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                data[i][j] = scan.nextInt();
            }
        }

        return data;
    }
}
