import java.util.*;
class Node{
    int data;
    ArrayList<Node> children=new ArrayList<>();
    Node(int data){
        this.data=data;
    }
}
class tree{
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
    public static ArrayList<Integer> nodetopath(Node node,int data){
        if(node.data ==data){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(node.data);
            return al;
        }
        for(Node child:node.children){
            ArrayList<Integer> path=nodetopath(child,data); 
            if(path.size()>0){
                path.add(node.data);
                return path;
            }
        }
        return new ArrayList<>();
    }
    
}

public class NodeToRootPath{
	public static void main(String[] args) {
		tree t = new tree();
		int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,-1,90,-1,-1,40,100,-1,-1,-1};
		Node root=t.construct(arr);
		System.out.println(root.data+" ->");
		t.display(root);
		System.out.println(t.nodetopath(root,100));
	}
}