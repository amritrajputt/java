package recursion;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

       head = reverseLL(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
            if(temp == null) System.out.print("null");
        }
    }

    public static Node reverseLL(Node head) {
        if (head == null || head.next == null)
            return head;
       
    Node next = head.next;

    Node newHead = reverseLL(next);  
    next.next = head;              
    head.next = null;                 

    return newHead;
}
}
