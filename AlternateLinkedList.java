
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    
    public void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public void addElementAtLast(int data) {
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
    public void task(){
        Node curr=head;
        int a=curr.data;
        int b=curr.next.data;
        Node temp = curr.next.next;
        while(temp!=null){
            int c=temp.data;
            temp.data=c+a;
            a=b;
            b=temp.data;
            temp=temp.next;
        }
    }
}
   
public class AlternateLinkedList{
	 public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElementAtLast(50);
        ll.addElementAtLast(80);
        ll.addElementAtLast(70);
        ll.addElementAtLast(60);
        ll.addElementAtLast(40);
        ll.addElementAtLast(100);
        ll.task();
        ll.display();
    }
}