// import Scanner 
import java.util.Scanner;
// main class
public class Miller_A02Q4 {

    public static void main(String[] args) {
        //construct new Scanner Scan
        Scanner scan = new Scanner(System.in);
        //prompt user for year
        System.out.print("what year should be checked?(Year must be after 1581) ");
        // store user input as userYear
        int userYear = scan.nextInt();
        //check to see if year is divisible by 4 and atleast 1582
         if(userYear % 4 ==0 && userYear >= 1582){
             //check if year is divisible by 100 and not div by 400
             if (userYear % 100 == 0 && userYear % 400 !=0){
                 
                 System.out.print("That is not a leap year.");
                 //else
             }else{
                 System.out.print("That is a leap year.");
             }
             // print error for year under 1582
         }else if(userYear < 1582){
             System.out.print("Error value is less than 1582.");
             // not divisible by 4 
         } else{
             System.out.print("That is not a leap year.");
         }
         
        
    }
    
}
