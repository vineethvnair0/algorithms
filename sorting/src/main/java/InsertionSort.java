public class InsertionSort implements Sort {

    public int[] sort(int[] arr) {
        validateNull(arr);
        for (int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while ((j > -1) && (key < arr[j])){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
