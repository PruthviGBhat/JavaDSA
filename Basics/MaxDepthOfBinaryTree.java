import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
 class BinaryTree{
    static int index=-1;
    public static Node buildTree(int arr[]){
        index++;
        if(index >= arr.length ||arr[index]==-1){
            return null;
        }
        Node newnode = new Node(arr[index]);
        newnode.left=buildTree(arr);
        newnode.right=buildTree(arr);
        return newnode;
    }
    public static int maxdepth(Node root){
        if(root==null){
            return -1;
        }
        int leftheight=maxdepth(root.left);
        int rightheight=maxdepth(root.right);
         int totalh=Math.max(leftheight,rightheight)+1;
        return totalh;
    }
}

public class MaxDepthOfBinaryTree
{
	public static void main(String[] args) {
		int arr[]={3,9,20,-1,-1,15,7};
		BinaryTree bt = new BinaryTree();
		Node root=bt.buildTree(arr);
		int finalresult = bt.maxdepth(root);
		System.out.println(finalresult);
	}
}
