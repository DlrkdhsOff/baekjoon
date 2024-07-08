package other;//이진 검색 트리 성공다국어
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	45842	17938	12573	37.808%
//문제
//이진 검색 트리는 다음과 같은 세 가지 조건을 만족하는 이진 트리이다.
//
//노드의 왼쪽 서브트리에 있는 모든 노드의 키는 노드의 키보다 작다.
//노드의 오른쪽 서브트리에 있는 모든 노드의 키는 노드의 키보다 크다.
//왼쪽, 오른쪽 서브트리도 이진 검색 트리이다.
//
//
//전위 순회 (루트-왼쪽-오른쪽)은 루트를 방문하고, 왼쪽 서브트리,
// 오른쪽 서브 트리를 순서대로 방문하면서 노드의 키를 출력한다.
// 후위 순회 (왼쪽-오른쪽-루트)는 왼쪽 서브트리, 오른쪽 서브트리,
// 루트 노드 순서대로 키를 출력한다. 예를 들어, 위의 이진 검색 트리의 전위 순회 결과는 50 30 24 5 28 45 98 52 60 이고,
// 후위 순회 결과는 5 28 24 45 30 60 52 98 50 이다.
//
//이진 검색 트리를 전위 순회한 결과가 주어졌을 때, 이 트리를 후위 순회한 결과를 구하는 프로그램을 작성하시오.
//
//입력
//트리를 전위 순회한 결과가 주어진다. 노드에 들어있는 키의 값은 106보다 작은 양의 정수이다.
// 모든 값은 한 줄에 하나씩 주어지며, 노드의 수는 10,000개 이하이다. 같은 키를 가지는 노드는 없다.
//
//출력
//입력으로 주어진 이진 검색 트리를 후위 순회한 결과를 한 줄에 하나씩 출력한다.
//
//예제 입력 1
//50
//30
//24
//5
//28
//45
//98
//52
//60
//예제 출력 1
//5
//28
//24
//45
//30
//60
//52
//98
//50

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BinaryNode {
    int item;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int item) {
        this.item = item;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    BinaryNode head;

    public void addNode(int item) {
        if (this.head == null) {
            this.head = new BinaryNode(item);
        } else {
            addNode(this.head, item);
        }
    }

    private void addNode(BinaryNode node, int item) {
        if (item < node.item) {
            if (node.left == null) {
                node.left = new BinaryNode(item);
            } else {
                addNode(node.left, item);
            }
        } else {
            if (node.right == null) {
                node.right = new BinaryNode(item);
            } else {
                addNode(node.right, item);
            }
        }
    }

    public void postOrder(BinaryNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.item + " ");
        }
    }
}

public class N_5639 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        BinarySearchTree bt = new BinarySearchTree();
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            bt.addNode(Integer.parseInt(line));
        }

        bt.postOrder(bt.head);
    }
}