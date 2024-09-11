package ArrayList;
import java.util.ArrayList;

public class MaxAL {
    public static void main(String[] args) {
        // [1,5,7,9,0]

        ArrayList<Integer> Val = new ArrayList<>();
        Val.add(1);
        Val.add(5);
        Val.add(7);
        Val.add(9);
        Val.add(0);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < Val.size() ; i++){
            if (max < Val.get(i)) {
                max = Val.get(i);
            }
        }
        System.out.println(max + " ");
    }
}
