import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class PreorderBTTraversal {
    List<Integer> l = new ArrayList<>(); 
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return l;
    }
    public void preorder(TreeNode root){
        if(root==null){
            return ;
        }
        l.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        PreorderBTTraversal pre = new PreorderBTTraversal();

        // Creating the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Performing preorder traversal
        List<Integer> result = pre.preorderTraversal(root);

        // Printing the result
        System.out.println("Preorder Traversal: " + result);
    }
}