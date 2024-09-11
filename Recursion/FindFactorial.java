package Recursion;

public class FindFactorial {

    // Find The Factorial Of The N Number 

    static int Factorial(int n){
        // Base Case 
        if (n == 0) {
            return 1 ;
        }
        // Assume & Self work 
        return n * Factorial(n-1);
    }

    public static void main(String[] args) {
       System.out.println(Factorial(5));
    }
}
