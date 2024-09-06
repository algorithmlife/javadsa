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


    public boolean search(int X) {
        Node current = head; 
        while (current != null) {
            if (current.data == X) 
                return true;
            current = current.next;
        }
        return false; 
    }

    public static void main(String[] args) 
    {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();


        list1.head = new Node(14);
        list1.head.next = new Node(21);
        list1.head.next.next = new Node(11);
        list1.head.next.next.next = new Node(30);
        list1.head.next.next.next.next = new Node(10);

        list2.head = new Node(6);
        list2.head.next = new Node(21);
        list2.head.next.next = new Node(17);
        list2.head.next.next.next = new Node(30);
        list2.head.next.next.next.next = new Node(10);
        list2.head.next.next.next.next.next = new Node(8);



        int X = 14,Y = 13; 

        if (list1.search(X))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (list2.search(Y))
            System.out.println("Yes");
        else
            System.out.println("No");     



    }
}
