public class RecursiveBubbleSort implements Sort{

    public int[] sort(int[] arr) {
        validateNull(arr);
        bubbleSort(arr,arr.length);

        return arr;
    }

    private void bubbleSort(int[] arr,int n) {
        if(1 >= n)
            return;
        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr,n-1);
    }


}
