//time complexity of quicksort is O(nlog(n));
public class QuickSort {
    public static void quicksort(int arr[],int start,int end){
        if(start<end){
            int pivot=Partition(arr,start,end);
            quicksort(arr,start,pivot-1);
            quicksort(arr,pivot+1,end);
        }
    }
    public static int Partition(int arr[],int p,int q) {
        int pivot = q;
        int i = p - 1;
        for (int j = p; j <= q; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        return i;
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={34,6,98,35,2};
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}
