import java.util.Scanner;

public class Conditional {
    public static void main (Strings[] args){

        Scanner sc = new Scanner(System.in);

       // Largest of two number

        // int A = 10;
        // int B = 25;
        // if (A>=B) {
        //     System.out.println("A is the largest of B : " + A );
        // }else{
        //     System.out.println("B is the largest of A : " + B);
        // }

        // // Check Aligable of licience

        // int age = 18;
        // if (age <= 18) {
        //     System.out.println("You are Aligiable for Licience : ");
        // }else{
        //     System.out.println("You are not Aligible for Licience : ");
        // }

        // // Check condition is even or odd 

        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        //     System.out.println("Even Number :");
        // }else{
        //     System.out.println("Odd Number : ");
        // }

        // // Tax Calculator 

        // int income = sc.nextInt();
        // int tax ;
        // if (income < 500000) {
        //    tax = 0;   
        // }
        // else if (income >= 500000 && income <= 1000000 ) {
        //     tax = (int) (income*0.2);
        // }
        // else{
        //     tax = (int) (income*0.3);
        // }
        // System.out.println("Your tax is : " + tax);

        // // Largest of three Number 

        // int a = 2;
        // int b = 4;
        // int c = 5;

        // if ((a > b) && (a > c)) {
        //     System.out.println("A is the largest element : ");
        // }
        // else if (b >c ){
        //     System.out.println("B is the largest element : ");
        // } 
        // else{
        //     System.out.println("C is the largest element : ");
        // } 

        // //ternary operater 
        // int mark = 20 ;

        // String number = ((mark >= 33) && (mark < 33)) ? "Pass" : "Fail"; 
        // System.out.println(number);

        // // Calculator (Switch)

        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+': System.out.println(x+y);
        //         break;
        //     case '-' : System.out.println(x-y);
        //         break;
        //     case '*' : System.out.println(x*y);
        //         break;
        //     case '/' : System.out.println(x/y);
        //         break;
        //     case '%' : System.out.println(x%y);
        //         break;
        //     default: System.out.println("Value Not Found : ");
        //         break;
        // }


        // Assigment Problem 
        // problem 1

        // int year = sc.nextInt();
        // if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
        //     System.out.println("Leap Year : ");
        // }
        // else{
        //     System.out.println("Not Leap Year : ");
        // }

        // // problem 2

        // int a = 63 ; 
        // int b = 34 ; 
        
        // boolean x  = (a < b ) ? true : false ; 
        // int y = (a > b ) ? a : b ;
        // System.out.println(x); 
        // System.out.println(y);

        // // problem 3 
        // System.out.println("Enter the day : ");
        // int number = sc.nextInt();
        // switch (number) {
        //     case 1: System.out.println("Monday");
        //         break;
        //     case 2: System.out.println("Tuesday");
        //         break;
        //     case 3: System.out.println("Wednesday");
        //         break;
        //     case 4 : System.out.println("Thusday");
        //         break;
        //     case 5 : System.out.println("Friday");
        //         break;
        //     case 6: System.out.println("Saturday");
        //         break;
        //     case 7: System.out.println("Sunday");
        //         break;
        //     default: System.out.println( "Week is not avaiable");
        //         break;
        // }
        // // problem 4 
        // double temp = 103.5;
        // if (temp > 100) {
        //     System.out.println("You have a fever : ");
        // }
        // else {
        //     System.out.println("you have not a fever : ");
        // }

        // // problem 5 

        // int num = sc.nextInt();
        // if (num >= 0){
        //     System.out.println("Positive :");
        // }
        // else {
        //     System.out.println("Negative : ");
        // }

        // paratice session 4 
        // Fizz Buzz Problem 

        // int n = sc.nextInt();

        // if ((n % 3 == 0) && ( n % 5 != 0)) {
        //     System.out.println("Fizz");            
        // }
        // else if ((n % 5 == 0) && (n % 3 != 0)){
        //     System.out.println("Buzz");
        // }
        // else if ((n % 3 == 0) && (n % 5 == 0)){
        //     System.out.println("FizzBuzz");
        // }
        // else{
        //     System.out.println("Not its Self");
        // }

        // Time Zone Problem 

        int day  = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();

        hour += 5 ; 
        min += 30 ; 

        if(min >= 60 ){
            hour ++ ;
            min -= 60 ;

        }
        if(hour >= 24 ){
            day ++ ;
            hour -= 24 ; 
        }
        System.out.println("Day : " + day + " Hour : " + hour + " Min : " + min );



    }
}
