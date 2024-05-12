//DFS와 BFS 성공
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//2 초	128 MB	285843	111724	66395	37.776%
//문제
//그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단,
// 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
// 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
//
//입력
//첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000),
// 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
// 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
//
//출력
//첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
//
//예제 입력 1
//4 5 1
//1 2
//1 3
//1 4
//2 4
//3 4
//예제 출력 1
//1 2 4 3
//1 2 3 4
//예제 입력 2
//5 5 3
//5 4
//5 2
//1 2
//3 4
//3 1
//예제 출력 2
//3 1 2 5 4
//3 1 4 2 5
//예제 입력 3
//1000 1 1000
//999 1000
//예제 출력 3
//1000 999
//1000 999

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
