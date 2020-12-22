package code;
import java.util.*;

public class SumOfArrayNotAdjacent {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int inc = arr[0];
        int exc = 0;
        int temp = 0;
        for(int i=1;i<n;i++){
            temp = Math.max(inc, exc);
            inc = exc  + arr[i];
            exc = temp;
        }
        System.out.println(Math.max(inc, exc));
        input.close();
    }

    
}