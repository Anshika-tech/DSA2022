//implement stack by using an array
public class Stack {
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
}
