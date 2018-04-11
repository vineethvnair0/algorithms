public class BubbleSort implements Sort{
    public int[] sort(int[] arr) {
        validateNull(arr);
        bubbleSort(arr);
        return arr;
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            boolean swapped = false;
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
