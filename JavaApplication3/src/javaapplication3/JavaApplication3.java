/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Computer
 */
import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hours:");
        int hours = scan.nextInt();
        System.out.print("Enter Minutes:");
        int minutes = scan.nextInt();
        System.out.print("Enter seconds:");
        int seconds = scan.nextInt();
        
        int totalSec = (hours * 360)+(minutes * 60)+(seconds);
        
        System.out.println("The total Seconds is: "+ totalSec);
        
        // TODO code application logic here
    }
    
}
