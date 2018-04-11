public class QuickSort implements Sort{

    public int[] sort(int[] arr) {
        validateNull(arr);
        quickSort(arr,0,arr.length-1);
        return arr;
    }

    private void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pIndex = partition(arr, start, end);
            quickSort(arr,start,pIndex-1);
            quickSort(arr,pIndex+1,end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pIndex = start;
        for (int i=start;i<end;i++){
            if(arr[i]<= pivot){
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
        swap(arr,pIndex,end);
        return pIndex;
    }

    private void swap(int[] arr, int i, int pIndex) {
        if(i != pIndex){
            int temp = arr[pIndex];
            arr[pIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
