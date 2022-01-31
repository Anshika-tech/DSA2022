//Linked list traversal
/*public class Linkedlist {
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
//Insertion of a Node
//1. At the front of the linked list.
public class Linkedlist{
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
        System.out.println(" ");
    }
    public void insert(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public static void main(String[] args) {
         Linkedlist l1=new Linkedlist();
         l1.head=new Node(5);
         Node n2=new Node(6);
         Node n3=new Node(7);
         l1.head.next=n2;
         n2.next=n3;
        System.out.println("before insertion ");
         l1.display();
        System.out.println("after insertion of a node at the front");
         l1.insert(4);
         l1.display();
    }
}*/
//2.After a given node
//3.At the end of the linked list.
public class Linkedlist{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            //next=null;
        }
    }
    public void display(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println(" ");
    }
    public void insertafter(Node prev_node,int new_data){
        if(prev_node ==null){
            System.out.println("the given previous node cannot be null");
            return;
        }
        Node new_node=new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }
    public void append(int new_data){
        Node new_node=new Node(new_data);
        if(head==null){
            head=new Node(new_data);
            return;
        }
        new_node.next=null;
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=new_node;
    }
    public static void main(String[] args) {
        Linkedlist l1=new Linkedlist();
        l1.head=new Node(2);
        Node n2=new Node(3);
        Node n3=new Node(4);
        l1.head.next=n2;
        n2.next=n3;
        l1.display();
        System.out.println("insertion after a node");
        l1.insertafter(n2,7);
        l1.display();
        System.out.println("insertion at the end");
        l1.append(8);
        l1.display();
    }
}
