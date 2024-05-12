import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N_1260 {

    public static int[][] branch;  // 인접행렬
    public static boolean[] visit; // 방문 배열
    public static Queue<Integer> queue;
    public static int N;    // 정점의 개수
    public static int M;    // 간선의 개수
    public static int V;    // 시작

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        branch = new int[1001][1001]; // 최대크기
        visit = new boolean[1001];

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            branch[x][y] = branch[y][x] = 1;
        }

        dfs(V);
        System.out.println();

        Arrays.fill(visit, false);
        bfs(V);
    }

    public static void dfs(int start) {
        visit[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= N; i++) {
            if (branch[start][i] == 1 && !visit[i]) {
                dfs(i);
            }

        }
    }

    public static void bfs(int start) {
        queue = new LinkedList<Integer>();
        queue.offer(start);
        visit[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i < branch.length; i++) {
                if (branch[temp][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
