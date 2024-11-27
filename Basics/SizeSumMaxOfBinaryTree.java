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
    public static Node buildtree(int arr[]){
        index++;
        if(index >= arr.length || arr[index] == -1){
            return null;
        }
        Node newnode = new Node(arr[index]);
        newnode.left=buildtree(arr);
        newnode.right=buildtree(arr);
        return newnode;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        int tsum = lsum+rsum+root.data;
        return tsum;
    }
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        int lsize=size(root.left);
        int rsize=size(root.right);
        int tsize=lsize+rsize+1;
        return tsize;
    }
    public static int maxnode(Node root){
        if(root==null){
            return 0;
        }
        int lmax=maxnode(root.left);
        int rmax=maxnode(root.right);
        int tmax=Math.max(root.data,Math.max(lmax,rmax));
        return tmax;
    }
}
public class SizeSumMaxOfBinaryTree
{
	public static void main(String[] args) {
		int arr[]={3,9,20,-1,-1,15,7};
		BinaryTree bt = new BinaryTree();
		Node root=bt.buildtree(arr);
        System.out.println(bt.sum(root));
        System.out.println(bt.size(root));
        System.out.println(bt.maxnode(root));
	}
}