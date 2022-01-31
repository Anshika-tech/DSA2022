//Linked list traversal
public class Linkedlist {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void display(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args) {
        Linkedlist l1=new Linkedlist();
       l1.head=new Node(1);
       Node n2=new Node(2);
       Node n3=new Node(3);
       l1.head.next=n2;
      n2.next=n3;
      l1.display();
    }
}
