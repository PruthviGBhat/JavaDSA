import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        if (root == null) {
            return li;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean flag = false;

        while (q.size() > 0) {
            List<Integer> inli = new ArrayList<>(); // Using LinkedList with generics
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (flag) {
                    inli.add(0, node.val); // Add to the beginning of the list
                } else {
                    inli.add(node.val);
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            flag = !flag;
            li.add(inli);
        }
        return li;
    }
}

public class ZigzagLevelOrder {  
    public static void main(String[] args) {
        // Create a binary tree for testing
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Create an instance of Solution
        Traversal solution = new Traversal();

        // Get the zigzag level order traversal
        List<List<Integer>> result = solution.zigzagLevelOrder(root);

        // Print the result
        System.out.println(result);
    }
}