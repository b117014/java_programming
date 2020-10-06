import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    
    public static void main(String args[]){

        String s = "geeksforgeeks";
        char [] ch = s.toCharArray();
        Set<Character> set = new LinkedHashSet<Character>();
        for (Character c : ch){
            set.add(c);
        }
        StringBuilder st = new StringBuilder();

        for(Character c: set){
            st.append(c);
        }
        System.out.println(st.toString());
    }
}