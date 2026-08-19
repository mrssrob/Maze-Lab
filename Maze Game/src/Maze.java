/*
 *  Sarah Robinson
 *  August 9, 2026
 *  CSCI A506 Final Project-Maze Game
 * 
 *  This is the class that creates the Maze for the maze game
 *  contains methods to display the maze, move the current location left, right, up, down, and checkswin
 */
public class Maze {
    
    final String CURRENT = "*";
    final String OPEN = "_";
    final String WALL = "#";
    final String FINISH = "F";
    
    String [][] grid;
    int rows;
    int cols;
    Location current;
    Location finish;
    
    // constructs a new maze to start at 0,0 and have a default of 10 rows and 10 cols
    // mazes are constructed by first generating a path, then giving every other spot in the maze a small chance of being open and larger chance of being wall
    public Maze()
    {
        
        rows = 10;
        cols = 10;
        grid = new String[rows][cols];
        current = new Location(0,0);
        
        
        grid[0][0]=CURRENT;
        
        //this section of the code creates a maze path in grid
        int curRow = 0;
        int curCol = 0;
        for(int i = 0; i<(rows * cols)/5; i++)
        {boolean assigned = false;
            while(assigned ==false)
            {
                //random number to determine if the next location in path will be up/down/left/right
                int rand = (int)(Math.random()*4);
                
                //up
                if(rand ==0 && curRow-1 >= 0)
                {
                    curRow -=1;
                    assigned = true;
                }
                //right
                else if (rand == 1 && curCol+1<grid[0].length)
                {
                    curCol+=1;
                    assigned = true;
                } 
                //down
                else if (rand == 2 && curRow+1<grid.length)
                {
                    curRow+=1;
                    assigned = true;
                }
                //left
                else if (rand == 3 && curCol-1>=0)
                {
                    curCol-=1;
                    assigned = true;
                }

            }
                grid[curRow][curCol] = OPEN;
                
        }
        //once the maze path is determined, the finish is labeled in the grid array and the finish variable is initialized
        grid[curRow][curCol]=FINISH;
        finish = new Location(curRow, curCol);
        
        //fills the rest of the grid randomly with open spaces and walls
        for(int r = 0; r<grid.length; r++)
        {
            for(int c = 0; c<grid[0].length; c++)
            {
                if(grid[r][c]==null)
                {
                    if(Math.random()>.15)
                    {
                        grid[r][c] = WALL;
                    }
                    else
                    {
                        grid[r][c] = OPEN;
                    }
                }
                
            }
        }
        grid[0][0]="*";
    }
    
    // constructs a new maze to start at 0,0 and have r rows c cols
    public Maze(int row, int col)
    {
        rows = row;
        cols = col;
        grid = new String[rows][cols];
        current = new Location(0,0);
        
        
        grid[0][0]=CURRENT;
        
        //this section of the code creates a maze path in grid
        int curRow = 0;
        int curCol = 0;
        for(int i = 0; i<(rows * cols)/5; i++)
            {boolean assigned = false;
                while(assigned ==false)
                    {
                        int rand = (int)(Math.random()*4);
                        if(rand ==0 && curRow-1 >= 0)
                            {
                                curRow -=1;
                                assigned = true;
                            }
                        else if (rand == 1 && curCol+1<grid[0].length)
                            {
                                curCol+=1;
                                assigned = true;
                            } 
                        else if (rand == 2 && curRow+1<grid.length)
                            {
                                curRow+=1;
                                assigned = true;
                            }
                        else if (rand == 3 && curCol-1>=0)
                            {
                                curCol+=1;
                                assigned = true;
                            }
          
                        }
                        grid[curRow][curCol] = OPEN;
                     
            }
        //once the maze path is determined, the finish is labeled in the grid array and the finish variable is initialized
        grid[curRow][curCol]=FINISH;
        finish = new Location(curRow, curCol);
        
        //fills the rest of the grid randomly with open spaces and walls
        for(int r = 0; r<grid.length; r++)
        {
            for(int c = 0; c<grid[0].length; c++)
            {
                if(grid[r][c]==null)
                {
                    if(Math.random()>.15)
                    {
                        grid[r][c] = WALL;
                    }
                    else
                    {
                        grid[r][c] = OPEN;
                    }
                }
                
            }
        }
        grid[0][0]="*";
    }
    
    // outputs grid as a string with line breaks to show a visual representation of the maze
    public void display()
    {
        for (String[] r: grid)
        {
            for (String i: r)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    
    // method to moveLeft(). checks if the position to the left is open returns true if successful in moving left, false otherwise and remains in the same position
    public boolean moveLeft()
    {
        if (current.col-1>=0 && !grid[current.row][current.col-1].equals(WALL))
        {
            grid[current.row][current.col] = OPEN;
            current.col-=1;
            grid[current.row][current.col]= CURRENT;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // method to moveRight(). checks if the position to the right is open returns true if successful in moving right, false otherwise and remains in the same position
    public boolean moveRight()
    {
       if (current.col+1<grid[0].length && !grid[current.row][current.col+1].equals(WALL))
        {
            grid[current.row][current.col] = OPEN;
            current.col+=1;
            grid[current.row][current.col]= CURRENT;
            return true;
        }
        else
        {
            return false;
        } 
    }
    
    // method to moveUp(). checks if the position above is open returns true if successful in moving up, false otherwise and remains in the same position
    public boolean moveUp()
    {
        if (current.row-1>=0 && !grid[current.row-1][current.col].equals(WALL))
        {
            grid[current.row][current.col] = OPEN;
            current.row-=1;
            grid[current.row][current.col]= CURRENT;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // method to moveDown(). checks if the position below is open returns true if successful in moving down, false otherwise and remains in the same position
    public boolean moveDown()
    {
        if (current.row+1<grid[0].length&& !grid[current.row+1][current.col].equals(WALL))
        {
            grid[current.row][current.col] = OPEN;
            current.row+=1;
            grid[current.row][current.col]= CURRENT;
            return true;
        }
        else
        {
            return false;
        } 
    }
    
    
    // checks if player has reached the end, this method is called in the move methods
    public boolean checkWin()
    {
        if (current.row==finish.row && current.col==finish.col)
        {
            System.out.println("You made it!");
           return true; 
        }
        else
        {
            return false;
        }
        
        
    }
   
    
}
