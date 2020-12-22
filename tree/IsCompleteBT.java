package tree;
import java.util.*;

public class IsCompleteBT {

    public static class Node{
        int info;
        Node left,right;
    }

    public static Node newNode(int n){
        Node node = new Node();
        node.info = n;
        node.left = null;
        node.right = null;
        return node;
    }
    // check every parent and child differene is 1 or not.

    public static boolean isComplete(Node root){
            if(root == null){
                return true;
            }
            if(root.right ==null && root.left == null)
                return true;
            if(root.left == null){
                return Math.abs(root.info - root.right.info) == 1 && isComplete(root.right);
            }
            if(root.right == null){
                return Math.abs(root.info-root.left.info) == 1 && isComplete(root.left);
            }

            return Math.abs(root.info - root.left.info)==1 && Math.abs(root.info - root.right.info)==1 && isComplete(root.left) && isComplete(root.right);
    }

    public static void main(String args[]){
        Node root = newNode(3);
        root.left = newNode(2);
        root.right = newNode(4);
        System.out.println(isComplete(root));
    }
}