package Linkedlist_;
//remove nth node from first

public class RemoveNthnode1 {

    public static Node head = null;

    public static int remove(int n) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return -1;
        } else {
            Node temp = head;
            int i = 0;
            Node prv = head;
            while (temp.next != null && i != n) {
                prv = temp;
                temp = temp.next;
                i++;
            }

            int data = temp.data;
            prv.next = temp.next;
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
        head = new Node(0);
        Node temp = head;
        for (int i = 1; i <= 10; i++) {
            Node node = new Node(i * 3);
            temp.next = node;
            temp = temp.next;
        }
        print();
        int n = 3;
        System.out.println("Element at index " + n + " with data " + remove(n) + " is removed");
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