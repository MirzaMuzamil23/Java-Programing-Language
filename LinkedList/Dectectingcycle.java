public class Dectectingcycle {
    public static class Node {

        int data ; // Node of the Data
        Node next ; // Address of the next node

        public Node(int data) {
           this.data = data ;
           this.next = null ;
        }
    }
    public static Node head ;

    // Question # 03 (Detecting Cycle Of the Linked List)
  
    public static boolean isCycle(){ // Floyd's Cycle Finding Algo
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1 
            fast = fast.next.next; // +2 
            if (fast == slow) {
                return true ; 
            }
           
        }
        return false ;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head ;
        System.out.println(isCycle());
    }
}
