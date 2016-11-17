
import java.util.*;

public class Miller_A04Q1 {

   
    public static void main(String[] args) {
        
        fiveDoubles test = new fiveDoubles();
        test.getUserInput();
        System.out.print("The average is: "+ test.getAverage());
        
        
    }

    /** this Class takes 5 numbers as doubles and outputs the average.
     * The program catches Number Format Exceptions and lets the user know 
     * that the entry must be a number
     */
    public static class fiveDoubles{
        private double numAverage;
        private double listSum;
        private String entryString;
        private double entryDouble;
        private int count;
        
        
        
        
    //Constructor    
        public fiveDoubles(){
            count=0;
            
        }
    /** This takes the input from the user, checks the validity of the input and 
     * sums up the numbers.
     */    
        public void getUserInput(){
            Scanner scan = new Scanner(System.in);

            while(count < 5){
                try{
                    System.out.print("Please enter a number:");
                    entryString = scan.nextLine();                 
                    entryDouble = Double.parseDouble(entryString);
                    //System.out.println("EntryDouble: "+entryDouble); used for testing
                    listSum += entryDouble;
                    //System.out.println("listSum: "+listSum);used for testing
                    count++;
                   // System.out.println("count: " +count);used for testing
               
                } 
                catch (NumberFormatException exception){
                    System.out.println("That was not a number");
                }    
            }
            
        }
        //Didn't see value in creating this method so I took it out
        // averages the user numbers
        //public void setAverage(){
           //numAverage = listSum/5.0;
            
            
        
    // returns the average of user numbers
        public double getAverage(){
            numAverage = listSum/5.0;
            return numAverage;
        }
        
    }
}    
    
    
    
    
    
    
    
    
    
    
    
    

