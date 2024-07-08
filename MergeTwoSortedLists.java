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

    void merge(Node list1, Node list2) {
        Node head = null;
        Node ptr = null;

        if (list1 == null)
            System.out.println("List2 is sorted");
        if (list2 == null)
            System.out.println("List1 is sorted");
        while (list1 != null && list2 != null) {
            if (head == null) {
                if (list1.data < list2.data) {
                    ptr = head = list1;
                    list1 = list1.next;
                }else{
                    ptr = head = list2;
                    list2 = list2.next;
                }
                continue;
            }
            if (list1.data < list2.data) {
                ptr.next = list1;
                ptr = ptr.next;
                list1 = list1.next;
            }
            else{
                ptr.next = list2;
                ptr = ptr.next;
                list2 = list2.next;
            }
        }
        if(list1 != null)
            ptr.next = list1;
        if(list2 != null)
            ptr.next = list2;
        
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

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.addElement(10);
        ll1.addElement(20);
        ll2.addElement(30);
        ll2.addElement(40);
        ll1.display();
        ll2.display();

    }
}
