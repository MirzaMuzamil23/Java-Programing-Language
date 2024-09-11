import java.util.Scanner;

public class Function {
    public static void printpen(){
        System.out.println("This is my pen : ");
        System.out.println("This is my pen : ");
        System.out.println("This is my pen : ");
        System.out.println("This is my pen : ");
        
    }
    public static int printsum(int num1 , int num2){
        
        int sum = num1 + num2;
        System.out.println("The Sum of : " + sum);
        return sum; 
    }

    public static int product (int a , int b){  // formal Paratmeter
        int product = a * b ;
        System.out.println("The product of a & b is : " + product);
        return product; 
    }
    public static int factorial (int n){
        int f = 1 ;
        for(int i = 1 ; i <= n ; i++){
            f = f * i ;
        }
        return f ; 
    }

    // Binomial cofficient 

    public static int bicoff(int n , int r ){

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bicoff = fact_n / (fact_r * fact_nmr);
        return bicoff ; 
    }

    // Check prime or not 
    public static boolean isprime(int num){

        if (num == 2) {
            return true ; 
        }
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if (num % i == 0) {
                return false ; 
            }
        }
        return true; 
    }
    public static void primerange(int n){

        for(int i = 2 ; i <= n ; i++){
            if (isprime(i)) {
                System.out.print(i +  " ");
            }
    }
    System.out.println();
}
    // Binary to decimal Conversion :::

    public static void binarynum (int binary){
        int mynum = binary;
        int pow = 0 ;
        int dec = 0 ; 

        while (binary > 0) {
            int Ld = binary % 10 ; // last digit
            dec = dec + (Ld * (int)Math.pow(2, pow));
            pow ++ ; 
            binary = binary / 10 ;
            
        }
        System.out.println("Decimal of : " + mynum + " " + dec);
    }
    // Decimal To Binary 

    public static void Dctbn (int decimalnum){
        int nu = decimalnum ; 
        int pow = 0 ; 
        int binarynum = 0 ;

        while (decimalnum > 0 ) {

            int rem = decimalnum % 2 ;
            binarynum = binarynum + (rem * (int)(Math.pow(10, pow)));
            pow ++ ;
            decimalnum = decimalnum / 2 ; 
        }
        System.out.println("Decimal Number of : " + nu + " = " + binarynum);


    }


    public static void main (Strings[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(3));
        System.out.println(bicoff(5, 2));
        System.out.println(isprime(10));
        primerange(20);
        binarynum(101);
        Dctbn(5);
    }

}
