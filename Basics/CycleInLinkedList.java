class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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

public class CycleInLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElementAtLast(10);
        ll.addElementAtLast(20);
        ll.addElementAtLast(30);
        ll.addElementAtLast(40);

        // Creating a cycle for testing
        ll.head.next.next.next.next = ll.head;

        boolean hasCycle = ll.hasCycle(ll.head);
        System.out.println("Linked List has cycle: " + hasCycle);
    }
}
