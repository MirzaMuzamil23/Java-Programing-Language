package Recursion;

public class Occurence {

    // Find the First Occurence of the given key 

    static int FirstOccurence (int arr[] , int key , int i ){
        // Base Case
        if(i == arr.length){
            return -1 ; 
        } 
        // Sub problem 
        if(arr[i]== key){
            return i ; 
        }
        // Self work 
        return FirstOccurence(arr , key , i+1);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,5};
        System.out.println("First Occurence : " + FirstOccurence(arr, 5, 0));
    }
    
}
