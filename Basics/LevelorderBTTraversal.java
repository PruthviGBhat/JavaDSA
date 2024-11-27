import java.util.*;

// Definition for a binary tree node.
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

class LevelorderBTTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);       
        while (!q.isEmpty()) {
            int count = q.size();
            List<Integer> level = new ArrayList<>();          
            for (int i = 0; i < count; i++) {
                TreeNode node = q.remove();
                level.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }   
                if (node.right != null) {
                    q.add(node.right);
                }
            }         
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        LevelorderBTTraversal solution = new LevelorderBTTraversal();

        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform level order traversal
        List<List<Integer>> result = solution.levelOrder(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.print(level);
        }
    }
}