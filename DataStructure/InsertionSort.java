public class InsertionSort {

    static void insertionSort(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            int j = i ; 
            while (j > 0 && arr[j] < arr[j-1]) {
                //swaping 
                int temp = arr[j];
                arr[j] = arr[j-1]; 
                arr[j-1] = temp;  
                j--;
            }  
        }
    }
    public static void printarr(int arr[]){
        for(int k = 0 ; k < arr.length ; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(Strings[] args) {
        int arr[] = { 5,6,4,3,1,2} ;
        insertionSort(arr);
        printarr(arr);
    }
}
