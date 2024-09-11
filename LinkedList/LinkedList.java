public class LinkedList {


    public static class Node {

        int data ; // Node of the Data
        Node next ; // Address of the next node

        public Node(int data) {
           this.data = data ;
           this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ; 
    public static int size ;
    
    // AddFirst New Node 
    public void addFirst (int data){
        // Step # 1 To create a new node 
        Node newnode = new Node(data);
        size++;

        // If Node is Null
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // Step # 2 To point new node of next is head
        newnode.next = head ;

        // Step # 3 New node is a head
        head = newnode ;
    }

    // Add Last Node
    public void AddLast (int data){
         // Step # 1 To create a new node
        Node newNode = new Node(data);
        size++;
        // If Node is Null
        if (head == null) {
            head = tail = newNode ;
            return ;
        }
         // Step # 2 To point new node of next is tail
        tail.next = newNode;
        // Step # 3 New node is a tail
        tail = newNode ;
    }

    // To Print the all node
    public void Print (){
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add in the middle 
    public void Add (int idex , int data){
        if (idex == 0 ) {
            addFirst(data);
            return;
        }
        // Create a new node 
        Node newnode = new Node(data);
        size++;
        Node temp = head ;
        int i = 0;
        while (i < idex - 1){
            temp = temp.next;
            i++;
        }
        // This is to break the chain 
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // Remove First Value 
    public int removefirst(){
        // Special case 
        if (size == 0 ) {
            System.out.println("LL is empty : ");
            return Integer.MIN_VALUE ;
        } else if (size == 1){
            int Value = head.data ;
            head = tail = null ;
            size = 0 ;
            return Value ;
        }
        // Remove Head
        int Value = head.data;
        head = head.next ;
        size --; 
        return Value ;

    }

    // Remove Last Value 
    public int removelast (){
        // Special case 
        if (size == 0) {
            System.out.println("LL is empty :");
            return Integer.MIN_VALUE ; 
        }else if (size == 1){
            int Value = tail.data;
            tail = null ;
            size = 0 ;
            return Value ;
        }
        // Triverse to the pervious 
        Node perv  = head ;
        for (int i = 0 ; i < size - 2 ; i++){
            perv = perv.next ;
        }
        // Remove last
        int Value = tail.data ; 
        perv.next = null ; 
        tail = perv ;
        size -- ;
        return Value ; 

    }

    // Question # 01 Iterative search (Find the key )
    public int Iterative_Search (int key){
        Node temp = head ;
        int i = 0 ; 
        while (temp != null) {
            if (temp.data == key) {
                return i ;
            }
            temp = temp.next;
            i++ ;
        }
        return -1 ;
    }

    // Question # 02 Reverse of the LinkedList
    public void Reverse (){
        Node prev = null;
        Node current = tail = head ;
        Node next ; 

        while (current != null) {
            next = current.next;
            current.next = prev ; 
            prev = current ;
            current = next ;
        }
        head = prev ; 
    }


    public static void main(String[] args) {
        // Object Creation of linkedlist 
        LinkedList LL = new LinkedList();
        
        
        LL.addFirst(2);
        LL.addFirst(1);
        LL.AddLast(3);
        LL.AddLast(4);
        LL.AddLast(5);
        // LL.Add(2, 9);
        LL.Print();
        // System.out.println("Size of the LL = "+ LL.size );
        // LL.removefirst();
        // LL.Print();
        // System.out.println(LL.size);
        // LL.removelast();
        // LL.Print();
        // System.out.println(LL.size);
        // System.out.println(LL.Iterative_Search(3));
        // System.out.println(LL.Iterative_Search(10));
        // LL.Reverse();
        // LL.Print();

        
   
    }
}
