public class DoublyLLImp {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
           data = d;
           next = null;
           prev = null;
        }
    }

    // insert at the begning of doubly linked list
    public static Node insertBegin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;

        if(head != null)
            head.prev = temp;
        
        
        return temp;
    }

    // insert at the end of doubly linked list
    public static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        if (head ==  null) {
            
            return temp;
        }
        Node curr = head;

        while (curr.next != null) 
            curr = curr.next;
        curr.next = temp;
        temp.prev = curr;

        return head;
        
    }

    // Reverse the Doubly Linked List 
    public static Node ReverseDoublyLL(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        
        Node curr = head;
        Node prev = null;
        while (curr != null){
             prev = curr.prev;
             curr.prev = curr.next;
             curr.next = prev;
             curr = curr.prev;
        }

        return prev.prev;

    }

    // Delete head node in the doubly linked list
    public static Node deleteHead(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        else{
            head = head.next;
            head.prev = null;
            return head;
        }
    }

    // Delete last of the doubly Linked List
    public static Node deleteLastDoubly(Node head){
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next != null) 
              curr = curr.next;

        curr.prev.next = null;
        return head;
    }

    // traverse doubly linked list

    public static void printDoubleLl(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +"<=>");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
       Node head  = new Node(1);
       Node temp1 = new Node(2);
       Node temp2 = new Node(3);
       head.next = temp1;
       temp1.prev = head;
       temp1.next = temp2;
       temp2.prev = temp1;

    //    head = insertBegin(head, 0);
    //    printDoubleLl(head);

        //  head = insertEnd(head, 4);
        //  printDoubleLl(head);

        // head = ReverseDoublyLL(head);
        // printDoubleLl(head);

        // head = deleteHead(head);
        // printDoubleLl(head);

        head = deleteLastDoubly(head);
        printDoubleLl(head);

        



    }
}