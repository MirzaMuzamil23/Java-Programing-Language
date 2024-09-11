public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Beer b = new Beer();
        b.eats();
        
    }
}

// Interface is a blue print of object
// Interface is a part of Absraction 

//Example 2 


interface Herbivors {

    void eats();
    
}

interface cornivors {
    void eats() ; 
    
}
class Beer implements Herbivors  , cornivors {

    public void eats(){
        System.out.println("Beer eat fish");
        System.out.println("Beer also eat Grass");
    }
}


// Example 2
interface cheesplayer {
    void moves();
} 

class Queen implements cheesplayer {
    public void moves(){
        System.out.println("up , down , left , diagonal(in all 4 dirn)");
    }
}
class rook implements cheesplayer {
    public void moves(){
        System.out.println("up , down , left");
    }
}
 