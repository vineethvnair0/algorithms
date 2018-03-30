public class MergeSort {

    public int[] sort(int[] arr) {

        if(arr == null)
            throw new NullPointerException("Input cannot be empty");
         mergeSort(arr,0,arr.length-1);
         return arr;
    }


    void mergeSort(int[] arr,int l,int r){
        if(l < r){
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    void merge(int[] arr,int l,int m,int r){
            int n1 = m-l+1;
            int n2 = r-m;
            int lArray[] = new int[n1];
            int rArray[] = new int[n2];
            for (int i=0;i<n1;i++)
                lArray[i] = arr[l+i];
            for (int i=0;i<n2;i++)
                rArray[i] = arr[m+i+1];

            int i = 0,j = 0,k = l;

            while (i<n1 && j <n2){
                if(lArray[i]<=rArray[j]){
                    arr[k] = lArray[i];
                    i++;
                }else {
                    arr[k] = rArray[j];
                    j++;
                }
                k++;
            }

            while (i<n1){
                arr[k]=lArray[i];
                k++;
                i++;
            }
            while (j<n2){
                arr[k]=rArray[j];
                j++;
                k++;
            }

    }


}
