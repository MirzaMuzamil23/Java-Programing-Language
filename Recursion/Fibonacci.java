package Recursion;

public class Fibonacci {

    // Find the nth Fibonacci Number
    static int Fibo(int n ){
        // Base Case 

        if (n == 0 || n == 1) {
            return n ; 
        }
        return Fibo(n-1) + Fibo(n-2);
        // OR 
        // Sub-problem 

        // int pre = Fibo(n-1);
        // int prePre = Fibo(n-2);

        // // Self Work

        // int add = pre + prePre ; 
        // return add ; 
    }

    public static void main(String[] args) {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println(Fibo(i));
        }
        
    }
}
