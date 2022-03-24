//worst time complexity of this sort method is O(n^2).
//Best time complexity of bubble sort is O(n), when array is sorted.
/*public class BubbleSort {
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
}*/
//bubble sort by recursion.
public class BubbleSort{
     void sort(int[] a,int n){
         if(n==1)
             return;
         for(int i=0;i<n-1;i++){
             if(a[i]>a[i+1]){
                 int t=a[i];
                 a[i]=a[i+1];
                 a[i+1]=t;
             }
         }
         sort(a,n-1);
     }
    public static void main(String[] args) {
        BubbleSort obj=new BubbleSort();
        int[] a={5,6,3,2,8,7};
        int n=a.length;
        obj.sort(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}


