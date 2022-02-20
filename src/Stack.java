//implement stack by using an array
/*public class Stack {
   final int Max=1000;
   int top;
   int a[]=new int[Max];
      boolean isEmpty(){
          return (top<0);
      }
      Stack(){
          top=-1;
      }
      boolean push(int x){
          if(top>=(Max-1)){
              System.out.println("Stack overflow");
              return false;
          }
          else{
              a[++top]=x;
              System.out.println(x+"pushed in stack");
              return true;
          }
      }
      int pop(){
          if(top<0){
              System.out.println("Stack underflow");
              return 0;
          }
          else{
              int x=a[top--];
              return x;
          }
      }
      int peek(){
          if(top<0){
              System.out.println("Stack underflow");
              return 0;
          }
          else{
              int x=a[top];
              return x;
          }
      }
      void print(){
          for(int i=top;i>-1;i--){
              System.out.println(" "+ a[i]);
          }
      }
    public static void main(String[] args) {
        Stack s=new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop()+ " popped from stack");
        System.out.println("Top element is :"+s.peek());
        System.out.println("Element present in Stack;");
        s.print();

    }
}*/
// implementation of stack by using linked list.
class Node{
    int data;
    Node next;
    public Node(int d1){
        this.data=d1;
    }
}
public class Stack{
    Node root;
    boolean isEmpty(){
        if(root==null)
            return true;
        else
            return false;
    }
    public void push(int data){
        Node new_node=new Node(data);
        if(root==null){
            root=new_node;
        }else{
            Node temp=root;
            root=new_node;
            new_node.next=temp;
        }
        System.out.println(data+ "pushed to stack");
    }
    public int pop(){
        int popped=Integer.MIN_VALUE;
        if(root==null)
            System.out.println("Stack is Empty");
        else
        {
            popped=root.data;
            root=root.next;
        }
        return popped;
    }
    public int peek(){
        if(root==null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else
            return root.data;
    }
    void traverse(){
        Node p=root;
        while(p!=null){
            System.out.println(p.data+ " ");
            p=p.next;
        }
    }
    public static void main(String[] args) {
        Stack obj=new Stack();
        System.out.println(obj.isEmpty());
         obj.push(10);
         obj.push(20);
         obj.push(30);
        System.out.println(obj.pop()+" popped from stack");
        System.out.println("Top element is "+obj.peek());
        obj.traverse();
    }
}