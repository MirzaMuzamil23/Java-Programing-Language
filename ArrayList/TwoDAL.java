package ArrayList;

import java.util.ArrayList;

public class TwoDAL {
    public static void main(String[] args) {
    
        // It is called a Arraylist Of ArrayLiist OR (2D Array )
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList <Integer> List1 = new ArrayList<>();
        ArrayList <Integer> List2 = new ArrayList<>();
        List1.add(1); List1.add(3); List1.add(5);
        List2.add(6); List2.add(1); List2.add(2);
        MainList.add(List1); MainList.add(List2);

        for(int i = 0 ; i < MainList.size(); i++){
            ArrayList<Integer> Curr_List = MainList.get(i);
            for(int j = 0 ; j < Curr_List.size(); j++){
                System.out.print(Curr_List.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(MainList);

    }
    
}
