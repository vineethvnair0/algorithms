public  interface Sort {


    default void validateNull(int[] arr){
        if(null == arr){
            throw new NullPointerException("Input cannot be null");
        }
    }

    public abstract int[] sort(int[] arr);
}
