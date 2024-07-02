import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class N_9934 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bf.readLine());
        String[] values = bf.readLine().split(" ");

        int length = (int) Math.pow(2, K) - 1;
        int[] tree = new int[length];
        List<Integer> index = new ArrayList<>();

        inOrder(length, index, 0);

        for (int i = 0; i < length; i++) {
            tree[index.get(i)] = Integer.parseInt(values[i]);
        }

        printTree(tree);
    }

    private static void inOrder(int length, List<Integer> list, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if (left < length) {
            inOrder(length, list, left);
        }

        list.add(index);

        if (right < length) {
            inOrder(length, list, right);
        }
    }

    private static void printTree(int[] tree) {
        int depth = 1;
        for (int i = 0; i < tree.length; i++) {
            if (Integer.bitCount(i + 1) == 1 && i != 0) {
                System.out.println();
            }
            System.out.printf("%d ", tree[i]);
        }
    }
}
