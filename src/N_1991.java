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
