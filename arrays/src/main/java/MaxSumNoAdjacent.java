public class MaxSumNoAdjacent implements Algorithms{

    public int getMax(int[] arr) {
        validate(arr);
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
