class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void reverse() {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node realnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = realnext;
        }
        head = prev;
    }

    void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    void addElementAtLast(int data) {
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
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElementAtLast(50);
        ll.addElementAtLast(80);
        ll.addElementAtLast(70);
        ll.display();
        ll.reverse();
        ll.display();
    }
}