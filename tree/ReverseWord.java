package tree;
import java.util.*;

public class ReverseWord {

    public static void main(String args[]){
        String str = "Hello Buddy";
        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                st.push(str.charAt(i));
            }else{
                while(!st.empty()){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while(!st.empty()){
            System.out.print(st.pop());
        }
    }
    
}