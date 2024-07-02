import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class N_2263 {
    private static int[] inOrder;
    private static int[] postOrder;
    private static int[] preOrder;
    private static Map<Integer, Integer> inOrderMap;
    private static int preOrderIndex;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        inOrder = new int[n];
        postOrder = new int[n];
        preOrder = new int[n];
        inOrderMap = new HashMap<>();

        String[] inOrderInput = br.readLine().split(" ");
        String[] postOrderInput = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            inOrder[i] = Integer.parseInt(inOrderInput[i]);
            inOrderMap.put(inOrder[i], i);
            postOrder[i] = Integer.parseInt(postOrderInput[i]);
        }

        preOrderIndex = 0;
        constructPreOrder(0, n - 1, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(preOrder[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    private static void constructPreOrder(int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return;
        }

        int rootValue = postOrder[postEnd];
        preOrder[preOrderIndex++] = rootValue;

        int rootIndex = inOrderMap.get(rootValue);
        int leftSubtreeSize = rootIndex - inStart;

        constructPreOrder(inStart, rootIndex - 1, postStart, postStart + leftSubtreeSize - 1);
        constructPreOrder(rootIndex + 1, inEnd, postStart + leftSubtreeSize, postEnd - 1);
    }
}