public class InsertionSort {

    public int[] sort(int[] arr) {
        if(arr == null)
            throw new NullPointerException("Input array cannot be null");
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
