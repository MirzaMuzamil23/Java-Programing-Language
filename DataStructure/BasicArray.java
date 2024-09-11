import java.util.Scanner;

public class BasicArray {

    public static void Track (int mark[]){
    
        for(int i = 0 ; i < mark.length ; i++){
            mark[i] = mark[i] + 2 ; 
            System.out.println(mark[i]);
        }

    }
    public static void main(Strings[] args) {
        
        int mark[] = {63,45,67,78};
        Track(mark);

        // // Creation of Array 

        // int[] marks = new int[50] ;
        // int number[] ={1,2,3,4};
        // String name[] = { "ali" , "mubshir" , "wali"};

        // // Array lenght 
        // System.out.println(marks.length);

        // // Input / Output 

        // int[] mark = new int [20];
        // Scanner se = new Scanner(System.in);
        // mark[0] = se.nextInt();
        // mark[1] = se.nextInt(); 
        // mark[2] = se.nextInt(); 
        // System.out.println("Physic : " + mark[0]);
        // System.out.println("Math : " + mark[1]);
        // System.out.println("Chemistry : " + mark[2]);
    }
}

