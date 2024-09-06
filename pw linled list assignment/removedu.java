class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
               
                current.next = current.next.next;
            } else {
              
                current = current.next;
            }
        }
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
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();


        list1.head = new Node(1);
        list1.head.next = new Node(1);
        list1.head.next.next = new Node(2);

    
        list2.head = new Node(1);
        list2.head.next = new Node(1);
        list2.head.next.next = new Node(2);
        list2.head.next.next.next = new Node(3);
        list2.head.next.next.next.next = new Node(3);

      
        System.out.println("Original Linked List 1:");
        list1.printList();

        
        list1.removeDuplicates();
        System.out.println("Linked List 1 after removing duplicates:");
        list1.printList();

       
        System.out.println("Original Linked List 2:");
        list2.printList();

       
        list2.removeDuplicates();
        System.out.println("Linked List 2 after removing duplicates:");
        list2.printList();
    }
}
