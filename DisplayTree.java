import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();

    Node(int data) {
        this.data = data;
    }
}
class Tree{
    public static Node construct(int[] arr) {
        Node root = null;
        Stack<Node> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                stack.pop();
            } else {
                Node newNode = new Node(arr[i]);
                if (!stack.isEmpty()) {
                    stack.peek().children.add(newNode);
                } else {
                    root = newNode;
                }
                stack.push(newNode);
            }
        }

        return root;
    }

    // Display using recursion
    public static void displayRecursive(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        for (Node child : node.children) {
            System.out.print(child.data + " ");
        }
        System.out.println();
        for (Node child : node.children) {
            displayRecursive(child);
        }
    }

   
}
public class DisplayTree {
       public static void main(String[] args) {
        Tree t = new Tree();
        int[] arr = {10, 20, -1, 30, -1, 40, -1, -1};
        Node root = t.construct(arr);

        System.out.println("Displaying tree recursively:");
        t.displayRecursive(root);
    }
}
