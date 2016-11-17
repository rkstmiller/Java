import java.util.Scanner;
//import Random
import java.util.Random;
//Main Class
public class Miller_A02Q5 {

    
    public static void main(String[] args) {
        // random to generate number
        Random gen = new Random();
        // setting compNumber to integers 1-100
        int compNumber = gen.nextInt(100)+1; 
        // creating new Scanner scan to receive input
        Scanner scan = new Scanner (System.in);
        //creating second scanner..not sure why this is necessary 
        // but it wouldn't work without it
        Scanner scan2 = new Scanner(System.in);
        // third scanner
        Scanner scan3 = new Scanner (System.in);
        // ask user for input
        System.out.print(" Would you like to play a guessing game?(Y or N) ");
        // read user input
        String play = scan.nextLine();
        //force upper case
        play = play.toUpperCase();
        //set guesses to 0
        int numberGuess = 0;
        // continue to play while play = yes. ( wish I could use play == "Y" like python
        while  ( play.equals("Y")){
            
            // prompt user for number
            System.out.print(" Please guess a number 1 to 100 ");
            // store useer guess
            int userGuess = scan.nextInt();
            // if correct guess
            if ( userGuess == compNumber){
                numberGuess+=1;
                System.out.println("Thats correct!You made "+ numberGuess+" guesses.");
                System.out.print("would you like to play again? ");
                numberGuess = 0;
                compNumber = gen.nextInt(100)+1;
                // reset play value
                play = scan2.nextLine();
                // force upper case again
                play = play.toUpperCase();
                // if user guess too low
            }else if(userGuess < compNumber && userGuess > 0){
                System.out.println("Thats too low");
                // increment guesses
                numberGuess += 1;
               // if user guess to high
            }else if(userGuess > compNumber){
                System.out.println(" That is too high");
                // increment guesses
                numberGuess += 1;
                // user escape
            }else if(userGuess == 0){
                 // prompt to play again       
                System.out.print("Would you like to play again?");
                play = scan3.nextLine();
                play = play.toUpperCase();
                numberGuess = 0;
                compNumber = gen.nextInt(100)+1;
                
            }
            
        }
    }
}
        
    
    


        