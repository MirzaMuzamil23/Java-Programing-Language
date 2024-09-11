import java.util.Scanner;

public class Basic{
    public static void main (Strings[] args){
      //Operater In Java 
      //Arithmetic Operater (Binary)
      Scanner sc = new Scanner(System.in);
      int a = 10 , b = 5;
      int Add = a+b;
      int multiply = a*b;
      int divide = a/b;
      int sub = a-b;
      float modulo = a%b;
      System.out.println("Add : "+ Add);
      System.out.println("Multiply : " + multiply);
      System.out.println("Divide : "+divide);
      System.out.println("Subtract : "+sub);
      System.out.println("Module : "+modulo);

      //Arithmetic Operater(unnary)
      int c = 10;
      int d = c--;
      System.out.println(c);
      System.out.println(d);

      // Relational Operater 
      int C = 5;
      int D = 50;
      System.out.println(C!=D);
      System.out.println(C<=D);
      System.out.println(C>=D);

      //Logical Operater 
      System.out.println("AND : " + ((C<D) && (C>D)));
      System.out.println("OR : " + ((C<D) || (C>D)));
      System.out.println("NOT : " + (!(C<D)));

      // Assigemnt Operater 
      int A = 10;
      int B = 5;
      //   A = A + 10 ;
      A += 10;
      B *= 5;
      A /= 10;
      System.out.println(A);
      System.out.println(B);

      int x,y,z;
      x=y=z=2;
      x+=y;
      y-=z;
      z /= (x+y);
      System.out.println(x + " " + y + " " + z);
      



    

      
       
    }
}