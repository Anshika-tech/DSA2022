//Q. count trailing zeroes in factorial of a number.
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        long f=1,r;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is "+f);
        int c=0;
        while(f>0){
            r=f%10;
            if(r==0){
                c++;
            }
            else
                break;
            f=f/10;
        }
        System.out.println("Trailing zeroes = "+c);
    }
}
