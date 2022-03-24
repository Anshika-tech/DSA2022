//Insertion sort
//time complexity of insertion sort is O(n^2).
public class InsertionSort {
    static void sort(int[] a,int n){
        int j;
        for(int i=1;i<n;i++){
            int key=a[i];
            j=i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
    }
    static void print(int[] a,int n){
        for(int value:a){
            System.out.print(value+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={12,34,56,17,84,92,81};
        int n=a.length;
        sort(a,n);
        print(a,n);
    }
}
