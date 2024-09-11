package ArrayList;
import java.util.ArrayList;

public class SwapNumber {

    static void Swap(ArrayList<Integer> List , int Ind1 , int Ind2){
        int temp = List.get(Ind1);
        List.set(Ind1, List.get(Ind2));
        List.set(Ind2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(4);
        List.add(5);
        List.add(7);
        List.add(9);
        int Ind1 = 1 , Ind2 = 4 ;
        System.out.println(List);
        Swap(List, Ind1, Ind2);
        System.out.println(List);
        




    }
}
