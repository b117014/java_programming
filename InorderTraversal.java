import java.util.Stack;

public class InorderTraversal {
    Node head;
    class Node{
        Node left;
        Node right;
        int data;
        Node(int item){
            data = item;
            left = null;
            right = null;
        }
    }
    void push(){
        head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.left.left = new Node(15);
        head.left.right = new Node(35);
        head.right.left = new Node(29);
    }

    void inorderTraversal(){
        Node temp = head;
        Stack<Node> st = new Stack<Node>();
        while(true){
            while(temp!=null){
                st.push(temp);
                temp = temp.left;
                
            }
            if(st.empty()){
                break;
            }
            temp = st.pop();
            System.out.println(temp.data);
            temp = temp.right;
        }
    }
    public static void main(String args[]){
        InorderTraversal IT = new InorderTraversal();
        IT.push();
        

        IT.inorderTraversal();
        

    }
}