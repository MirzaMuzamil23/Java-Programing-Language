public class Inheritance {
    public static void main(String[] args) {
        Fish dolfin = new Fish(); 
        dolfin.eat();
        dolfin.breath();


    }
}

// Types of Inheritance 
// Single Level 
// Multi Level 
// Herarchial Level 
// Hybrid Level 

// Parents or Base class 
class Animal {
    String colour ;

    void eat(){
        System.out.println(" Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}

class Fish extends Animal{
    int fins ;
    
    void swim(){
        System.out.println("Fish are swims");
    }
}
