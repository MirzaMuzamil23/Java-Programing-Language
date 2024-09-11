package BinaryTree ; 

public class Height {

    static class Node {
        int data ; 
        Node left , right ; 

        Node (int data ){
            this.data = data ; 
            this.left = null ; 
            this.right = null ; 

        }
    }
    // Height Of the Tree

    public static int height (Node root){
        if (root == null) {
            return 0 ;  
        }
        int Lh = height(root.left);
        int Rh = height(root.right);
        return Math.max(Lh , Rh) + 1 ;
    }
    // Count Of the Tree

    public static int Count (Node root){
        if (root == null) {
            return 0 ;
        }
        int Lcount = Count(root.left);
        int Rcount = Count(root.right);
        return Lcount + Rcount +1 ;
    }
    // Sum of the Tree
    public static int Sum (Node root){
        if (root == null) {
            return 0 ;
        }
        int Lsum = Sum(root.left);
        int Rsum = Sum(root.right);
        return Lsum + Rsum + root.data ;
    }

    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        System.out.println(height(root));
        System.out.println(Count(root));
        System.out.println(Sum(root));
    }
}
