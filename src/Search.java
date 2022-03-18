//Binary search
//1. by recursion
/*import java.util.Scanner;
public class Search {
    static int binary_search(int[] a,int l,int h,int x){
        if(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==x){
                return mid;
            }
            if(a[mid]>x){
                return binary_search(a,l,mid-1,x);
            }
            if(a[mid]<x){
                return binary_search(a,mid+1,h,x);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5,6};
        int n=a.length;
        int x=sc.nextInt();
        int result=binary_search(a,0,n-1,x);
        if(result==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index "+result);
        }

    }
}*/
//2. by iteration.
import java.util.Scanner;
public class Search{
    int binary_search(int[] a,int x){
        int l=0,h=a.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==x){
                return mid;
            }
            if(a[mid]>x){
                h=mid-1;
            }
            if(a[mid]<x){
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Search obj=new Search();
        int[] a={1,2,3,4,5,6};
        int x=sc.nextInt();
        int result=obj.binary_search(a,x);
        if(result==-1){
            System.out.println("element not found");
        }
        else
            System.out.println("element found at index "+result);
    }
}
