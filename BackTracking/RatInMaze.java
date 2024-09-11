package BackTracking;

 // Rat In a Maze Using Recurssion in [2 Direction] -> Right & Down 

public class RatInMaze {

    public static void Maze (int sr , int sc , int er , int ec , String str){
        // Base Case
        if (sr > er || sc > ec) 
        return ;
        if (sr == er && sc == ec) {
            System.out.println(str);
            return ;
        }
        // Recurssion
        // Go Right
        Maze(sr, sc+1, er, ec, str +"R");
        // Go Down 
        Maze(sr+1, sc, er, ec, str +"D");
    }
    public static void main (String[] args){
        int row = 3 ;
        int col = 3 ;
        Maze (1 , 1 , row , col ," " );
    }
}
