public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); 
        System.out.println(cal.sum(2, 5));
        System.out.println(cal.sum((float)2.4,(float)3.5));

        // Deer de = new Deer(); 
        // de.eat();
    }
}




// Compile Time polymorphism (Method overloading)
// A Function the are same name but different types (Datatype) and parameter

class Calculator {
    int sum (int a , int b ){
        return a + b ; 
    }
    float sum (float a , float b  ){
        return a + b ; 
    }
}

// Run Time polymorphism (Method overriding)
// The function that are same name but different defination 

// class Animal {
//     void eat(){
//         System.out.println("They eat anything : ");
//     }
// }

// class Deer extends Animal {
//     void eat(){
//         System.out.println("They eat only fish : ");
//     }
// }