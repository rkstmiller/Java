
package Miller_A01Q3;


import java.util.Scanner;
// import Scanner
public class Miller_A01Q2 {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        // store kelvin
        //construct new Scanner scan
        Scanner scan = new Scanner(System.in);
        //Initialize conversion in integer variable base
        final double base = 254.93;
        // printing the prompt using print so user input will be on same line
        System.out.print("Please enter your temperature in Fahreheit: ");
        // get input as double from user
        double input = scan.nextInt();
        // Algorithm for conversion stored a variable output
        double output = input + base;
        // print input and output
        System.out.println("Farhenheit temperature is: " + input);
        System.out.println("Temperature in Kelvin is: "+ output);
        
        
        
    }
    
}
