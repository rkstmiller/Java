/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miller_a01q1;

/**
 *
 * @author Computer
 */
import java.util.Scanner;

public class Miller_A01Q1 {

    public static final int NUM = 2;
    // I changed this to 2 and modified the if statement below
    // anything divided by one will have a remainder of 0
    // which would cause everything to be odd
    //Runtime
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);       
	int input, result;
        
	System.out.print("Enter an integer number:");
        /* I didn't understand your spacing hint. It appears to me that the 
        output is correct with one space on both sides of input. The only 
        place I saw a difference was that there may not have been a space 
        for the string above. So I removed it.
        Additional I changed println to print so the input would remain on the 
        line
        */
        input = scan.nextInt();
        // needed to scan integers and not strings
        // which is runtime
	
        // is there an advantage to storing this in a variable
        //As opposed to in the if statement?
	result = input % NUM;
        // I think I may have corrected a syntax error here missing';'
        
        // needed to use the comparator '==' and not assignment'='
        // which is syntax
	if (result == 0) {
		System.out.print("\n\nNumber " + input + " is even.");
	}
        /* 
        Is there a reason to use the 'else if' as opposed to simply 'else'
        in this case? Since we do not have a way to handle incorrect entries?
        */
        
	else if (result != 0) {
		System.out.print("\n\nNumber " + input + " is odd.");
	}
    }    
}
    
    

