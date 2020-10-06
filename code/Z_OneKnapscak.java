package code;

import java.util.*;

public class Z_OneKnapscak {
    
    int n,w;
     int [][]dp;

    Z_OneKnapscak(int n, int w){
        this.n=n;
        this.w=w;
        dp = new int[n+1][w+1];
        for(int []row : dp){
            Arrays.fill(row,-1);
        }
    }
    public  int knapsack(int wt[], int val[], int W, int n){
            if(n==0 || W==0){    // Base condition
                return 0;      // Zero profit
            }
            if(dp[n][W]==-1){
                if(wt[n-1]<=W){
                    return dp[n][W] = Math.max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
                }
                else if(wt[n-1]>W){
                    return dp[n][W] = knapsack(wt, val, W, n-1);
                }
            }
                return dp[n][W];
            

    }
    public static void main(String srgs []){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int W = input.nextInt();
        int wt[] = new int[n];
        int val[] = new int[n];
        for(int i=0;i<n;i++){
            wt[i] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            val[i] = input.nextInt();
        }
        Z_OneKnapscak zk = new Z_OneKnapscak(n, W);
        int res = zk.knapsack(wt, val, W, n);
        System.out.println(res);
        input.close();
    }
}