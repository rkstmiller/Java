/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AssignmentThree;
import static AssignmentThree.TestAccount.setUserId;
import java.util.*;
import java.text.*;
/**
 *
 * @author Computer
 */
// Super class account 
public class Account {
    
            public static void main(String[] args) {

               // set up savings 
               Saving userSaving = new Saving(TestAccount.setUserId(),TestAccount.setUserDeposit(),TestAccount.setUserInterest());
               //set up checking
               Checking userChecking = new Checking(TestAccount.setUserId(),TestAccount.setUserDeposit(),TestAccount.setUserInterest());
               
//               System.out.println(userSaving.accountID); for testing
//               System.out.println(userSaving.annualInterestRate); for testing
//               System.out.println(userSaving.getBalance()); for testing
//               System.out.println(userChecking.getBalance()); for testing
                // withdrawal from userSaving
               userSaving.withdrawal(TestAccount.userWithdrawal());
               //withdrawal from userChecking
               userChecking.withdrawal(TestAccount.userWithdrawal()); 
//               System.out.println(userSaving.getBalance()); for testing
//               System.out.println(userChecking.getBalance());  for testing  
               // deposit to user accounts
               userSaving.deposit(TestAccount.userDeposit());
               userChecking.deposit(TestAccount.userDeposit());
               // print account details
               System.out.println("Savings balance: " + userSaving.getBalance());
               System.out.println("Checking balance: " + userChecking.getBalance()); 
               System.out.println("Savings account created on: " + userSaving.getDateCreated());
               System.out.println("Checking account created on: " + userChecking.getDateCreated());
               System.out.println("Monthly saving interest total: " + userSaving.getMonthlyInterest());
               System.out.println("Monthly checking interest total: " + userChecking.getMonthlyInterest());                 
    }
     
    int accountID;
    double balance;
    double annualInterestRate;
    Date dateCreated;
    // cConstructor that takes no arguements
    Account(){
        accountID=0;
        balance=0;
        annualInterestRate=0;
        dateCreated= new Date((new Date().getTime()));    
    }
    // constructors that takes initital account info ID, beginiing balance, annual Interest rate
    Account(int ID,double startBalance, double annInterestRate){
        accountID=ID;
        balance=startBalance;
        annualInterestRate=annInterestRate;
        dateCreated= new Date((new Date().getTime()));         
        
        
    }
    // retrieve user ID
    int getID(){
        return this.accountID;
    }
    //Retrieve user balance
    double getBalance(){
        return this.balance;       
    }
    // retrieve interest rate
    double getInterestRate(){
        return this.annualInterestRate;
    }
    // retrieve date created
    Date getDateCreated(){
        return this.dateCreated;
    }
    // retrieve monthly interest
     double getMonthlyInterest(){
       return ((this.getBalance() * this.getInterestRate())/120);
   }
    // change account ID
    void setID(int ID){
        this.accountID = ID;
        
    }
    //change current balance
    void setBalance(double balance){
        this.balance=balance;
    }
    // change annual interest rate
    void setInterestRate(double interestRate){
        this.annualInterestRate = interestRate;
    }
    // withdrawal from account
    void withdrawal( double amount){
        this.balance = this.balance -amount;
    }
    //withdrawal integer amount
    void withdrawal( int amount){
        this.balance = this.balance - amount;
    }
    // deposit into account
    void deposit(double amount){
        this.balance= this.balance + amount;
    }
    // deposit integer into account
    void deposit(int amount){
        this.balance=this.balance +amount;
    } 
}













