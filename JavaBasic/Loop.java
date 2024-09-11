import java.util.Scanner;

public class Loop {
    public static void main (Strings[] args){

        Scanner sc = new Scanner(System.in);

        // // while Loop 
        // // print number 1 to 10 

        // int number = 1;
        // while (number <= 10) {
        //     System.out.print(number + " ");
        //     number++;
        // }
        // System.out.println( );

        // // print number 1 to n 

        // int n = sc.nextInt();
        // int count = 1;
        // while (count <= n ) { 
        //     System.out.print(count + " ");
        //     count++;
        // }
        // System.out.println();

        // // sum of n natural number 

        // int N = sc.nextInt();
        // int sum = 0; 
        // int i = 1;
        // while (i <= N ) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println("Sum is : " + sum );

        // // print Reverse of a number 

        // int a = 12345;

        // while (a > 0 ) {
        //     int lastdig = a % 10 ; 
        //     System.out.print(lastdig);
        //     a = a / 10 ;
        // }
        // System.out.println( );
        
        // Reverse the given number 

        // int n = 10899 ; 
        // int rev = 0 ;

        // while (n > 0) {
        //     int lastdigit = n % 10 ; 
        //     rev = (rev * 10 ) + lastdigit ;
        //     n = n / 10;
            
        // }
        // System.out.println(rev);

        // // For-Loop 
        // // Square pattern 

        // for( int Line = 1 ; Line <= 4 ; Line++ ){
        //     System.out.println("****");
        // }
        // System.err.println();

        // // Check if number is prime or not 

        // int N = sc.nextInt();
        // if ( N == 0 ){
        //     System.out.println("n is a prime");
        // }else{
        //     boolean isprime = true;

        //     for (int i = 2 ; i <= Math.sqrt(N) ; i++){
        //         if (N % i == 0 ) {
        //             isprime = false;
        //         }
        //     }
        //     if (isprime == true) {
        //         System.out.println("n is a prime");
        //     }else{
        //         System.out.println("n is not a prime");
        //     }
        // }

        // problem 4 

        int n = sc.nextInt();
        int i = 1 ; 
        int k = 10 ; 

        while (i <= k ) {
           int j  =  n*i ;
           System.out.println(n + " * " + i + " = " + j);
           i++ ; 

        }
        
        






    }
}

