package step_22;

import java.util.Scanner;

public class N_15649 {
    static int N, M;
    static int[] sequence;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        sequence = new int[M];
        visited = new boolean[N + 1];

        backtrack(0);
    }

    private static void backtrack(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}
