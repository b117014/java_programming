package code;
import java.util.*;

public class SubsetSum {

    static boolean dp[][];
    SubsetSum(int n, int sum){
        dp = new boolean [n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    dp[i][j] = false;
                }
                if(j==0){
                    dp[i][j] = true;
                }
            }
        }

    }
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = input.nextInt()
        int arr[] = new int [n];
        System.out.println("enter sum");
        int sum = input.nextInt();
        System.out.println("enter element in array to find out the sum of sub array");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        SubsetSum sb = new SubsetSum(n, sum);
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i]<=sum){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                dp[i][j] = dp[i-1][j];
            }
        }

        System.out.println(dp[n][sum]);

    }
    
}