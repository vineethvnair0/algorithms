public class MaxSumNoAdjacent {

    public int getMax(int[] arr) {
        if((null == arr) ||(0 == arr.length)){
            throw new NullPointerException("Input cannot be empty");
        }
        int inSum = arr[0];
        int exSum = 0;
        int exTemp;
        for (int i=1;i<arr.length;i++){
            exTemp = inSum > exSum ? inSum : exSum;
            inSum = exSum+arr[i];
            exSum = exTemp;
        }
        return inSum > exSum ? inSum : exSum;
    }
}
