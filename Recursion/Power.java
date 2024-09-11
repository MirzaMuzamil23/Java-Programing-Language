package Recursion;


public class Power {

     // Given two number p & q . find the value p ^ q using recursive function
    //  static int pow (int p , int q){
    //     // Base case 
    //     if (q == 0 )  
    //         return 1 ;
    //     // Recursive work & Self Work 
    //     return pow (p , q - 1) * p ; 
        
    // } 

    // Optimized Code 
    static int pow (int p , int q){
        // Base Case 
        if(q == 0) return 1 ; 
        // Check even or odd 
        int smallpow = pow(p, q/2); 
        if (q % 2 == 0){
            return smallpow * smallpow ;
        }
        return p * smallpow * smallpow ; 
    }

    public static void main(String[] args) {
        
        System.out.println(pow(5, 4));
        
    }
}
