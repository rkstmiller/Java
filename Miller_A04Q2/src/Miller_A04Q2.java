import java.util.Scanner;
import java.io.*;


public class Miller_A04Q2 {

  
    public static void main(String[] args) throws IOException {
        
        // declare variables
        String file = "calledUserStrings.txt";
        String userString = "bob";
        //contruct new Scanner object
        Scanner scan = new Scanner(System.in);
        // write to external file constructors
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);
        // Accept user input line by line and print to file calledUserStrings.txt
        while(!userString.equals("DONE")){
            System.out.print("Please enter a string ");
            userString = scan.nextLine();
            if(!userString.equals("DONE"))
            outFile.println(userString);
        }
        // close the file
        outFile.close();
        // prompt user of completion
        System.out.println("Output file has been created " + file);
            
        
    }
        
        
    }
    
