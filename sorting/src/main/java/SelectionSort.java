public class SelectionSort implements Sort{
    public int[] sort(int[] arr) {
        validateNull(arr);
        selectionSort(arr);
        return arr;
    }

    private void selectionSort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            int imin = i;
            for (int j=i+1;j<arr.length;j++)
                if (arr[j] < arr[imin])
                    imin = j;
            if(imin != i) {
                int temp = arr[i];
                arr[i] = arr[imin];
                arr[imin] = temp;
            }
        }
    }
}
