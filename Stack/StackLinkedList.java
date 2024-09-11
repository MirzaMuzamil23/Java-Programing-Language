package Stack;

public class StackLinkedList {

    static class Node {
        int data ;
        Node next ;

        Node (int data){
            this.data = data ;
            this.next = null ;    
        }
    }

    static class Stack {

        static Node head = null ;

        public static boolean isEmpty(){
            return head == null ;
        }

        // Push
        public static void Push (int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode ;
                return ;
            }
            newNode.next = head ;
            head = newNode ;
        } 
        // Pop 
        public static int Pop(){
            if (isEmpty()) {
                return -1 ;
            }
            int top = head.data ;
            head = head.next ;
            return top ;

        }
        // Peeek 
        public static int Peek(){
            if (isEmpty()) {
                return -1 ;
            }
            return head.data ;
        }
        
    }
    public static void main(String[] args) {
        Stack St = new Stack() ;
        St.Push(1);
        St.Push(2);
        St.Push(3);

        while (!St.isEmpty()) {
            System.out.println(St.Peek());
            St.Pop() ;
        }
    }
}
