//calculate x^n x to the power of n by recursive call.
/*import java.util.Scanner;
public class Recursion {
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }
}*/
//write the program that prints 1 to n number in increasing order by recursion.
/*import java.util.Scanner;
public class Recursion {
    public static void number(int n){
        if(n<=0){
            return;
        }
        number(n-1);
        System.out.print((n + " "));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        number(n);
    }
}*/
//count the no. of digits in a number by recursion.
/*import java.util.Scanner;
public class Recursion {
    public static int number(int n){
        if(n/10==0){
            return 1;
        }
        return 1+number(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(number(n));
    }
}*/
//sum of elements of an array by recursion.
/*import java.util.Scanner;
public class Recursion {
    public static int sum(int[] a,int b){
        if(b==0){
            return a[b];
        }
        return a[b]+sum(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(sum(a,n-1));
    }
}*/
//create an array of 5 elements and search value(2) in the given array and print the first occurrence(index) of search value by recursion.
/*import java.util.Scanner;
public class Recursion {
    public static int find(int[] a,int ci,int size ,int sv){
       if(size==ci){
            return -1;
        }
        if(a[ci]==sv)
            return ci;
        return find(a,ci+1,size,sv);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[]{1,2,4,2,6};
        int n=a.length;
        System.out.println("enter the search value");
        int sv=sc.nextInt();
        System.out.println(find(a,0,n,sv));
    }
}*/
//to find factorial.
//         Head Recursion
//In head recursion we produce the result when we navigate from base condition to main method.
/*import java.util.Scanner;
public class Recursion{
    public static int fact(int n){
        if(n>0){
            int a=fact(n-1);
            int myanswer=n*a;
            return myanswer;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}*/
//            Tail recursion
//In tail recursion we produce the result when we navigate from main method to base condition
/*import java.util.Scanner;
public class Recursion {
    public static void fact(int n,int sum){
        if(n==1){
            System.out.println(sum);
            return;
        }
        fact(n-1,sum*n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n,1);
    }
}
//Replace a character with another character in string by recursion.
public class Recursion{
    public static void replace1(char c1,char c2,String str,int i){
        if(i==str.length()){
            System.out.println(str);
            return;
        }
        if(str.charAt(i)==c1){
           str=str.substring(0,i)+c2+str.substring(i+1);
        }
        replace1(c1,c2,str,i+1);

    }
    public static void main(String[] args) {
        String str="abaca";
        char c1='a';
        char c2='x';
        replace1(c1,c2,str,0);
    }
}
import java.util.Scanner;
public class Recursion{
    public static void duplicate(String str,int i){
        if(i==str.length()){
            System.out.println(str);
            return;
        }
        if(str.charAt(i)==str.charAt(i+1)){
            str=str.substring(0,i)+str.substring(i+1);
        }
        duplicate(str,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        duplicate(str,0);
    }
}

//convert a decimal number into binary
import java.util.Scanner;
public class Recursion{
    public static int binary(int n){
       int b;
        if(n==0){
            return 0;
        }
       return n%2+10*binary(n/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        System.out.println(binary(n));

    }
}*/
//by using recursion search an element in an array.
import java.util.Scanner;
public class Recursion{
    static boolean search(int a[],int c,int sv){
       if(c==a.length)
           return false;
       if(a[c]==sv)
           return true;
       return search(a,c+1,sv);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int a[]=new int[6];
          for(int i=0;i<a.length;i++){
              a[i]=sc.nextInt();
          }
        System.out.println("enter the search value");
          int sv=sc.nextInt();
        System.out.println(search(a,0,sv));
    }
}





