package Linkedlist_;

public class FindMiddle {
    public static Node head = null;

    // slow fast approach
    public static Node middle() {
        if (head == null) {
            return head;
        } else {
            Node slow = head;
            Node fast = head;
            while (slow != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(0);
        Node temp = head;
        for (int i = 1; i <= 10; i++) {
            Node node = new Node(i);
            temp.next = node;
            temp = temp.next;
        }
        print();
        System.out.println("This middle node in this linked list is = " + middle().data);
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}