import java.util.*;
import java.io.*;

/**
 * Maze represents a maze of characters. The goal is to get from the
 * top left corner to the bottom right, following a path of 1's. Arbitrary
 * constants are used to represent locations in the maze that have been TRIED
 * and that are part of the solution PATH.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class Maze
{   private static String output="";
    private static final int TRIED = 2;
    private static final int PATH = 3;

    private int numberRows, numberColumns;
    private int[][] grid;

    /**
     * Constructor for the Maze class. Loads a maze from the given file.  
     * Throws a FileNotFoundException if the given file is not found.
     *
     * @param filename the name of the file to load
     * @throws FileNotFoundException if the given file is not found
     */
    public Maze(String filename) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File(filename));
        numberRows = scan.nextInt();
        numberColumns = scan.nextInt();
        // add a prompt for starting place
        System.out.println("Please enter the starting position"
                + "(two integers separated by space(x y)\n"
                +"min x value: 0\n"
                +"min y value: 0\n");
        //create a scanner to read user input
        Scanner userin = new Scanner(System.in);
        //set temp variables
        int a=userin.nextInt();
        int b=userin.nextInt();
        // add a prompt for ending place
        // I gave the user a prompt of how large their max size is
        // from a user standpoint throwing an exception still causes the program to fail
        //whereas if they exceed the max after I tell them what it is
        //they must want to fail.
        System.out.println("Please enter the ending position"
                + "(two integers separated by space(x y)\n"
                +"max x value: "+Integer.toString(numberColumns)+"\n"
                +"max y value: "+Integer.toString(numberRows)+"\n");
        //set temp variables
        int c=userin.nextInt();
        int d=userin.nextInt();        
        grid = new int[numberRows][numberColumns];
        for (int i = b; i < d; i++)
            for (int j = a; j < c; j++)
                grid[i][j] = scan.nextInt();
    }
        
    /**
     * Marks the specified position in the maze as TRIED
     *
     * @param row the index of the row to try
     * @param col the index of the column to try 
     */
    public void tryPosition(int row, int col)
    {
        grid[row][col] = TRIED;
        //build up a string with the path `
//        output +=Integer.toString(row) +","+Integer.toString(col)+"\n";
    }
    
    /**
     * Return the number of rows in this maze
     *
     * @return the number of rows in this maze
     */
    public int getRows()
    {
        return grid.length;
    }
    
    /**
     * Return the number of columns in this maze
     *
     * @return the number of columns in this maze
     */
    public int getColumns()
    {
        return grid[0].length;
    }
    
    /**
     * Marks a given position in the maze as part of the PATH
     *
     * @param row the index of the row to mark as part of the PATH
     * @param col the index of the column to mark as part of the PATH 
     */
    public void markPath(int row, int col)
    {
        grid[row][col] = PATH;

    }

    /**
     * Determines if a specific location is valid. A valid location
     * is one that is on the grid, is not blocked, and has not been TRIED.
     *
     * @param row the row to be checked
     * @param column the column to be checked
     * @return true if the location is valid    
     */
    public boolean validPosition(int row, int column)
    {
        boolean result = false;
 
        // check if cell is in the bounds of the matrix 
        if (row >= 0 && row < grid.length &&
            column >= 0 && column < grid[row].length)

            //  check if cell is not blocked and not previously tried 
            if (grid[row][column] == 1)
                result = true;
                
        return result;
    }
    public void setPath(int x, int y){
        this.output +=Integer.toString(x) +","+Integer.toString(y)+"\n";
    }
    //this is a method used to access the output attribute and print the path
    public void displayPath(){
        
        System.out.print(this.output+"\n");
    }
    /**
     * Returns the maze as a string.
     * 
     * @return a string representation of the maze
     */
    public String toString()
    {
        String result = "\n";

        for (int row=0; row < grid.length; row++)
        {
            for (int column=0; column < grid[row].length; column++)
                result += grid[row][column] + "";
            result += "\n";
        }

        return result;
    }
}