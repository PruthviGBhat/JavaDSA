import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();

    Node(int data) {
        this.data = data;
    }
}

class tree {
    public static Node construct(int arr[]) {
        Node root = null;
        Stack<Node> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else{
                Node newnode = new Node(arr[i]);
                if(st.size()==0){
                    root=newnode;
                }else{
                    st.peek().children.add(newnode);
                }
                st.push(newnode);
            }
        }
        return root;
    }
    public static void displayRecursive(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ->");
        for(Node child:root.children){
            System.out.print(child.data+" ->");
        }
        System.out.println(" ");
        for(Node child:root.children){
            displayRecursive(child);
        }
    }
    public static boolean findelement(int data,Node node){
        if(node.data == data){
            return true;
        }
        for(Node child:node.children){
            boolean found=findelement(data,child);
            if(found){
                return true;
            }
        }
        return false;
    }

}

public class FindElementInTree {

    public static void main(String[] args) {
        tree t = new tree();
        int[] arr = { 10, 20, -1, 30, -1, 40, -1, -1 };
        Node root = t.construct(arr);
        t.displayRecursive(root);
        System.out.println(t.findelement(40,root););
    }
}