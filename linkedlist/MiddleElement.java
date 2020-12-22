package linkedlist;

public class MiddleElement {

    public static class  Node{
        int info;
        Node next;
        Node( int info){
            this.info = info;
            next = null;
        }
    }

    public static int middle(Node node){
        if(node == null){
            return -1;
        }
        Node slow_ptr = node;
        Node fast_ptr = node;
        while(slow_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr =slow_ptr.next;
        }

        return slow_ptr.info;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.next = new Node(5);
        root.next.next = new Node(6);
        System.out.print(middle(root));
    }
    
}