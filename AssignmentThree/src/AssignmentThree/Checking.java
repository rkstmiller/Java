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
// Class chekcing inherits from Account
public class Checking extends Account{
    // constructor with no arguements
    Checking(){
        super();
    }
    // contructor that ovverrides super with 3 arguments
    Checking(int ID,double startBalance, double annInterestRate){
        
        super(ID,startBalance,annInterestRate);
        
    }
    
    // withdrawal
    void withdrawal(double amount){
        if(this.balance - amount >= -5000){
            this.balance = this.balance-amount;
        }
    }
        //withdrawal
        void withdrawal(int amount){
        if(this.balance - amount <= 5000){
            this.balance = this.balance-amount;
        }
    }
    


}
