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


    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; 
        }

  
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        Node secondHalf = reverseList(slow);

   
        Node firstHalf = head;
        Node secondHalfCopy = secondHalf; 
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

       
        reverseList(secondHalfCopy);

        return true;
    }

    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(1);

        System.out.println("Is palindrome? " + list.isPalindrome());

        LinkedList list2 = new LinkedList();
        list2.head = new Node(1);
        list2.head.next = new Node(2);

        System.out.println("Is palindrome? " + list2.isPalindrome());
    }
}
