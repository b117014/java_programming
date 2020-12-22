package code;

public class MergeString {

    public static void main(String [] args){
        String str1 = "String";
        String str2 = "Hello";
        String str3 = "";
        int i;
        for( i=0;i<str1.length();i++){
            if(i< str2.length()){
                str3 = str3 + str1.charAt(i)+str2.charAt(i);
            }else{
                break;
            }
        }
        for(int j=i;j<str1.length();j++){
            str3=str3+str1.charAt(j);
        }

        System.out.println(str3);
    }
    
}