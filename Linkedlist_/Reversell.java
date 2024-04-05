package Linkedlist_;

public class Reversell {
    public static Node head = null;

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverse() {
        if (head == null) {
            System.out.println("linked list is empty.");
            return null; 
        } else {
            Node prv = null, curr = head, nxt = head;
            while (curr != null) {
                nxt = nxt.next;
                curr.next = prv;
                prv = curr;
                curr = nxt;
            }
            return prv;
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
        head = reverse();
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