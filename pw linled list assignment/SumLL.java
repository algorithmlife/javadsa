class LinkedList { 

    Node head;  

 

    static class Node { 

        int data; 

        Node next; 

 

        Node(int data) { 

            this.data = data; 

            this.next = null; 

        } 

    } 

 

    public void reverseList() { 

        Node prev = null; 

        Node current = head; 

        while (current != null) { 

            Node nextNode = current.next; 

            current.next = prev; 

            prev = current; 

            current = nextNode; 

        } 

        head = prev; 

    } 

 

     

    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) { 

  

        l1.reverseList(); 

        l2.reverseList(); 

 

     

        Node p1 = l1.head; 

        Node p2 = l2.head; 

        LinkedList result = new LinkedList(); 

        Node dummyHead = new Node(0); 

        Node current = dummyHead; 

        int carry = 0; 

 

        while (p1 != null || p2 != null) { 

            int x = (p1 != null) ? p1.data : 0; 

            int y = (p2 != null) ? p2.data : 0; 

            int sum = carry + x + y; 

            carry = sum / 10; 

            current.next = new Node(sum % 10); 

            current = current.next; 

 

            if (p1 != null) p1 = p1.next; 

            if (p2 != null) p2 = p2.next; 

        } 

 

        if (carry > 0) { 

            current.next = new Node(carry); 

        } 

 

       

        result.head = dummyHead.next; 

        result.reverseList(); 

        return result; 

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

        LinkedList l1 = new LinkedList(); 

        LinkedList l2 = new LinkedList(); 

        LinkedList l3 = new LinkedList(); 

        LinkedList l4 = new LinkedList(); 

 

 

 

        l1.head = new Node(5); 

        l1.head.next = new Node(6); 

        l1.head.next.next = new Node(3); 

 

 

        l2.head = new Node(8); 

        l2.head.next = new Node(4); 

        l2.head.next.next = new Node(2); 

 

        l3.head = new Node(7); 

        l3.head.next = new Node(5); 

        l3.head.next.next = new Node(9); 

        l3.head.next.next.next = new Node(4); 

        l3.head.next.next.next.next = new Node(6); 

 

        l4.head = new Node(8); 

        l4.head.next = new Node(4); 

 

        System.out.println("List 1:"); 

        l1.printList(); 

        System.out.println("List 2:"); 

        l2.printList(); 

        System.out.println("List 3:"); 

        l3.printList(); 

        System.out.println("List 4:"); 

        l4.printList(); 

 

        LinkedList result = addTwoNumbers(l1, l2); 

        System.out.println("Resultant List:"); 

        result.printList();  

 

        LinkedList result1 = addTwoNumbers(l3, l4); 

        System.out.println("Resultant List:"); 

        result1.printList();  

 

 

    } 

} 

 

 

 

