public class Encapsulation {
    // It is wrappaping up the data(properties) and method(Function) through single unit . 
    // It is called data hidding using access Modifiers

    public static void main(String[] args) {
        Student std = new Student(); 
        std.setname("muzammil");
        std.setseat(182345);
        System.out.println(std.Name);
        System.out.println(std.SeatNo);
    }
}

class Student {
    String Name ; 
    int SeatNo ; 

    void setname(String name){
        this.Name = name ; 
    }

    void setseat(int seat){
        this.SeatNo = seat ; 
        
    }
     
}
