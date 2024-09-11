package Recursion;
import java.util.*;

public class Printincreasing {
    
// Write a programe to print all natural number form 1 to n using recursion (Question 1)

    static void PrintIncreasing(int n){


        // Base Case
        if(n == 1){
            System.out.println(n);
            return ; 
        }
        // Assumption 
        PrintIncreasing(n-1);
        // Self Work
        System.out.println(n);

    }

//  Write a programe to print all natural number form 1 to n using recursion (Question 2)

    static void PrintDecreasing (int n ){
        // Base Case 
        if(n == 1){
            System.out.println(1);
            return ; 
        }
        // Self Work 
        System.out.println(n);
        // Assume 
        PrintDecreasing(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        //PrintIncreasing(n);
        PrintDecreasing(n);
    }
}





