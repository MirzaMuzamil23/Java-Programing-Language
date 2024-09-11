public class Constructor {
    public static void main(String[] args) {
        // costructor are created when the object is called : 
       car s1 = new car();
       s1.modelno = 1234;
       s1.colour = "Black";
       System.out.println(s1.modelno + " " + s1.colour);
       // Copy constructor object 
       car s2 = new car(); 
       s2.modelno = 2345;
       System.out.println(s1.colour + " " + s2.modelno );
      

    }
}

class car {
    String name ; 
    String colour ; 
    int modelno ; 

    // Copy Constructor 
    car(car s1){
        this.colour = s1.colour ; 
        this.name = s1.name ;
    }

    // constructor 
    // Non Parameterized 
    car (){
        System.out.println("This is non paramterized ctor");
    }
    // Parameterized ctro
    car(int modelno){
        this.modelno = modelno ;  
    }
    // Parameterized ctro
    car(String colour){
        this.colour = colour ; 
    }
}
