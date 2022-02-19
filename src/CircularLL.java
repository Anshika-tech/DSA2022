//Circular linked list concept
//traverse,insert into empty linked list,insert at begining,insert after a given node,insert at the end.
class Node{
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
}
