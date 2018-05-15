public interface Algorithms {

    default void validate(int[] arr1,int[] arr2){
        if((null == arr1) || (null ==arr2)|| (0 == arr1.length)||(0 == arr2.length)){
            throw new NullPointerException("Input cannot be empty");
        }
    }

    default void validate(int[] arr){
        if((null == arr) || (0 == arr.length)){
            throw new NullPointerException("Input cannot be empty");
        }
    }
}
