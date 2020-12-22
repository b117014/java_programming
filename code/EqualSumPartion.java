package code;
import java.util.*;

public class EqualSumPartion {
    
    public static boolean equalSum(int arr[], int n, int sum, Map<String, Boolean>dp){

        
        if(sum==0){
            return true;
        }
        if(n==0){
            return false;
        }
        String key = n+ "|" +sum;
        if(!dp.containsKey(key)){
          if(sum>=arr[n-1]){
            dp.put(key, equalSum(arr, n-1, sum-arr[n-1], dp)|| equalSum(arr, n-1, sum, dp));
          }else{
            dp.put(key, equalSum(arr, n-1, sum, dp));
          }
        }
        return dp.get(key);

    }

    public static void main(String args[]){
        int arr[] = {1,5,5,11};
        int n = arr.length;
        Map<String, Boolean>dp = new HashMap<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

        }
        if(sum%2!=0){
            System.out.println(false);
        }else{
            sum = sum/2;
            System.out.println(equalSum(arr, n, sum, dp));
        }
    }
}