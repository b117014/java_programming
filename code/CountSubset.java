package code;

import java.util.*;

public class CountSubset {
   
    public static int countSubRec(int arr[], int n, Map<String,Integer>dp, int sum){
        if(n==0)return 0;
        if (sum==0) return 1;
        
        String key = n+"|"+sum;
        if(dp.containsKey(key)){
            return dp.get(key);
        }else{
            if(arr[n-1]<= sum){
                dp.put(key,countSubRec(arr, n-1, dp, sum) + countSubRec(arr, n-1, dp, sum-arr[n-1])); 
            }else{
                dp.put(key,countSubRec(arr, n-1, dp, sum));
            }
            
        }
        return dp.get(key);

    }

    public static void main(String args[]){
   int arr[] = {1,2,5,3,6};
   int sum =5;
   int n = 5;
   Map <String,Integer> dp = new HashMap<>();
//    int dp[][] = new int [n+1][sum+1];
//    for(int i=0;i<n+1;i++){
//        for(int j=0;j<sum+1;j++){
//            if(i==0){
//                dp[i][j] = 0;
//            }
//            if(j==0){
//                dp[i][j] = 1;
//            }
//        }
//    }
//    for(int i=1;i<n+1;i++){
//        for(int j=1;j<sum+1;j++){
//            dp[i][j]=-1;
//        }
//    }
    System.out.println(countSubRec(arr, n, dp, sum));

    }
    
}