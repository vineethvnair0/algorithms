import java.util.ArrayList;
import java.util.List;

public class SortedArrayUnionandIntersection implements Algorithms{
    public int[] getUnion(int[] arr1, int[] arr2) {
        validate(arr1,arr2);
        List<Integer> resultList = new ArrayList<>();

        int i=0,j=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i] > arr2[j]){
                resultList.add(arr2[j]);
                j++;
            } else if(arr1[i] < arr2[j]){
                resultList.add(arr1[i]);
                i++;
            } else {
                resultList.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i<arr1.length){
            resultList.add(arr1[i]);
            i++;
        }

        while (j<arr2.length){
            resultList.add(arr2[j]);
            j++;
        }

        int[] result = new int[resultList.size()];
        for ( i=0;i<result.length;i++){
            result[i] = resultList.get(i);
        }
        return result;
    }

    public int[] getIntersection(int[] arr1, int[] arr2) {
        validate(arr1,arr2);
        List<Integer> resultList = new ArrayList<>();
        int i=0,j=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else {
                resultList.add(arr1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[resultList.size()];
        for (i=0;i<resultList.size();i++){
            result[i] = resultList.get(i);
        }
        return result;

    }
}
