//time complexity of selection sort is O(n^2).
/*public class SelectionSort {
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
}*/
//sort an array of string by selection sort.
public class SelectionSort{
    static void sort(String[] a,int n){
         for(int i=0;i<n-1;i++){
             for(int j=i+1;j<n;j++){
                 if(a[j].compareTo(a[i])<0){
                     String t=a[i];
                     a[i]=a[j];
                     a[j]=t;
                 }

             }
         }
    }
    public static void main(String[] args) {
        String[] a={"paper","true" ,"soap", "floppy", "flower"};
        int n=a.length;
        sort(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
