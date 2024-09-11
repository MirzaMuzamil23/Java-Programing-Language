import java.util.Scanner;

public class Strings {

    static void printstring(String Str){
        for(int i = 0 ; i < Str.length() ; i++){
            System.out.print(Str.charAt(i) + " ");
        }
        System.out.println();
    }


    static boolean ispalandrom(String str){

        for(int i = 0 ; i < str.length()/2 ; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false ; 
            }
        }
        return true ; 
    }

    // Shortest Path Of Destination : 
    static float shortestpath (String path){
        int x = 0 , y = 0 ; 
        for(int i = 0 ; i < path.length(); i++){
            char dir = path.charAt(i); 
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else if (dir == 'E'){
                x++;
            }
            else {
                y--;
            } 
        }
        int x2 = x*x ; 
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }

    // Substring : 

    static String Substring (String Str , int st , int en){
        String substr = ""; 
        for(int i = st ; i<en ; i++){
            substr += Str.charAt(i);
        }
        return substr ; 

    }




    public static void main(String[] args) {
        // Input in String

        // Scanner Scn = new Scanner(System.in);
        // String name = Scn.nextLine();
        // System.out.println(name);

        // Concatenation 

        // String Firstname = "Muzammil" ; 
        // String Lastname = "Baig" ; 
        // String FullName = Firstname + " " + Lastname ; 
        // System.out.println(FullName);

        // Lenght();--- This is function Lenght 
        // CharAt() ; ---- This is Give you a Number of the character 

        // String Firstname = "Mirza Muzammil";
        // String Lastname = "Baig" ; 
        // String FullName = Firstname + Lastname ; 
        // System.out.println(FullName.length());
        // System.out.println(Firstname.charAt(6));
        // printstring(FullName);
        
        String str = "noon"; 
        System.out.println(ispalandrom(str));
        String path = "WNEENESENNN";
        System.out.println(shortestpath(path));
        String Str = "HelloWorld";
        System.out.println(Substring(Str, 0, 4));


        // String Builder 

        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a' ; ch<='z'; ch++){
        //     sb.append(ch);
            
        // }
        // System.out.println(sb);

        // String are Immutable : 

        String s1 = "hello";
        String s2 = "hello"; 
        String s3 = new String("hello");

        if(s1.equals(s3)){
        System.out.println("s1 and s2 are equal :");
        }
        
    }

    
   

}
