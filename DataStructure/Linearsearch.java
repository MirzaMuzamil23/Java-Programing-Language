public class Linearsearch {

    // Largest And Smallest Value in Array : 

    public static int largest_element (int Number[] ){
        int largest =  Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE; 

        for(int i = 0 ; i < Number.length ; i++){
            if (largest < Number[i]) {
                largest = Number[i] ; 
            }
            if (Smallest > Number[i]) {
                Smallest = Number[i]; 
            } 
        }
        System.out.println("Smallest Number Of Array is  : "+ Smallest);
        System.out.println("Largest Number Of Array is : "+largest);
        return largest ;
        
    }
    public static void main(Strings[] args) {
        
        int[] Number = {1,3,5,6,8,90,88,55};
        largest_element(Number);
        
        
        
    }
}
