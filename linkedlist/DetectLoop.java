package linkedlist;

import java.util.HashSet;

public class DetectLoop {

    static Node head;
    public static class Node{

        Node next;
        int info;
        Node(int info){
            this.info = info;

        }

    }

    public void addNode(int info){
        Node temp = new Node(info);
        temp.next = head;
        head  = temp;
    }
    public boolean isloop(Node root){
        
        // by using Hashset we can easily detect loop in linked list
        // Hashset object follwed the hashing properties and store the key in unique place
        // Duplicate items could not be stored in Hashset
        // .contains() method is used to check whether the key are available or not. returns type is boolean.

        HashSet<Node> h = new HashSet<Node>();
        if(root == null){
            return false;
        }
        while(root!=null){
            if(h.contains(root)){
                return true;
            }
            h.add(root);
            root = root.next;
        }
        return false;
    }

    public static void main(String args[]){
        DetectLoop lp =new DetectLoop();
        lp.addNode(1);
        lp.addNode(2);
        lp.addNode(3);
        lp.addNode(4);
        lp.addNode(5);
        lp.head.next.next.next.next.next = lp.head;
        System.out.println(lp.isloop(lp.head));

    }

    
}