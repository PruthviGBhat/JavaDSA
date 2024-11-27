import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class PostorderBTTraversal {
    List<Integer> l = new ArrayList<>();

    public List<Integer> PostorderTraversal(TreeNode root) {
        if (root == null) {
            return l;
        }
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        l.add(root.val);
        return l;
    }

    public static void main(String[] args) {
        PostorderBTTraversal in = new PostorderBTTraversal();

        // Creating the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Performing inorder traversal
        List<Integer> result = in.PostorderTraversal(root);

        // Printing the result
        System.out.println("post Traversal: " + result);
    }
}