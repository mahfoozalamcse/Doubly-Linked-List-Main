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
    public static void main(String[] args) {
       Node head  = new Node(1);
       Node temp1 = new Node(2);
       Node temp2 = new Node(3);
       head.next = temp1;
       temp1.prev = head;
       temp1.next = temp2;
       temp2.prev = temp1;
    }
}