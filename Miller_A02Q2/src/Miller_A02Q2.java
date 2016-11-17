// import the Scanner utility
import java.util.Scanner;

public class Miller_A02Q2 {


    public static void main(String[] args) {
        // create new Scanner named scan
        Scanner scan = new Scanner(System.in);
        // get input for s from user
        System.out.print("What is s: ");
        double s = scan.nextDouble();
        // get inout for a from user
        System.out.print("What is a: ");
        double a = scan.nextDouble();  
        // get input for b from user
        System.out.print("What is b: ");
        double b = scan.nextDouble();
        // get input for c from user
        System.out.print("What is c: ");
        double c = scan.nextDouble();            
        // formula for area
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        // print solution to screen
        // formatted to 3 decimal places
        System.out.printf("The area is: %.3f", area);
    }
    
    }
    

