
public class OOPS {   
    public static void main(String[] args) {
        Student st = new Student(); // Each class has access to create an object : 
        st.setname("Muzammil Baig");
        st.setfname("Ashraf Baig");
        System.out.println(st.name);
        System.out.println(st.Fname);

        BankAcount bnk = new BankAcount(); 
        bnk.setpassward(12345);
        System.out.println(bnk.getpassward());
        bnk.setemail("abc@gmail.com");
        System.out.println(bnk.getem());
     
        
    }
    
}
   

    // Access Modifiers 

    class BankAcount{
        public String username ; 
        public String email ; 
        private int pincode ; 

        int getpassward (){ // Getter 
            return this.pincode ; 
        }
        String getem (){ // Getter
            return this.email ; 

        }
        String getuser (){
            return this.username ; 
        }
        void setpassward(int pwd){ // Setter
            this.pincode = pwd ; 
        }
        void setemail(String em){ // Setter 
            this.email = em ; 
        }
        

    }



class Student { // Each class has a Properties and Function : 
    // properties 
    String name ; 
    String Fname ; 
    int age ; 
    String grade ; 
    int persentage ; 

    // Fuction 

    void setname (String newname){
        name = newname ; 
    }
    void setfname (String newfname){
        Fname = newfname ; 
    }
    

}
