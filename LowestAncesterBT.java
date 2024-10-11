// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class LowestAncester {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==root || q==root){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }else if(left!=null){
            return left;
        }else{
            return right;
        }
    }

    public static void main(String[] args) {
        LowestAncester la = new LowestAncester();

        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Find the LCA of nodes 4 and 5
        TreeNode p = root.left.left;
        TreeNode q = root.left.right;
        TreeNode lca = la.lowestCommonAncestor(root, p, q);

        // Print the LCA
        if (lca != null) {
            System.out.println("The LCA of nodes 4 and 5 is " + lca.val);
        } else {
            System.out.println("The LCA of nodes 4 and 5 does not exist");
        }
    }
}
