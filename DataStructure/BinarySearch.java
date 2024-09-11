public class BinarySearch {
    public static int Search (int number[] , int key){
        int start = 0 ; 
        int end = number.length-1;
        while (start <= end) {

            int mid = (start + end) / 2 ;
            if(number[mid] == key){
                return mid ;
            }
            if (number[mid] < key) {
                start = mid + 1 ;
            }else{
                end = mid -1 ;
            }
        }
        return -1 ;
    }

    public static void Reverse (int n[]){
        int first = 0 ; 
        int last = n.length - 1 ; 

        while (first < last) {
            int temp = n[first] ; 
            n[first] = n[last] ; 
            n[last] = temp ; 

            first++;
            last -- ;
        }
    }
    public static void Pair(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            int current = arr[i];
            for(int j = i + 1; j < arr.length ; j++){
                System.out.print("("+ current + " , " + arr[j] + " )");
            }
            System.out.println();
        }
    }

    public static void Subarray (int number[]){
        for(int i = 0 ; i < number.length ; i++){
            int start = i ; 
            for(int j = i ; j < number.length ; j++){
                int end = j ; 
                for(int k = start ; k <= end ; k++){
                    System.out.print(number[k] + "");
                }
                System.out.println();  
            }
            System.out.println();
        }
    }


    public static void main(Strings[] args) {
       int number[] = {2,4,5,6,7,8,9,20};
       int n[] = {2,4,6,8,10};
       int arr[] = {2,4,6,8,10};
       int key = 35 ; 
       System.out.println("Index Of The Key is : " + Search(number, key));
       Reverse(n);
       for(int i = 0 ; i < n.length ; i++){
        System.out.print(n[i] + " ");
       }
       Pair(arr);
       Subarray(number);
    }

}
