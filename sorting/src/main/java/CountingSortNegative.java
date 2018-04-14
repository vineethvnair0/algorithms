import static java.lang.Math.abs;

public class CountingSortNegative implements Sort{
    public int[] sort(int[] arr) {
        validateNull(arr);
        if(arr.length == 0)
            return arr;
        int[] output = new int[arr.length];
        int min = findMin(arr);
        int max = findMax(arr);
        int[] tempArray = new int[min+max+1];
        for (int i=0;i<arr.length;i++){
            tempArray[arr[i]+min]++;
        }
        for (int i=1;i<tempArray.length;i++){
            tempArray[i]+=tempArray[i-1];
        }
        for (int i=0;i<arr.length;i++){
            output[tempArray[arr[i]+min]-1] = arr[i];
            tempArray[arr[i]+min]--;
        }


        return output;
    }

    protected int findMin(int[] arr){
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min < 0 ? abs(min) : min;
    }

    public int findMax(int[] arr) {
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] > min){
                min = arr[i];
            }
        }
        return min < 0 ? abs(min) : min;
    }
}
