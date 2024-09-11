public class Solidrombus {

    public static void solid_rombus( int n ){
        int Total_no_Line = 1 ; 
        int star = 5 ; 
        int space = n - 1 ; 

        while (Total_no_Line <= n ) {
            // space 
            for(int i = 1 ; i <= space ; i++){
                System.out.print(" ");
            }
            // star 
            for(int i = 1 ; i <= star ; i++){
                System.out.print("*");
            }
            // Next Line
            System.out.println();
            Total_no_Line ++ ; 
            space -- ;  
        }
        
    }

    public static void main(Strings[] args) {
        solid_rombus(5);
        
    }
}
