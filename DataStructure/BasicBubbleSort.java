import java.lang.reflect.Array;
import java.util.Arrays;

public class BasicBubbleSort {

    public static void bubblesort(int arr[]){
        for(int iteration = 0 ; iteration < arr.length - 1 ; iteration++){
            for(int j = 0 ; j < arr.length - iteration - 1 ; j++){
                if (arr[j] > arr[j+1]) {
                    // swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp ; 
                }
            }
        }
    }

    // public static void InsertionSort(int arr[]){

    //     for(int i = 0 ; i <= arr.length - 1 ; i++){
    //         int minposi_ = i ; 
    //         for(int j = i +1 ; j <= arr.length - 1 ; j++){
    //             if(arr[minposi_] > arr[i]){
    //                  minposi_ = i ; 
    //             }
    //         }
    //         int temp = arr[minposi_]; 
    //         arr[minposi_] = arr[i]; 
    //         arr[i] = temp ; 
    //     }
    //     for(int k = 0 ; k < arr.length ; k++){
    //         System.out.print(arr[k] + " ");
    //     }
    //     System.out.println();
    // }

    public static void printarr(int arr[]){
        for(int k = 0 ; k < arr.length ; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(Strings[] args) {
        int arr[] = {5,3,2,4,1};
        bubblesort(arr);
        printarr(arr);
        //InsertionSort(arr);

    }
    
}
