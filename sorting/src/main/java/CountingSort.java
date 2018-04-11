public class CountingSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        validateNull(arr);
        if(0 == arr.length){
            return arr;
        }
        int[] output = new int[arr.length];
        int[] temp = new int[10];
        for (int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        for (int i=1;i<temp.length;i++){
            temp[i]+=temp[i-1];
        }
        for (int i=0;i<arr.length;i++){
            output[temp[arr[i]]-1] = arr[i];
            temp[arr[i]]--;
        }

        return output;
    }

}
