public class Abstraction {
    public static void main(String[] args) {
        mustang ms = new mustang();
        
        
    }
    
}

// Abstraction is hiding all the unnesseary data to the user and show important data to user 
// Abstract class 

abstract class Animal {

    // Constructor 
    Animal(){
        System.out.println("Animal Constructor Called : ");
    }

    void eat(){ // It is a non abstract function 
        System.out.println("They eats");
    }
    abstract void walk(); // abstract method is not specfic body they are depend (subclass)
    
}
// subclass

class horse extends Animal{
    horse(){
        System.out.println("Horse Constructor called : ");
    }
    void walk (){
        System.out.println("It has 4 legs");
    }
}
class mustang extends Animal {
    mustang(){
        System.out.println("Mustang constructor called : ");
    }
    void walk(){
        System.out.println("It has 4 leg ");
    }
}
class beer extends Animal {
    void walk (){
        System.out.println("It has 2 legs");
    }
}