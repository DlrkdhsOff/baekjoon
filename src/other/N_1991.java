package other;//트리 순회 성공
//시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//2 초	128 MB	58477	37872	29207	66.959%
//문제
//이진 트리를 입력받아 전위 순회(preorder traversal),
//중위 순회(inorder traversal),
// 후위 순회(postorder traversal)한 결과를 출력하는 프로그램을 작성하시오.
//
//
//
//예를 들어 위와 같은 이진 트리가 입력되면,
//
//전위 순회한 결과 : ABDCEFG // (루트) (왼쪽 자식) (오른쪽 자식)
//중위 순회한 결과 : DBAECFG // (왼쪽 자식) (루트) (오른쪽 자식)
//후위 순회한 결과 : DBEGFCA // (왼쪽 자식) (오른쪽 자식) (루트)
//가 된다.
//
//입력
//첫째 줄에는 이진 트리의 노드의 개수 N(1 ≤ N ≤ 26)이 주어진다.
//둘째 줄부터 N개의 줄에 걸쳐 각 노드와 그의 왼쪽 자식 노드, 오른쪽 자식 노드가 주어진다.
//노드의 이름은 A부터 차례대로 알파벳 대문자로 매겨지며, 항상 A가 루트 노드가 된다.
//자식 노드가 없는 경우에는 .으로 표현한다.
//
//출력
//첫째 줄에 전위 순회, 둘째 줄에 중위 순회,
// 셋째 줄에 후위 순회한 결과를 출력한다.
// 각 줄에 N개의 알파벳을 공백 없이 출력하면 된다.
//
//예제 입력 1
//7
//A B C
//B D .
//C E F
//E . .
//F . G
//D . .
//G . .

import java.util.*;
import java.io.*;

class Node {
    char key;
    Node left;
    Node right;

    public Node(char key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

}

class Tree {
    Node head;

    public Tree() {
        this.head = new Node('A', null, null);
    }

    public void addNode(Node node, char key, char left, char right) {
        if (node.key == key) {
            node.left = (left == '.' ? null : new Node(left, null, null));
            node.right = (right == '.' ? null : new Node(right, null, null));
        } else {
            if (node.left != null) {
                addNode(node.left, key, left, right);
            }
            if (node.right != null) {
                addNode(node.right, key, left, right);
            }
        }
    }
}


public class N_1991 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        Tree tree = new Tree();

        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char key = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            tree.addNode(tree.head, key, left, right);
        }

        preOrder(tree.head);
        System.out.println();
        inOrder(tree.head);
        System.out.println();
        postOrder(tree.head);

    }

    static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.key);
        inOrder(node.right);
    }

    static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key);
    }
}
