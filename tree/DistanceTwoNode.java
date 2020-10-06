package tree;

public class DistanceTwoNode {

    class Node{
        Node left,right;
        int key;
        Node(int k){
            key = k;
            left= null;
            right = null;
        }

    }

    static int treeLevel(Node root, int key, int level){
        if(root == null) return -1;
        if(root.key == key) return level;
        int lev = treeLevel(root.left, key, level+1);
        return (l!=-1) ? l: treeLevel(root.right, key, level+1);

    }
    
}