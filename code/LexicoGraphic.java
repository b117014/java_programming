package code;
import java.util.*;

class LexicoGraphic{

    public static void main(String args[]){
            String str = "ABC";
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            lexico(arr, "");
            


    }

    public static void lexico(char [] arr, String res ){
        if(res.length() == arr.length){
            
            System.out.println(res + " ");
            return ;
        }
       for(char c: arr){
           lexico(arr, res+c);
       }
    }
}