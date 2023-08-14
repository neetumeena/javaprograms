package codingQuestions.list;

public class Test7 {
    Node head;
    public static void main(String[] args) {
        Test7 llist = new Test7();

//        llist.push(7);
//        llist.push(1);
//        llist.push(3);
//        llist.push(2);
//
//        System.out.println("\nCreated Linked list is:");
//        llist.printList();
//
//        llist.deleteNode(1); // Delete node with data 1
//
//        System.out.println("\nLinked List after Deletion of 1:");
//        llist.printList();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.deleteNode_givenPosition(0);  // Delete node at position 4

        System.out.println("\nLinked List after Deletion at position 4: ");
        llist.printList();
    }

    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("key not present");
            return;
        }
        prev.next = temp.next;

    }

    public void deleteNode_givenPosition(int position) {
        Node temp = head;
        Node prev = null;
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("key not present");
            return;
        }

        temp.next = temp.next.next;

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }

    }
}
