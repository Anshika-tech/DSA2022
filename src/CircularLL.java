//Circular linked list concept
//traverse,insert into empty linked list,insert at begining,insert after a given node,insert at the end.
/*class Node{
    Node next;
    int data;
}
public class CircularLL {
    void traverse(Node last){
        if(last==null){
            System.out.println("linked list is empty");
            return;
        }
        Node p=last.next;
        do{
            System.out.println(p.data + " ");
            p=p.next;
        }while(p!=last.next);
    }
    Node addtoEmpty(Node last,int data){
        if(last!=null){
            return last;
        }
        Node temp=new Node();
        temp.data=data;
        last=temp;
        temp.next=last;
        return last;
    }
    Node addtobegin(Node last,int data){
        if(last==null){
            return addtoEmpty(last,data);
        }
        Node temp=new Node();
        temp.data=data;
        temp.next=last.next;
        last.next=temp;
        return last;
    }
    Node addtoend(Node last,int data){
            if(last==null)
                return addtoEmpty(last,data);
            Node temp=new Node();
            temp.data=data;
            temp.next=last.next;
            last.next=temp;
            last=temp;
            return last;
    }
    Node addoneafter(Node last,int data,int item){
        if(last==null)
            return null;
        Node temp,p;
        p=last.next;
        do{
            if(p.data==item){
                temp=new Node();
                temp.data=data;
                temp.next=p.next;
                p.next=temp;
                if(p==last)
                    last=temp;
                return last;
            }
         p=p.next;
        }while(p!=last.next);
        System.out.println(item+ " not present in linked list");
        return last;
    }

    public static void main(String[] args) {
        CircularLL l1=new CircularLL();
        Node last=null;
        l1.traverse(last);
        last=l1.addtoEmpty(last,6);
        l1.traverse(last);
        System.out.println("add element in begining of linked list");
        last=l1.addtobegin(last,7);
        last=l1.addtobegin(last,9);
        last=l1.addtobegin(last,5);
        l1.traverse(last);
        System.out.println("add element in end of linked list");
        last =l1.addtoend(last,11);
        last=l1.addtoend(last,12);
        l1.traverse(last);
        System.out.println("add element after the searched item");
        last =l1.addoneafter(last,8,9);
        l1.traverse(last);
    }
}*/
//deletion of a node from circular linked list.
public class CircularLL{
    static class Node{
        Node next;
        int data;
    }
    static void printList(Node head){
        Node temp=head;
        if(head!=null)
         do{
             System.out.println(temp.data + " ");
             temp=temp.next;
         }while(temp!=head);
        System.out.println("\n");
    }
    static Node push(Node head,int data){
        Node t=new Node();
        t.data=data;
        t.next=head;
        if(head!=null){
            Node p=head;
            while(p.next!=head){
                p=p.next;
            }
            p.next=t;
        }
        else
            t.next=t;
        head=t;
        return head;

    }
    static Node deleteNode(Node head,int key){
        if(head==null){
            return null;
        }
        Node curr=head,prev=new Node();
        while(curr.data!=key){
            if(curr.next==head){
                System.out.println("given node is not found in linked list");
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        //if linked list contain only one node
        if(curr==head&&curr.next==head){
            head=null;
            return head;
        }
        //if key found on head
        if(curr==head){
            prev=head;
            while(prev.next!=head){
                prev=prev.next;
            }
            head=curr.next;
            prev.next=head;
        }
        //if key found at last node
        else if(curr.next==head){
            prev.next=head;
        }
        //if key found at middle.
        else{
            prev.next=curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
       Node head=null;
       head=push(head,2);
       head=push(head,5);
       head=push(head,6);
       head=push(head,8);
       head=push(head,9);
       System.out.println("List before deletion :");
       printList(head);
       head=deleteNode(head,6);
       printList(head);

    }
}