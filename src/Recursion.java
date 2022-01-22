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
import java.util.Scanner;
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
}

