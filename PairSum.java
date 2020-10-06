import java.util.Scanner;

public class PairSum {

    public static void main(String args[]){

        int arr[][] = new int [100][2];
        Scanner input = new Scanner(System.in);
        int ar[] = new int[100];
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            ar[i] = input.nextInt();

        }
        int sum = input.nextInt();
        int index = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]+ar[j] == sum){
                    arr[index][0] = ar[i];
                    arr[index][1] = ar[j];
                    index++;
                }
            }
        }
        for(int i=0;i<index;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        input.close();

    }
    
}