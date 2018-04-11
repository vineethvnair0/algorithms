public class HeapSort implements Sort{
    public int[] sort(int[] arr) {
        validateNull(arr);
        int n = arr.length-1;
        for (int i=n/2;i>=0;i--){
            maxHeapify(arr,n,i);
        }

        for (int i=n;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr,i-1,0);
        }
        return arr;
    }

     void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if( (left<=n) && arr[left] > arr[largest]){
            largest = left;
        }

         if( (right<=n) && arr[right] > arr[largest]){
             largest = right;
         }

         if (largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr,n,largest);
         }

    }
}
