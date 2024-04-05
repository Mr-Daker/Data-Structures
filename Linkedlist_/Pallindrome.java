package Linkedlist_;

public class Pallindrome {
    public static Node head = null;

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean pallindrome() {
        if (head == null) {
            return true;
        } else {
            // find middle

        }
    }

    public static void main(String[] args) {
        head = new Node(0);
        Node temp = head;
        for (int i = 1; i <= 10; i++) {
            Node node = new Node(i * 3);
            temp.next = node;
            temp = temp.next;
        }
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