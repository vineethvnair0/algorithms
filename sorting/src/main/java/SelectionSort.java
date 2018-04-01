public class SelectionSort {
    public int[] sort(int[] arr) {
        if(arr == null)
            throw new NullPointerException("Input cannot be empty");
        selectionSort(arr);
        return arr;
    }

    private void selectionSort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            int imin = i;
            for (int j=i+1;j<arr.length;j++)
                if (arr[j] < arr[imin])
                    imin = j;
            int temp = arr[i];
            arr[i] = arr[imin];
            arr[imin] = temp;
        }
    }
}
