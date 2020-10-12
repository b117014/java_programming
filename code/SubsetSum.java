package code;
import java.util.*;

public class SubsetSum {

    // static boolean dp[][];
    // SubsetSum(int n, int sum){
    //     dp = new boolean [n+1][sum+1];
    //     for(int i=0;i<n+1;i++){
    //         for(int j=0;j<sum+1;j++){
    //             if(i==0){
    //                 dp[i][j] = false;
    //             }
    //             if(j==0){
    //                 dp[i][j] = true;
    //             }
    //         }
    //     }

    // }

    public static boolean subsetSumRecursive(int arr[], int sum, int n, Map<String, Boolean>dp){

         
        
        if(sum==0){
            return true;
        }
        if(n==0 || sum==0 ){
            return false;
        }
        String key = n+"|"+sum;
            if(!dp.containsKey(key)){
               
                if(arr[n-1]<=sum){
                    dp.put(key, subsetSumRecursive(arr, sum-arr[n-1], n-1, dp) || subsetSumRecursive(arr, sum, n-1, dp));
                }else{
                    dp.put(key, subsetSumRecursive(arr, sum, n-1, dp));
                }
            }
            return dp.get(key);

    }
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = 6;
        int arr[] = {3, 34, 4, 12, 1, 2 };
        System.out.println("enter sum");
        int sum = 100;

        Map <String,Boolean> dp = new HashMap<>();
       
        // boolean [][] dp = new boolean [n+1][sum+1];
        // for(int i=0;i<n+1;i++){
        //     for(int j=0;j<sum+1;j++){
        //         if(i==0){
        //             dp[i][j] = false;
        //         }
        //         if(j==0){
        //             dp[i][j] = true;
        //         }
        //     }
        // }
        // for(int i=1;i<n+1;i++){
        //     for(int j=1;j<sum+1;j++){
                
        //         if(arr[i-1]<=j){
        //             dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
        //         }else{
        //             dp[i][j] = dp[i-1][j];
        //         }
                
        //     }
        // }

          
            System.out.println(subsetSumRecursive(arr, sum, n, dp));
         
            
        
        input.close();

    }
    
}