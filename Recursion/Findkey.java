package Recursion;

public class Findkey {

    static void Linearsearch (int arr[] , int key , int start){
        // Base Case
        if (start == arr.length) return ;
        // Self Work
        if (arr[start] == key) {
            System.out.println(start);
        } 
        // Recursion Work
        Linearsearch(arr, key, start+1);
    }


    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40 , 20 , 3 , 4 , 20};
        Linearsearch(arr, 20, 0);
        
        
    }
    
}
