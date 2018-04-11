public class MergeSortWithOneArray implements Sort{

    int[] helper;

    public int[] sort(int[] arr) {
        validateNull(arr);
        helper = new int[arr.length];
        mergeSort(arr,0,arr.length-1);
        return arr;
    }

    public void mergeSort(int[] arr,int low,int high){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public void merge(int[] arr,int low,int mid,int high){

      for (int i=low;i<=high;i++)
          helper[i] = arr[i];

      int i = low;
      int j = mid+1;
      int k = low;

      while ((i<=mid) && (j<=high)){
          if(helper[i] <= helper[j]){
              arr[k] = helper[i];
              i++;
          } else {
              arr[k] = helper[j];
              j++;
          }
          k++;
      }

      while (i<=mid){
          arr[k] = helper[i];
          i++;
          k++;
      }

    }

}
