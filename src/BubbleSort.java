//worst time complexity of this sort method is O(n^2).
//Best time complexity of bubble sort is O(n), when array is sorted.
public class BubbleSort {
    static void sort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={2,7,3,9,4,5,11};
        int n=a.length;
        sort(a,n);
        for(int value:a){
            System.out.print(value+" ");
        }
    }
}
