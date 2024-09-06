class LinkedList {
    Node head; 

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

 
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data); 
        new_node.next = prev_node.next; 
        prev_node.next = new_node; 
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(6);

        System.out.println("Original Linked List:");
        list.printList();

     
        list.insertAfter(list.head.next, 3);

        System.out.println("Linked List after insertion:");
        list.printList();
    }
}
