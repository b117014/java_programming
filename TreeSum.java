

class Node{
    Node left, right;
    int data;
    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}

class TreeSum{
    Node root;
    public static void main(String args[]){
        TreeSum tree = new TreeSum();
        tree.root = new Node(10); 
        tree.root.left = new Node(-2); 
        tree.root.right = new Node(6); 
        tree.root.left.left = new Node(8); 
        tree.root.left.right = new Node(-4); 
        tree.root.right.left = new Node(7); 
        tree.root.right.right = new Node(5);
        tree.toSumTree(tree.root);
        tree.traverse(tree.root);

            
    }

    int toSumTree(Node tree){
        if(tree == null){
            return 0;
        }
        int old_node = tree.data;

        tree.data = toSumTree(tree.left) + toSumTree(tree.right);
        return tree.data + old_node;
    }

    void traverse(Node tree){
        if(tree == null){
            return ;
        }
        traverse(tree.left);
        System.out.println(tree.data);
        traverse(tree.right);
    }
}