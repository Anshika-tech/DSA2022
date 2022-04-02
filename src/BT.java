//-Sequential representation implementation of binary tree by array.
import java.io.*;
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
