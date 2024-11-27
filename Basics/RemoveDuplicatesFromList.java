class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head;

    public void addElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public void removeduplicates() {
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            if(prev.data==curr.data){
                prev.next=curr.next;
                curr=curr.next;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
    }

}
public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //sorted list
        ll.addElement(1);
        ll.addElement(1);
        ll.addElement(2);
        ll.addElement(3);
        ll.addElement(3);
        ll.removeduplicates();
        ll.display();
        
    }
}
