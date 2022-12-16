package Linkedlist_;

public class AddFirst {
    public static Node head = null;

    public static Node AddNodeFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            return node;
        } else {
            node.next = head;
            head = node;
            return node;
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
        Node ll = new Node(1);
        head = ll;
        print();
        AddNodeFirst(2);
        print();
        AddNodeFirst(3);
        print();
        AddNodeFirst(4);
        print();
        AddNodeFirst(5);
        print();
        AddNodeFirst(6);
        print();
        AddNodeFirst(7);
        print();
        AddNodeFirst(8);
        print();
        AddNodeFirst(9);
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