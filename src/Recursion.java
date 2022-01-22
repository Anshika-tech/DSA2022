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
import java.util.Scanner;
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
}

