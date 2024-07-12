class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void removenthnode(int nth_index){
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        int steps = count - nth_index;
        if(steps == 0){
            head = head.next;
        }
        curr = head;
        for(int i=0;i<steps;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    void addElement(int data) {
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

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class RemoveNthNode {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElement(10);
        ll.addElement(20);
        ll.addElement(30);
        ll.addElement(40);
        ll.display();
        ll.removenthnode(2);
    }
}
