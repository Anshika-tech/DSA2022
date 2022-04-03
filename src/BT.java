//-Sequential representation implementation of binary tree by array.
/*import java.io.*;
import java.lang.*;
import java.util.*;
public class BT {
    static int root=0;
    static String[] str=new String[11];
    public void Root(String key){
        str[1]=key;
    }
    public void set_Left(String key,int root) {
        int t = (root * 2);
        if (str[root]== null) {
            System.out.printf("can't set child at %d no parent found\n",t);
        } else
            str[t] = key;
    }
    public void set_Right(String key,int root){
        int t=(root*2)+1;
        if(str[root]==null){
            System.out.printf("Can't set child at %d ,no parent found\n",t);
        }
        else
            str[t]=key;
    }
    public void print_Tree(){
        for(int i=1;i<11;i++){
            if(str[i]!=null)
                System.out.println(str[i]);
            else
                System.out.println("-");
        }
    }

    public static void main(String[] args) {
        BT obj=new BT();
        obj.Root("A");
       // obj.set_Left("B",0);
        obj.set_Right("C",1);
        obj.set_Left("D",2);
        obj.set_Right("E",2);
        obj.set_Right("F",3);
        obj.print_Tree();
    }
}
 */
//Binary tree traversal (linked list)
//preorder ,inorder,postorder.
class Node{
    int key;
    Node left;
    Node Right;
    public Node(int item){
        key=item;
    }
}
public class BT{
    Node root;
     public static void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key+" ");
        preorder(node.left);
        preorder(node.Right);
    }
    public void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.key+" ");
        inorder(node.Right);
    }
    public void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.Right);
        System.out.print(node.key+" ");
    }
    void preorder() {
        preorder(root);
    }
    void inorder(){
         inorder(root);
    }
    void postorder(){
         postorder(root);
    }
    public static void main(String[] args) {
        BT tree = new BT();
        tree.root = new Node(1);
        tree.root.left=new Node(2);
        tree.root.Right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.Right=new Node(5);
        System.out.println("preorder traversal");
        tree.preorder();
        System.out.println("\ninorder traversal");
        tree.inorder();
        System.out.println("\npostorder traversal");
        tree.postorder();
    }
}