public class Advncedpattern {

    public static void hallow_rectangle(int totalrow , int totalcoloum){
        // outer loop --- row
        for(int i = 1 ; i <= totalrow ; i++){
            // inner loop --- coloum
            for(int j = 1 ; j <= totalcoloum ; j++){
                // boundaries 
                if (i == 1 || i == totalrow || j == 1 || j == totalcoloum) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }

    // Inverted & Rotated Half-pyramid 

    public static void half_pyramid (int n ){

        // Outer loop --- Row
        for(int i = 1 ; i <= n ; i++){
            // Inner loop --- spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            // Inner loop --- Star 
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        
    }

    // Number Half-payramid 

    public static void number_pyramid(int num){
        // Outer loop --- Row
        for(int i = 1 ; i <= num ; i++){
            // Inner --- Number
            for(int j = 1 ; j <= num-i+1  ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    // Floyd's Triangle

    public static void floyd_triangle(int n , int counter){
        // Outer loop --- Row
        for(int i = 1 ; i <= n ; i++){
            // Inner loop --- Number 
            for(int j = 1 ; j <= i ; j++){
                System.out.print(counter + " ");
                counter++ ;
            }
            System.out.println();

        }
    }

    // 0 - 1 Triangle 
    public static void triangle(int n){
        // Outer Loop --- Row 
        for(int i = 1 ; i <= n ; i++){
            // Inner Loop 
            for(int j = 1 ; j <= i ; j++){
                if ((i+j) % 2 == 0 ) { // even 
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }System.out.println();
        }
    }


    public static void main (Strings[] args){

        hallow_rectangle(5,5);
        half_pyramid(4);
        number_pyramid(4);
        floyd_triangle(5 , 1);
        triangle(5);


    }
}
