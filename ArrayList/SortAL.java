package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class SortAL {
    public static void main(String[] args) {
        
        ArrayList<Integer> Sort = new ArrayList<>();
        Sort.add(5);
        Sort.add(3);
        Sort.add(6);
        Sort.add(7);
        Sort.add(1);
        System.out.println(Sort);
        Collections.sort(Sort); // Asending Order
        System.out.println(Sort);
        Collections.sort(Sort , Collections.reverseOrder()); // Decending Order
        System.out.println(Sort);

    }
}
