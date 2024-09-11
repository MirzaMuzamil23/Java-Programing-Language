package BinaryTree;

public class BinaryTreeB {

    static class Node {
        int data ; 
        Node left ; 
        Node right ; 

        Node (int data){
            this.data = data ;
            this.left = null ; 
            this.right = null ; 
        }
    }

        static class BinaryTree {
            static int index = -1 ; 
            public static Node buildtree (int node[]){
                index++ ; 
                if(node[index] == -1){
                    return null ; 
                }
                Node newNode = new Node (node[index]);
                newNode.left = buildtree(node);
                newNode.right = buildtree(node);
                return newNode ; 
            }
             // PreOrder Traversal 
             public static void PreOrder (Node root){
                if (root == null) {
                    return ;
                }
                System.out.print(root.data + " ");
                PreOrder(root.left);
                PreOrder(root.right);
            }

            // InOrder Traversal
            public static void InOrder (Node root){
                if (root == null) {
                    return ; 
                }
                InOrder(root.left);
                System.out.println(root.data + " ");
                InOrder(root.right);
            }

            // PreOrder 
            public static void PostOrder(Node root){
                if (root == null) {
                    return ; 
                }
                // Left Subtree
                PostOrder(root.left); 
                // Right Subtree 
                PostOrder(root.right);
                // Root
                System.out.println(root.data);
            }
    
        }
          
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(node);
        // tree.PreOrder(root);
        //tree.InOrder(root);
        tree.PostOrder(root);
    }
}
