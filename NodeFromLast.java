import java.util.Scanner;


public class NodeFromLast {
   
    Node list;
    class Node{
        Node next;
        int data;
        Node(int item){
            data = item;
            next = null;
        }
     }

    void push(int data){
        Node temp = new Node(data);
        temp.next = list;
        list = temp;
    }
    int fromLastNode(int n){
        int len = 0;
        Node temp = list;
        if(temp == null) {
            return -1;
        }
       
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        temp = list;
        if(n>len) return -1;
        for(int i=1;i<(len-n+1);i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("enter number of node");
        int n = in.nextInt();

        System.out.println("enter data into node");
        NodeFromLast obj = new NodeFromLast();

        for(int i=0;i<n;i++){
            int t = in.nextInt();
            obj.push(t);
        }
        System.out.println("Enter the index");
        int k = in.nextInt();
        System.out.println(obj.fromLastNode(k));
        in.close();

    }
}