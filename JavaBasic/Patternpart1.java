public class Patternpart1 {
    
    public static void main ( Strings[] args){

        // Pattern # 01 

        for(int line = 1 ; line <= 5 ; line++){
            for(int star = 1 ; star <= line ; star++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");


        // pattern # 02 
        // Inverted Star pattern 

        for (int line = 4 ; line >= 1 ; line--){
            for(int star = 1 ; star <= line ; star++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        // pattern # 03 
        // Half pyramid pattern 

        int n = 4 ;
        for(int line = 1 ; line <= n ; line++){
            for(int num = 1 ; num <= line ; num ++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        // pattern # 04
        // character pattern
        
        int N = 5 ;
        char ch = 'A' ; 

        for(int line = 1 ; line <= N ; line++){
            for(int character = 1 ; character <= line ; character++){
                System.out.print(ch + " ");
                ch++;
            }System.out.println();

        }

    }
}
