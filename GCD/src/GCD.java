
import java.util.*;


public class GCD {

// This handles the user interfacing. It essentially takes inputs from the user
//and allows the user to input all of the pairs to be used in the GCD function
//each time a loop is executed it concatenates a large string that is output once 
    //the user has completed all entries.
    public static void main(String[] args) {
       String finalOut ="";
       int[] outArr = new int[3];
       Scanner scn = new Scanner(System.in);
       System.out.println("How many number would you like to compare");
       int userCompare = scn.nextInt();
       for(int i =0;i<userCompare;i++){
           System.out.println(" Please enter the first number");
            outArr[0] = scn.nextInt();
            System.out.println("Please enter the second number");
            outArr[1] = scn.nextInt();
            outArr[2]= setGCD(outArr[0],outArr[1]);
            finalOut+= toString(outArr);
       }
    System.out.print(finalOut);
        
    
    
    
    } //check for GCD and return lcd. This function courtesy of Euclid essentially 
    // repetitively takes the mod until b finally equals 0. Take note that this also
    //accepts negative values and hence the Math.absolute since a negative GCD does not exist.
    public static int setGCD(int a, int b){
        if(b==0){
            return Math.abs(a);
        }else{
           return Math.abs(setGCD(b,a%b)); 
        }
            
        }
         
    // this function converts the values in an array to a string.
    //****Note this function only handles arrays with a length of 3.
    // all indexes larger than 3 will be ignored. 
    public static String toString(int[]userVals){
        String num1 = String.valueOf(userVals[0]);
        String num2 = String.valueOf(userVals[1]);
        String gcdSt = String.valueOf(userVals[2]);
        
        return "Number 1: "+ num1 +" Number2: "+ num2 +" GCD: "+ gcdSt+"\n";
        
        }
        
        
    }
    


