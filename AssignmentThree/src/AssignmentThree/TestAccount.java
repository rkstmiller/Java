/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentThree;

import java.util.Scanner;

/**
 * This class has methods to prompt users for account information to be used in 
 * in conjunction with the   other classes in this package.
 * @author Computer
 */

public  class TestAccount {
            
            public static void main(String[] args) {


            

        // TODO code application logic here
    }
      // This is to prompt the user for their account ID      
    public static int setUserId(){
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter your account ID");
         int ID=(scan.nextInt());
         return ID;
         
    }
      // Ask user for initial deposit
    public static double setUserDeposit(){
         Scanner scan =new Scanner(System.in);
         System.out.println("Please enter your initial deposit amount");
         double initBal =(scan.nextDouble());
         return initBal;
         
    }
      // Allow user to set there own interest rate...wish my bank did this
    public static double setUserInterest(){

         Scanner scan =new Scanner(System.in);
         System.out.println("Please enter your interest rate");
         double intRate = (scan.nextDouble());
         return intRate;
         
     }
    // Ask user for withdrawal amount
    public static double userWithdrawal(){

         Scanner scan =new Scanner(System.in);
         System.out.println("Please enter the amount you would like to withdrawal");
         double userWithdrawal = (scan.nextDouble());
         return userWithdrawal;      
      
    }
    //Ask user for deposit amount
    public static double userDeposit(){

         Scanner scan =new Scanner(System.in);
         System.out.println("Please enter the amount you would like to deposit.");
         double userDeposit = (scan.nextDouble());
         return userDeposit;          
    }
}
