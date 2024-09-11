public class Static {
    public static void main(String[] args) {
        Student stu = new Student(); 
        stu.name = "Rahul"; 
        stu.rollno = 2345; 
        stu.schoolname = "CPS";
    }
}

// Static keyword in java is used to share the same variable or method of a given class
// proerties , Method  , Nested class , Blocks

class Student {
    int rollno ; 
    static String schoolname ;
    String name ; 

    void setst (String school){
        this.schoolname = school; 
    }
     
    String getst (){
        return schoolname ; 
    }
}