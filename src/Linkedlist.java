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
}
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
    public void delete(int key){
        Node temp=head,prev=null;
        if(temp!=null && temp.data==key){
            head=temp.next;
            return;
        }
        while(temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        if(temp == null) {
            return;
        }
        prev.next=temp.next;
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
        System.out.println("after deletion of a key");
        l1.delete(3);
        l1.display();
    }
}*/
//count the length of linked list.
/*import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
}
public class Linkedlist{
    Node head;
    public void insert(int new_data){
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
    public void display(){
        int c=0;
        Node temp=head;
        while(temp.data!=-1){
            c++;
            temp=temp.next;
        }
        System.out.println("length of linked list is "+c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlist l1=new Linkedlist();
        l1.insert(sc.nextInt());
        l1.insert(sc.nextInt());
        l1.insert(sc.nextInt());
        l1.insert(sc.nextInt());
        l1.insert(sc.nextInt());
        l1.insert(sc.nextInt());
        l1.insert(sc.nextInt());
        l1.display();
    }
}*/
//search an element in linked list.
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int d1){
        data=d1;
    }
}
public class Linkedlist{
    Node head;
    public void push(int x){
        Node d=new Node(x);
        d.next=head;
        head=d;

    }
    public boolean search(int c){
        Node n=head;
        while(n!=null){
            if(n.data==c){
                return true;
            }
            n=n.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlist l1=new Linkedlist();
        l1.push(sc.nextInt());
        l1.push(sc.nextInt());
        l1.push(sc.nextInt());
        l1.push(sc.nextInt());
        l1.push(sc.nextInt());
        System.out.println("enter the searching element \n");
        if(l1.search(sc.nextInt())){
            System.out.print("element present in linked list");
        }
        else
            System.out.print("element is not present in linked list");
    }
}
