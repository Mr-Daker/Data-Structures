package Linkedlist_;

public class RemoveLast {
    public static Node head = null;

    public static int removeLast() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return -1;
        } else {
            Node temp = head;
            Node prv = temp;
            while (temp.next != null) {
                prv = temp;
                temp = temp.next;
            }
            int data = temp.data;
            prv.next = null;
            return data;
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
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        print();
        removeLast();
        print();
        removeLast();
        print();
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
