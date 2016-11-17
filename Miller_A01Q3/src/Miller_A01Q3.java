
// import Scanner Class
import java.util.Scanner;

public class Miller_A01Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Contruct new Scanner scan
        Scanner scan = new Scanner(System.in);
        // Below prompt for input and scans integer inputs
        System.out.print("Enter Hours:");
        int hours = scan.nextInt();
        System.out.print("Enter Minutes:");
        int minutes = scan.nextInt();
        System.out.print("Enter seconds:");
        int seconds = scan.nextInt();
        // store algorith as totalSec
        int totalSec = (hours * 3600)+(minutes * 60)+(seconds);
        
        System.out.println("The total Seconds is: "+ totalSec);
        
        
    }
    
}
