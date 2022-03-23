//time complexity of selection sort is O(n^2).
public class SelectionSort {
    static void sort(int[] a,int n){
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={5,3,8,4,1,9};
        int n=a.length;
        sort(a,n);
        for(int value:a){
            System.out.print(value+" ");
        }
    }
}
