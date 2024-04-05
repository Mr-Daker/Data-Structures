package Linkedlist_;

public class RemoveFirst {
    public static Node head = null;

    public static int removefirst() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return -1;
        } else {
            int data = head.data;
            head = head.next;
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
        System.out.println(removefirst());
        print();
        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        print();
        System.out.println("Current First Element removed = " + removefirst());
        print();
        System.out.println("Current First Element removed = " + removefirst());
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
