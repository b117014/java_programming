
package tree;
import java.util.*;
import java.lang.*;


public class ExpressionTree {
    
    public class Node{
        char info;
        Node left, right;
        Node(char info){
            this.info = info;
            left = null;
            right = null;
        }
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.info + " ");
            inorder(root.right);
        }
    }

    public static boolean isOperator(char c){
        if(c == '+' || c=='-' || c=='/' || c=='^' || c=='*'){
            return true;
        }
        return false;
    }

    public Node constructExpressionTree(char expression[]){
            Stack<Node> st = new Stack<Node>();
            Node temp, t1,t2;
            for(int i=0;i<expression.length;i++){
                    if(isOperator(expression[i])){
                        temp = new Node(expression[i]);
                        t1 = st.pop();
                        t2 = st.pop();
                        temp.right = t1;
                        temp.left = t2;
                        st.push(temp);
                    }else{

                        temp = new Node(expression[i]);
                        st.push(temp);
                    }
            }
            
            temp = st.peek();
            st.pop();
            return temp;

    }

    public static void main(String args[]){
        ExpressionTree tree = new ExpressionTree();
        String input = "ab+ef*g*-";
        char [] expression = input.toCharArray();
        Node root = tree.constructExpressionTree(expression);
        System.out.println("Inorder");
        tree.inorder(root);
        System.out.println("Traversed");

    }
}