import java.util.*;
class Node{
    int data;
    ArrayList<Node> children=new ArrayList<>();
    Node(int data){
        this.data=data;
    }
}

public class MaximumSubtreeSumNode{
     public static Node construct(int arr[]){
        Node root=null;
        Stack<Node>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else{
            Node newnode=new Node(arr[i]);
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

    public static void display(Node node){
        if(node==null){
            return;
        }
        
        for(Node child:node.children){
            System.out.print(child.data+" ->");
        }
        System.out.println();
        for(Node child:node.children){
            display(child);
        }
    }
    static int maxsum=Integer.MIN_VALUE;
    static int maxsumnode=0;
    static int calculatesum(Node node){
        int sum=0;
        for(Node child:node.children){
            int csum=calculatesum(child);
            sum=sum+csum;
        }
        sum=sum+node.data;
        if(sum>maxsum){
            maxsumnode=node.data;
            maxsum=sum;
        }
        return sum;
    }
	public static void main(String[] args) {
		int arr[]={10,20,-50,-1,-60,-1,-1,30,-70,-1,80,-110,-1,120,-1,-1,90,-1,-1,40,-100,-1,-1,-1};
		Node root=construct(arr);
		System.out.println(root.data+" ->");
		display(root);
	    calculatesum(root);
	    System.out.println(maxsumnode+" "+maxsum);
	}
}