import java.util.Scanner;
/*
 *  Sarah Robinson
 *  August 9, 2026
 *  CSCI A506 Final Project-Maze Game
 * 
 *  This is the class that houses the main method responsible for running the maze game
 */
public class Main {

   public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Maze m = new Maze();
        m.display();
        System.out.println("Use wasd to move. Move the * to the F position");
        boolean win = false;
        
        //continues to loop until checkwin returns false
        while(win == false)
        {
            System.out.println("Enter move:");
          String dir = scan.nextLine();
    
    
            if (dir.equals("w"))
            {
                m.moveUp();
            }
            else if(dir.equals("a"))
            {
                m.moveLeft();
            }
            else if(dir.equals("d"))
            {
                m.moveRight();
            }
            else if(dir.equals("s"))
            {
                m.moveDown();
            }
            m.display();
            win = m.checkWin();  
            }
        
        
    }

}
