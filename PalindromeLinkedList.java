class Node {
    Node next;
    int data;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

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

    public boolean isPalindrome() {
        Node slow = head;
        Node fast = head;
        Node curr = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        while (slow != null) {
            Node realnext = slow.next;
            slow.next = prev;
            prev = slow;
            slow = realnext;
        }

        while (prev != null) {
            if (curr.data != prev.data) {
                return false;
            }
            curr = curr.next;
            prev = prev.next;
        }
        return true;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addElementAtLast(1);
        list.addElementAtLast(2);   
        list.addElementAtLast(2);
        list.addElementAtLast(1);
        System.out.println(list.isPalindrome());
    }
}
