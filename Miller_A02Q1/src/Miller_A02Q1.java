
// need the scanner utility
import java.util.Scanner;

public class Miller_A02Q1 {
    
    

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        // get input for x1 from user
        System.out.print("What is your x1: ");
        double x1 = scan.nextDouble();
        // get inout for y1 from user
        System.out.print("What is your y1: ");
        double y1 = scan.nextDouble();  
        // get input for x2 from user
        System.out.print("What is your x2: ");
        double x2 = scan.nextDouble();
        // get input for y2 from user
        System.out.print("What is your y2: ");
        double y2 = scan.nextDouble();            
        // formula for distance
        double distance = Math.sqrt((Math.pow((x2-x1),2))+ (Math.pow((y2-y1),2)));
        // print solution to screen
        System.out.print("The distance is: " + distance);
    }
    
}
