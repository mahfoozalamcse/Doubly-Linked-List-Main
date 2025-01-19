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

         head = insertEnd(head, 4);
         printDoubleLl(head);

    }
}