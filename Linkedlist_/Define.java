package Linkedlist_;

public class Define {
    public static Node head = null;

    public static void main(String[] args) {
        Node A = new Node(1);
        head = A;
        Node B = new Node(2);
        Node C = new Node(3);
        A.next = B;
        B.next = C;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
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
