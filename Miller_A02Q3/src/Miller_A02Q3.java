
// import Scanner 
import java.util.Scanner;
//import Random
import java.util.Random;
//Main Class
public class Miller_A02Q3 {


    public static void main(String[] args) {
        // Initiating face value( not actually necessary)
        int FaceValue = 1;
        // creating a new Randome named dice
        Random dice = new Random();
        // setting facevalue to integers 1-6
        FaceValue = dice.nextInt(6)+1; 
        // creating new Scanner scan to receive input
        Scanner scan = new Scanner (System.in);
        //Prompt user for input on dice number
        System.out.print("How many dice would you like to roll? ");
        //assign user input to dieNum
        int dieNum = scan.nextInt(); 
        //prompting user for number to add
        System.out.print("What should be added to the result? ");
        //assign user value to numAdd
        int numAdd = scan.nextInt(); 
        //Initializing userNum for the for statement
        int userNum = 0;
        //Roll the die the selected amount of times
        for(int i = 1; i < dieNum ; i++){
            userNum += FaceValue;
        }
        // add user numAdd to total 
        userNum += numAdd;
        // print results 
        System.out.print("The result of rolling "+dieNum+"D+"+numAdd+" is "+userNum);
    }
    
        
    
    

       
    
    
    

        
    
    
    
        
        
        
  
        
    
}

    

