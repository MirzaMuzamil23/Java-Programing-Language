package ArrayList;
import java.util.ArrayList ;

public class BasicArraylist {
    public static void main(String[] args) {
        // Java Collection Framework 
        //It is a collection of class and interfaces its help us to use the inbuilt Data-structued
        // <Classname> ObjName = new <Classname>();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<String> List2 = new ArrayList<>();
        
        // Add Operation 
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        System.out.println(List1);
        System.out.println(List2);

        System.out.println(List1.size());
        for (int i = List1.size() -1   ; i >=0; i--){
            System.out.print(List1.get(i) + " ");
        }
        
        
        // Get Operation 
        // int Get_Val = List1.get(0);
        // List2.get(1);
        // System.out.println(Get_Val);

        // Delete Operarion 
        // List1.remove(2);
        // System.out.println(List1);
        
        // Set Operation 
        // List1.set(2, 10);
        // System.out.println(List1);

        // Contains Operation 
        // System.out.println(List1.contains(9));
        // System.out.println(List1.contains(2));
    }
}
