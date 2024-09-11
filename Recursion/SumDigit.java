package Recursion;

// Find out the sum of its digit using recurssion (1+2+3+4+5)

public class SumDigit {

    static int Sumofdigit(int n){
        // Base Case 
        if(n >= 0 && n <= 9){
            return n ; 
        }
        // Self work & Subproblem 

        return Sumofdigit(n/10) + (n%10);
    }
    public static void main(String[] args) {
        System.out.println("Sum Of Digit is : " + Sumofdigit(12345));
    }
    
}
