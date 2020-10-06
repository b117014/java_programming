package code;

import java.util.*;

public class FactorBeforeNumber {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n];
        res[0] = 0;
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        for(int i=1;i<n;i++){
            res[i] =0 ;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0){
                    res[i]+=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
        input.close();
    }
}