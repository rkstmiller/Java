/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentThree;

/**
 *
 * @author Computer
 */
// Saving class inherited from Account
public class Saving extends Account{
    //Constructor with no arguements
    Saving(){
        super();
        
    }
    // constructor that overrides super class with 3 arguments
    Saving(int ID,double startBalance, double annInterestRate){
        
        super(ID,startBalance,annInterestRate);
        
    }
    
    
    // withdrawal 
    void withdrawal(double amount){
        if(this.balance - amount >= 0){
            this.balance = this.balance-amount;
        }
    }
        // withdrawal
        void withdrawal(int amount){
        if(this.balance - amount >= 0){
            this.balance = this.balance-amount;
        }
    }

}

