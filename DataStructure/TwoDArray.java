import java.util.Scanner;

public class TwoDArray {

    static boolean search(int matrix[][] , int key){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("Matrix Found At Cell (" + i + "," + j + ")");
                    return true ; 
                } 
            }
        }
        System.out.println("Matrix Cell Was Not Found : ");
        return false ; 
    }
    




    public static void main(Strings[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length ; int m = matrix[0].length ; 
        Scanner scn = new Scanner(System.in); 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = scn.nextInt(); 
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = scn.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 8);
    }
}
