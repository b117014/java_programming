package tree;

import java.util.*;

import java.lang.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
public class IsBST {
    Node root;
     

    public Boolean checkBst(Node node, int min, int max){
        if(node == null){
            return true;
        }
        if(node.data < min || node.data>max){
            return false;
        }
        return (checkBst(node.left, min, node.data-1) && checkBst(node.right, node.data+1, max));
    }
    public static void main( String args[]){
        IsBST bst = new IsBST();

        bst.root = new Node(5);
        bst.root.left = new Node(3);
        bst.root.right= new Node(10);
        
        System.out.println(bst.checkBst(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}