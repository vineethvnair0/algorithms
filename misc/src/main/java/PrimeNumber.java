import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public List<Integer> getAllPrimes(int n) {
        int[] result;
        List<Integer> resultList = new ArrayList<>();
        boolean[] isPrime = new boolean[n+1];
        for (int i=2;i<=n;i++){
            isPrime[i] = true;
        }
        int x = (int) Math.sqrt(n);
        for (int i=2;i<=x;i++){
            if (isPrime[i]){
                int j = i + i;
                while (j<=n){
                    isPrime[j] = false;
                    j+=i;
                }
            }
        }

        for (int i=2;i<=n;i++){
            if(isPrime[i]) {
                resultList.add(i);
            }
        }
        result = new int[resultList.size()];


        return resultList;

    }
}
