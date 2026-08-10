/*
 *  Sarah Robinson
 *  August 9, 2026
 *  CSCI A506 Final Project-Maze Game
 * 
 *  This is the class that creates the Maze for the maze game
 */
public class Maze {
    
    final String OPEN = "_";
    final String WALL = "#";
    final String FINISH = "F";
    
    String [] grid;
    int rows;
    int cols;
    Location current;
    Location finish;
    
    // constructs a new maze to start at 0,0 and have a default of 10 rows and 10 cols
    // mazes are constructed by first generating a path, then giving every other spot in the maze a small chance of being open and larger chance of being wall
    public Maze()
    {
        
    }
    
    // constructs a new maze to start at 0,0 and have 10 rows 10 cols
    public Maze()
    {
        
    }
    
    // returns grid as a string with line breaks to show a visual representation of the maze
    public String toString()
    {
        
    }
    
    // method to moveLeft(). checks if the position to the left is open returns true if successful in moving left, false otherwise and remains in the same position
    public boolean moveLeft()
    {
        
    }
    
    // method to moveRight(). checks if the position to the right is open returns true if successful in moving right, false otherwise and remains in the same position
    public boolean moveRight()
    {
        
    }
    
    // method to moveUp(). checks if the position above is open returns true if successful in moving up, false otherwise and remains in the same position
    public boolean moveUp()
    {
        
    }
    
    // method to moveDown(). checks if the position below is open returns true if successful in moving down, false otherwise and remains in the same position
    public boolean moveDown()
    {
        
    }
    
    
    // checks if player has reached the end, this method is called in the move methods
    public boolean checkWin()
    {
        
    }
   
    
}
